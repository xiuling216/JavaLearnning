package JavaReflect;
 
class Hello15{
    public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("JavaReflect.PersonA");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //�������еĽӿ�
        Class<?> intes[]=demo.getInterfaces();
        for (int i = 0; i < intes.length; i++) {
            System.out.println("ʵ�ֵĽӿ�   "+intes[i].getName());
        }
    }
}