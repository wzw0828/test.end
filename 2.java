interface iShape03{   
    public void show();  
    public int area(); 
}
interface iColor{
    public void showColor();
}
class CWin implements iShape03,iColor{
    protected int width;
    protected int height;
    protected String color;
    public CWin(int w,int h,String str){
        width=w;
        height=h;
        color=str;
    }
    public void show(){
        System.out.println("width="+width);
        System.out.println("height="+height);
        System.out.println("area="+area());
    }
    public int area(){
        return width*height;
    }
    public void showColor(){
        System.out.println("color="+color);
    }
}
public class j2{
    public static void main(String arg[]){
        CWin win=new CWin(5, 7, "Green");
        win.showColor();
        win.show();
    }
}
