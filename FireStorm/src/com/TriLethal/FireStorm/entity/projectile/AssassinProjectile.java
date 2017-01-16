package com.TriLethal.FireStorm.entity.projectile;

public class AssassinProjectile extends Projectile{

	public AssassinProjectile(int x, int y, int dir) {
		super(x, y, dir);
		range = 200;
		speed = 4;
		damage = 20;
		rateOfFire = 15;
		
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}
	
	public void update(){
		move();
	}
	
	protected void move(){
		x += nx;
		y += ny;
	}

}
