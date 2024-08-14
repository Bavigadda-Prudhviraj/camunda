print("user object inside initializeDepartment  :: " + JSON.stringify(userObj));
print("user2 object inside initializeDepartment :: " + JSON.stringify(userObj2));
print("user3 object inside initializeDepartment :: " + JSON.stringify(userObj3));
//("user3 object inside initializeDepartment :: " + JSON.stringify(userObj5)); // to test input variable
print("user3 object using execution Object inside initializeDepartment :: " + JSON.stringify(userObj4));
print("user3 object using execution Object inside initializeDepartment using execution.getVariable() :: " + JSON.stringify(execution.getVariable("userObj4")));

var obj = {
    id : 1,
    name : 'IT'
}
print("Department Object :: "+ JSON.stringify(obj));