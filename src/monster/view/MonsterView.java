package monster.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}

	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a Monster");
		JOptionPane.showMessageDialog(null, "Its name is " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, "He is a terrible person because he has " + baseController.getMyMonster().getEyeCount() + " eyes");
		JOptionPane.showMessageDialog(null, "and " + baseController.getMyMonster().getNoseCount() + " nose...");
		JOptionPane.showMessageDialog(null, "I mean, what kind of thing looks like that?");
		JOptionPane.showMessageDialog(null, "Deffinately something disgusting");
		JOptionPane.showMessageDialog(null, "He also only has " + baseController.getMyMonster().getArmCount() + " arms, I'd be surprized to see anything with less than 56");
		JOptionPane.showMessageDialog(null, "All-in-all he is a weird and dangerous creature with " + baseController.getMyMonster().getNumberOfLegs() + " legs");
		JOptionPane.showMessageDialog(null, "and " + baseController.getMyMonster().getHairCount() + " hairs");
		JOptionPane.showMessageDialog(null, "and " + baseController.getMyMonster().getNoseCount() + " bellybutton...");
		JOptionPane.showMessageDialog(null, "I also made a second monster named " + baseController.getOtherMonster().getName());
		
	}
}
