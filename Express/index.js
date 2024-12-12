import express from 'express';
import { establishConnection } from './src/config/DbConflig.js';
import { saveEmployee } from './src/controllers/EmployeeController.js';
import EmployeeRouter from './src/router/EmployeeRouter.js';


const APP=express();
APP.use(express.json());
APP.use("/employee",EmployeeRouter);

//employee,company,admin,project
//100 routes for each ->400 routes

APP.listen(4003,()=>{
    console.log("server running");
    establishConnection();

})