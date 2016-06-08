package com.metelyoff.solutions;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
		int anotherStrength=((Cat)anotherCat).getStrength();
		if(anotherCat instanceof Cat){
				if(this.age>5&&this.age<20&&this.age>((Cat)anotherCat).getAge()){
					this.strength+=1;
				}
				if(((Cat)anotherCat).getAge()>5&&((Cat)anotherCat).getAge()<20&&((Cat)anotherCat).getAge()>this.age){
					anotherStrength+=1;
					((Cat)anotherCat).setStrength(anotherStrength);
				}
				if(this.weight>((Cat)anotherCat).getWeight()){
					this.strength+=1;
				}
				if(this.weight<((Cat)anotherCat).getWeight()){
					anotherStrength+=1;
					((Cat)anotherCat).setStrength(anotherStrength);
				}
			
			/*
			if(this.weight>((Cat)anotherCat).getWeight()){
				this.strength+=1;
			}else{
				if(this.weight==((Cat)anotherCat).getWeight()){
					if(this.age>5&&this.age<20&&this.age>((Cat)anotherCat).getAge()){
						this.strength+=1;
					}
					if(((Cat)anotherCat).getAge()>5&&((Cat)anotherCat).getAge()<20&&((Cat)anotherCat).getAge()>this.age){
						anotherStrength+=1;
						((Cat)anotherCat).setStrength(anotherStrength);
					}
				}else{
					anotherStrength+=1;
					((Cat)anotherCat).setStrength(anotherStrength);
				}
			}
			*/
			
			
			/*
			if(this.age>5&&this.age<20&&this.age>((Cat)anotherCat).getAge()){
				this.strength+=1;
				}
					if(((Cat)anotherCat).getAge()>5&&((Cat)anotherCat).getAge()<20&&((Cat)anotherCat).getAge()>this.age){
					int aStrength=((Cat)anotherCat).getStrength()+1;
					((Cat)anotherCat).setStrength(aStrength);
					}
				*/
				/*
			if(this.age>((Cat)anotherCat).getAge()){
				this.strength+=1;
			}else{
				int anotherStrength=((Cat)anotherCat).getStrength()+1;
				((Cat)anotherCat).setStrength(anotherStrength);
			}
				*/
			if(((Cat)anotherCat).getStrength()<this.strength){
				return true;
				}else{
					return false;
					}
		}else{
			return false;
			}
    }
}

class TestCat{
	public static void main(String... args){
		Cat cat1=new Cat();
		Cat cat2=new Cat();
		cat1.setAge(7);
		cat1.setName("Vaska");
		cat1.setWeight(7);
		cat1.setStrength(5);
		
		cat2.setAge(8);
		cat2.setName("Barsik");
		cat2.setWeight(33);
		cat2.setStrength(3);
		
		System.out.println(cat1.fight(cat2));
		
		System.out.println(cat1.getName());
		System.out.println(cat1.getAge());
		System.out.println(cat1.getWeight());
		System.out.println(cat1.getStrength());
		
		System.out.println(cat2.getName());
		System.out.println(cat2.getAge());
		System.out.println(cat2.getWeight());
		System.out.println(cat2.getStrength());
	}
}
