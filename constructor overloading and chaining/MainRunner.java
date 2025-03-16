public class MainRunner
{
    public static void main(String[] args) 
    {
        Baloon b1 = new Baloon();
        Baloon b2 = new Baloon("Red");
        Baloon b3 = new Baloon("Blue", 5);
        Baloon b4 = new Baloon("Green", 7, true);
        Baloon b5 = new Baloon("Yellow", 10, false, "Oval");
        Baloon b6 = new Baloon("Pink", 8, true, "Round", 0.5);
        Baloon b7 = new Baloon("Purple", 6, false, "Heart", 0.3, "Latex");
        System.out.println("**********************************************");		

        Holi h1 = new Holi();
        Holi h2 = new Holi("Holi");
        Holi h3 = new Holi("Holi", "March 25");
        Holi h4 = new Holi("Holi", "March 25", "India");
        Holi h5 = new Holi("Holi", "March 25", "India", true);
        Holi h6 = new Holi("Holi", "March 25", "India", true, 2);
        Holi h7 = new Holi("Holi", "March 25", "India", true, 2, "Festival of Colors");
		System.out.println("**********************************************");
		
		Pichkari p1 = new Pichkari();
        Pichkari p2 = new Pichkari("Water Gun");
        Pichkari p3 = new Pichkari("Water Gun", 500);
        Pichkari p4 = new Pichkari("Water Gun", 500, "Blue");
        Pichkari p5 = new Pichkari("Water Gun", 500, "Blue", 30.5);
        Pichkari p6 = new Pichkari("Water Gun", 500, "Blue", 30.5, true);
        Pichkari p7 = new Pichkari("Water Gun", 500, "Blue", 30.5, true, "Plastic");
		System.out.println("**********************************************");

        Color c1 = new Color();
        Color c2 = new Color("Red");
        Color c3 = new Color("Red", "Organic");
        Color c4 = new Color("Red", "Organic", true);
        Color c5 = new Color("Red", "Organic", true, "Bright");
        Color c6 = new Color("Red", "Organic", true, "Bright", 200);
        Color c7 = new Color("Red", "Organic", true, "Bright", 200, "India");
		System.out.println("**********************************************");
		
		Egg e1 = new Egg();
        Egg e2 = new Egg("Chicken");
        Egg e3 = new Egg("Chicken", 50);
        Egg e4 = new Egg("Chicken", 50, "White");
        Egg e5 = new Egg("Chicken", 50, "White", false);
        Egg e6 = new Egg("Chicken", 50, "White", false, "Farm");
        Egg e7 = new Egg("Chicken", 50, "White", false, "Farm", 12);
		System.out.println("**********************************************");

        Bucket bk1 = new Bucket();
        Bucket bk2 = new Bucket("Plastic");
        Bucket bk3 = new Bucket("Plastic", 10);
        Bucket bk4 = new Bucket("Plastic", 10, "Blue");
        Bucket bk5 = new Bucket("Plastic", 10, "Blue", true);
        Bucket bk6 = new Bucket("Plastic", 10, "Blue", true, 30);
        Bucket bk7 = new Bucket("Plastic", 10, "Blue", true, 30, "Cylindrical");
		System.out.println("**********************************************");
		
		Tomato t1 = new Tomato();
        Tomato t2 = new Tomato("Cherry");
        Tomato t3 = new Tomato("Cherry", 50);
        Tomato t4 = new Tomato("Cherry", 50, "Red");
        Tomato t5 = new Tomato("Cherry", 50, "Red", true);
        Tomato t6 = new Tomato("Cherry", 50, "Red", true, "Farm");
        Tomato t7 = new Tomato("Cherry", 50, "Red", true, "Farm", 12);
		System.out.println("**********************************************");

        WaterBall w1 = new WaterBall();
        WaterBall w2 = new WaterBall("Rubber");
        WaterBall w3 = new WaterBall("Rubber", 15);
        WaterBall w4 = new WaterBall("Rubber", 15, "Blue");
        WaterBall w5 = new WaterBall("Rubber", 15, "Blue", true);
        WaterBall w6 = new WaterBall("Rubber", 15, "Blue", true, 200);
        WaterBall w7 = new WaterBall("Rubber", 15, "Blue", true, 200, "Sphere");
		System.out.println("**********************************************");
		
		Gun g1 = new Gun();
        Gun g2 = new Gun("Water Gun");
        Gun g3 = new Gun("Water Gun", "Plastic");
        Gun g4 = new Gun("Water Gun", "Plastic", 20);
        Gun g5 = new Gun("Water Gun", "Plastic", 20, true);
        Gun g6 = new Gun("Water Gun", "Plastic", 20, true, "Blue");
        Gun g7 = new Gun("Water Gun", "Plastic", 20, true, "Blue", 500);
		System.out.println("**********************************************");

        NailPolish n1 = new NailPolish();
        NailPolish n2 = new NailPolish("Lakme");
        NailPolish n3 = new NailPolish("Lakme", "Red");
        NailPolish n4 = new NailPolish("Lakme", "Red", 10);
        NailPolish n5 = new NailPolish("Lakme", "Red", 10, true);
        NailPolish n6 = new NailPolish("Lakme", "Red", 10, true, "Matte");
        NailPolish n7 = new NailPolish("Lakme", "Red", 10, true, "Matte", 199);
		System.out.println("**********************************************");

		
        Water wa1 = new Water();
        Water wa2 = new Water("River");
        Water wa3 = new Water("River", 2.5);
        Water wa4 = new Water("River", 2.5, true);
        Water wa5 = new Water("River", 2.5, true, "Clear");
        Water wa6 = new Water("River", 2.5, true, "Clear", 15);
        Water wa7 = new Water("River", 2.5, true, "Clear", 15, "Liquid");
		System.out.println("**********************************************");


        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
        b7.display();

        h1.display();
        h2.display();
        h3.display();
        h4.display();
        h5.display();
        h6.display();
        h7.display();
		
		p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
		
		e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();
        e7.display();

        bk1.display();
        bk2.display();
        bk3.display();
        bk4.display();
        bk5.display();
        bk6.display();
        bk7.display();
		
		t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();

        w1.display();
        w2.display();
        w3.display();
        w4.display();
        w5.display();
        w6.display();
        w7.display();
		
        g1.display();
        g2.display();
        g3.display();
        g4.display();
        g5.display();
        g6.display();
        g7.display();

        n1.display();
        n2.display();
        n3.display();
        n4.display();
        n5.display();
        n6.display();
        n7.display();
		
		wa1.display();
        wa2.display();
        wa3.display();
        wa4.display();
        wa5.display();
        wa6.display();
        wa7.display();
    }
}
