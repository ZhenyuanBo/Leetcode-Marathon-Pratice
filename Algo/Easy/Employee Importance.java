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
        Queue<Employee> queue = new LinkedList<Employee>();
        int totalImportance=0;
        
        queue.add(emFinder(employees, id));
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                Employee em = queue.poll();
                totalImportance += em.importance;
                if(em.subordinates.size()>0){
                    for(Integer sub: em.subordinates){
                        Employee e = emFinder(employees, sub);
                        queue.add(e);
                    }
                }
            }
        }
        
        return totalImportance;
    }
    private Employee emFinder(List<Employee> employees, int id){
        Employee e = null;
        for(Employee em: employees){
            if(em.id == id){
                e = em;
                break;
            }
        }
        return e;
    }
}