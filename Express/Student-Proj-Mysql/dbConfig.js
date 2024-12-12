import {createConnection} from 'mysql';
function getConnectionObject(){
    const connectionConfig=createConnection({
        host:"localhost",
        user:"root",
        password:"cdac",
        database:"mydb"
    });
    return connectionConfig;
}
export function createDatabase(){
    getConnectionObject();
    
    connectionConfig.connect((error)=>{
        if(error){
            console.log(error);
        }
        else{
            console.log("connect to database sucessfully");
        }
    })
}
