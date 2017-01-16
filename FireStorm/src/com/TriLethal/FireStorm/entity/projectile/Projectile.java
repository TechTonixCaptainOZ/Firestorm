package com.TriLethal.FireStorm.entity.projectile;

import com.TriLethal.FireStorm.entity.Entity;
import com.TriLethal.FireStorm.graphics.Sprite;

public abstract class Projectile extends Entity {
	
	protected final int xOrigin, yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double nx, ny;
	protected double speed, rateOfFire, range, damage;
	
	public Projectile(int x, int y, int dir){
		xOrigin = x;
		yOrigin = y;
		angle = dir;
	}
	
	public void move(){
		
	}

}
