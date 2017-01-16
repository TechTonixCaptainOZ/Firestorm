package com.TriLethal.FireStorm.level.tile.spawn_level;

import com.TriLethal.FireStorm.graphics.Screen;
import com.TriLethal.FireStorm.graphics.Sprite;
import com.TriLethal.FireStorm.level.tile.Tile;

public class SpawnWallTile extends Tile {

	public SpawnWallTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid(){
		return true;
	}

}
