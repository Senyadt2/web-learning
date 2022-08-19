//array
public class{
    public static void main(String []args)
    {
        A obj = new A();
        obj.loaddata();
        obj.display();



    }
}

class A{

    int a[]={1,2,3,4,5,6,7,8,9};
    //declaration of linear array
    int xy[]=new int[10];
   
    public void loaddata()
    {
        xy[0]=0;
        for(int i=0;i<9;i++)
        {
            xy[i]=xy[i-1]*2;

        }
    }


    public void display()
    {
        for(int i=0;i<9;i++)
        {
            System.out.println(xy[i]);
        }
    } 

}