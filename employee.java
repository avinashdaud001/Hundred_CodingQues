public class employee {
    private int emp_id;
    public void setEmp_id(int emp_id){
        this.emp_id=emp_id;
    }
    public int getEmp_id(){
       return emp_id;
    }



    public static void main(String[] args) {
       employee avi=new employee();
       avi.setEmp_id(2555);
       avi.getEmp_id();
        System.out.println(avi.getEmp_id());
    }

}
