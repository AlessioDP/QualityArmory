package me.zombie_striker.qg.miscitems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import me.zombie_striker.customitemmanager.CustomBaseObject;
import me.zombie_striker.customitemmanager.CustomItemManager;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.zombie_striker.customitemmanager.ArmoryBaseObject;
import me.zombie_striker.customitemmanager.MaterialStorage;

public class MeleeItems extends CustomBaseObject implements ArmoryBaseObject{

	List<UUID> medkitHeartUsage = new ArrayList<>();
	HashMap<UUID, Long> lastTimeHealed = new HashMap<>();
	HashMap<UUID, Double> PercentTimeHealed = new HashMap<>();

	ItemStack[] ing = null;

	int damage = 1;

	public MeleeItems(MaterialStorage ms, String name, String displayname, ItemStack[] ings, int cost, int damage) {
		super(name,ms,displayname,null,false);
		this.setPrice(cost);
		this.ing = ings;
		this.damage = damage;
	}


	@Override
	public int getCraftingReturn() {
		return 1;
	}


	public int getDamage() {
		return damage;
	}
	@Override
	public boolean is18Support() {
		return false;
	}

	@Override
	public void set18Supported(boolean b) {		
	}

	@Override
	public boolean onRMB(Player e, ItemStack usedItem) {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean onLMB(Player e, ItemStack usedItem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ItemStack getItemStack() {
		return CustomItemManager.getItemFact("gun").getItem(this.getItemData(),1);
	}
}
