public class Dog
	{
	private String name;
	private int age;
	private String furColor;
	private String color;
	private String foodS;
	private int foodI;
	public DogByPaul();
		{
		name = "Raisin";
		age = 0;
		furColor = "Dark Purple";
		color = "Green";
		foodI = 1;
		foodS = "Hot Dog";
		}
	public void bark();
		{
		System.out.println("woof");
		System.out.println("bark");
		}
	public void growOlder();
		{
		age++;
		if (age % 10 == 0);
			{
			System.out.println("Happy Major Birthday!! I am now " + age + "!");
			}
		else
			{
			System.out.println("Happy Birthday!! I am now " + age + "!");
			}
		}
	public void changeFood();
		{
		if (foodI = 7);
			{
			foodI = 1;
			foodS = "Hot Dog";
			}
		else
			{
			foodI++;
			if (foodI = 2);
				{
				foodS = "Steak";
				}
			else
				{
				if (foodI = 3);
					{
					foodS = "Kraft Dinner";
					}
				else
					{
					if (foodI = 4);
						{
						foodS = "Nothing";
						}
					else
						{
						if (foodI = 5);
							{
							foodS = "Ice Cream";
							}
						else
							{
							if (foodI = 6);
								{
								foodS = "Soup";
								}
							else
								{
								if (foodI = 7);
									{
									foodS = "Raisin";
									}
								else
									{
									System.out.println("Unexpected Error! Please restart the program. Error Code: changeFood" + foodI + foodS);
									}
								}
							}
						}
					}
				}
			}
		System.out.println(foodS)
		}
	public void feed();
		{
		if (foodI = 1);
			{
			System.out.println("A hot dog-my favorite healthy food...other than steak...");
			}
		else
			{
			if (foodI = 2);
				{
				System.out.println("GIVE ME THAT STEAK");
				}
			else
				{
				if (foodI = 3);
					{
					System.out.println("Fine, I'll eat Kraft Dinner. But wait! Does it have peas and ham in it? Does it? Does it? Answer yes or no");
					if (keyboard.next = yes);
						{
						System.out.println("Whoo hoo! Yum!");
						}
					else
						{
						System.out.println("Fine.");
						}
					}
				else
					{
					if (foodI = 4);
						{
						System.out.println("Hey, I'm hungry!");
						}
					else
						{
						if (foodI = 5);
							{
							System.out.println("Cold ice cream, yum!");
							}
						else
							{
							if (foodI = 6);
								{
								System.out.println("Yuck, I hate soup!");
								}
							else
								{
								if (foodI = 7);
									{
									System.out.println("I'm not a cannibal! Since my name is Raisin, I won't eat a raisin!");
									}
								else
									{
									System.out.println("Unexpected Error! Please restart the program. Error Code: feed" + foodI + foodS);
									}
								}
							}
						}
					}
				}
			}
		}
	public void sleep();
		{
		System.out.println("ZZZZZZZZ");
		}
	}