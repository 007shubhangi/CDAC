import { createConnection } from "mysql";

export function createConnectionObject(){
    const connectionConfigObj=createConnection({
        host:"localhost",
        password:"cdac",
        database:"mydb",
        user:"root"
    })
    return connectionConfigObj;
}


export function establishConnection(){
    const Obj=createConnectionObject();
    Obj.connect((error)=>{
        if(error){
            console.log(error);
        }
        else{
            console.log("sucesfully connected to database");
        }
    })
}