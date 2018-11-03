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
	HashMap<Integer, Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap();
        if(employees == null) return 0;
        for(Employee e : employees){
        	map.put(e.id, e);
        }
        return dfs(id);
    }
    private int dfs(int id){
    	Employee employee = map.get(id);
    	int res = employee.importance;
    	for(int subId : employee.subordinates){
    		res += dfs(subId);
    	}
    	return res;
    }
}