package file.dol.sn;  
  
import java.io.File;  
  
public class FileDemo {  
  
    public static void main(String[] args) {  
  
        File dirFile = new File("C:\\TEST");  
        showDir(dirFile,0);  
    }  
    public static void showDir(File dir,int level)  
    {  
        System.out.println(printSpace(level)+"<d>"+dir.getName());  
        level += 2;  
        File[] file = dir.listFiles();  
        for (File f : file)  
        {  
            //递归进入所有非隐藏文件夹  
            if (f.isDirectory() && !f.isHidden())  
                showDir(f,level);  
            //打印文件名  
            else  
                System.out.println(printSpace(level)+"<f>"+f.getName());  
        }  
    }  
    //实现分层次打印，补充空格  
    public static StringBuffer printSpace(int level)  
    {  
        StringBuffer space = new StringBuffer();  
        for (int i = 0; i < level; ++i)  
        {  
            space.append(" ");  
        }  
        return space;  
    }  
}  