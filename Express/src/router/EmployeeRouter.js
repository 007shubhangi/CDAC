import { Router } from "express";
import { saveEmployee } from "../controllers/EmployeeController.js";
const employeeRouter=Router();

employeeRouter.get("/",(req,res)=>{
    res.send("welcome to employee crud")
}) 

//to insert data
employeeRouter.post("/register",saveEmployee);

export default employeeRouter;