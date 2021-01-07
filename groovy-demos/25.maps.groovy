
//spreading a map

def personalDetails=[
                name:'Vivek Dutta Mishra', 
                phone:'9293939393', 
                email:'vivek@gmail.com', 
                bloodGroup:'AB+'
            ]

def employeeDetails=[
                        empId:108, salary:1 , 
                        //to spread personal details here
                        *:personalDetails,

                        //but I dont' want to use personal email 
                        email:'vivek@company.com'
                        
                    ]



assert employeeDetails.empId==108
assert employeeDetails.bloodGroup=='AB+'
assert employeeDetails.email=='vivek@company.com' //personal email id is replaced with company id










println 'end of tests'



