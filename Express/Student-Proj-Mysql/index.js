import express from 'express';
import mysql from 'mysql';
//import {createDatabase} from './dbConfig.js'
const connectionConfig=mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"cdac",
    database:"mydb"
});

const APP=express();
APP.use(express.json());

const StudentData=[];

APP.post("/student-register",(req,res)=>{
    try{
    const data=req.body;
    //StudentData.push(data);
    connectionConfig.query(`insert into student values (${data.id},'${data.name}',${data.marks},'${data.phone}')`,(error,result)=>{
        if(error){
            console.log(error);
            res.status(500).send("something went wrong");
        }
        else{
            console.log(result);
            res.status(201).send({message:"new student registeded sucessfullyy"});
        }
    });
    }
    catch(error){
        res.status(500),send({message:"something went wrong"});
    }
});

APP.get("/fetchData",(req,res)=>{
    try{
        res.status(200).send(StudentData);
    }
    catch(error){
        res.status(5001).send("Sorry something went wrong not able to fetch data")
    }
});

//to get details of student have matching id
APP.get("/fetchData/:id",(req,res)=>{
    try{
        const id=parseInt(req.params.id)
        const student=StudentData.find(s=>s.id===id);
        res.status(200).send(student);
    }
    catch(error){
        res.status(500).send("student not found")
    }
})


APP.listen(2001,(req,res)=>{
    console.log("server running");
    //createDatabase();
    connectionConfig.connect((error)=>{
        if(error){
            console.log(error);
        }
        else{
            console.log("connect to database sucessfully");
        }
    })
})