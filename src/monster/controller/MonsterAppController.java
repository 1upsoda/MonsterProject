package monster.controller;

import monster.model.MarshmellowMonster;
import monster.view.MonsterView;

//added to see if you work

public class MonsterAppController
{

	private MonsterView myAppView;
	private MarshmellowMonster myMonster;
	private MarshmellowMonster otherMonster;
	
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmellowMonster("Ben", 2.0, 5.0, 2, 1, 3, true);
		otherMonster = new MarshmellowMonster("Scout", 0.023, .1, 4, 0, 0, false);
		
		
	}
	public MarshmellowMonster getMyMonster()
	{
		return myMonster;
		
	}
	public MarshmellowMonster getOtherMonster()
	{
		return otherMonster;
	}
	public void start()
	{
		myAppView.displayInformation();
		System.out.println();
	}
	
	
}
