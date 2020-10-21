/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        for(Employee employee : employees){
            employeeMap.put(employee.id, employee);
        }
        
        return getImportanceHelper(employeeMap, id);
    }
    
    private int getImportanceHelper(Map<Integer, Employee> employeeMap, int rootId){
        int sum = employeeMap.get(rootId).importance;
        
        if(employeeMap.get(rootId).subordinates.isEmpty()) return sum;
        
        for(Integer subordinate : employeeMap.get(rootId).subordinates){
            sum += getImportanceHelper(employeeMap, subordinate);
        }
        
        return sum;
    }
}