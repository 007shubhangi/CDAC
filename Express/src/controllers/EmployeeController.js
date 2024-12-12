import { createConnectionObject } from "../config/DbConflig.js";

const connection=createConnectionObject();

export  function saveEmployee (req,res){
    try{
        const data=req.body;
        const insertquery=`insert into employee values(${data.id},'${data.name}',${data.salary},'${data.department}','${data.phone}')`;
        connection.query(insertquery,(error,result)=>{
            if(error){
                console.log(error);
                res.status(500).send("employee not registered");
            }
            else{
                console.log(result);
                res.status(200).send("successfully employee registered");
            }
        })
    }
    catch(error){
        res.status(500).send("error registerring emp");
    }
}