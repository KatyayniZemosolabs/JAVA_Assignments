class TestFood extends Food implements FoodVariety{
    public TestFood(){
        super("Katyayni");
    }

    public void Noodles(){
        System.out.println("Noodles");
    }
    public void Momose(){
        System.out.println("Momose with mayo");
    }
    public void Rice(){
        System.out.println("Rice with dal");
    }
    public void Roti(){
        System.out.println("Roti with paneer");
    }
    public void Pizza(){
        System.out.println("Pizza with extra cheese");
    }
    public void Pasta(){
        System.out.println("Pasta with extra sauce");
    }
    public void varietyOfFood(){
        System.out.println("Various variety of food");
    };
}
