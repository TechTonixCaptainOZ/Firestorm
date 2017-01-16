package com.TriLethal.FireStorm.level.tile;

import com.TriLethal.FireStorm.graphics.Screen;
import com.TriLethal.FireStorm.graphics.Sprite;
import com.TriLethal.FireStorm.level.tile.spawn_level.SpawnDirtTile;
import com.TriLethal.FireStorm.level.tile.spawn_level.SpawnFloorTile;
import com.TriLethal.FireStorm.level.tile.spawn_level.SpawnGrassTile;
import com.TriLethal.FireStorm.level.tile.spawn_level.SpawnWallTile;
import com.TriLethal.FireStorm.level.tile.spawn_level.SpawnWaterTile;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile spawn_dirt = new SpawnDirtTile(Sprite.spawn_dirt);
	public static Tile spawn_wall = new SpawnWallTile(Sprite.spawn_wall);
	public static Tile spawn_florr = new SpawnFloorTile(Sprite.spawn_floor);
	
	public final static int color_spawn_grass = 0xff00ff00;
	public final static int color_spawn_water = 0xff0226c9;
	public final static int color_spawn_dirt = 0xff7f3300;
	public final static int color_spawn_floor = 0xff404040;
	public final static int color_spawn_wall = 0xff808080;
	
	public Tile(Sprite sprite){
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen){
		
	}
	
	public boolean solid(){
		return false;
	}

}
