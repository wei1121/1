package youxi;
import java.util.Scanner;
public class youxi {
	String name;//姓名
	int price;//价格
	float hp; //血量
    int moveSpeed; //移动速度
	  
	    void keng(){
	        System.out.println("坑队友！");
	    }
	   
	    void Speed(int speed){
	        moveSpeed = moveSpeed + speed;  //在原来的基础上增加移动速度
	    }
	      
	    void legendary(){
	        System.out.println("超神了！");
	    }
	     
	    float getHp(){
	        return hp;//获取当前的血量
	    }

	    void Blood(float blood){
	        hp = hp+blood;//回血
	    }
	public static void main(String[] args) {
	youxi a = new youxi();
	a.name="血瓶";
	a.price=50;
	
	youxi b= new youxi();
	b.name="草鞋";
	b.price=300;
	
	youxi c= new youxi();
	c.name="长剑";
	c.price=350;
	
	youxi d = new youxi();
    d.name= "盖伦";
    d.hp  = 500;
    
    System.out.println(d.name + " 当前的血量是 " +d.hp);
    System.out.println("回血100");
    d.Blood(100);
    System.out.println("现在的血量是:" + d.hp);
	}

}
