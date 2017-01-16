package com.TriLethal.FireStorm.level.tile;

import com.TriLethal.FireStorm.graphics.Screen;
import com.TriLethal.FireStorm.graphics.Sprite;

public class FlowerTile extends Tile {

	public FlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen){
		screen.renderTile(x << 4, y << 4, this);
	}

}
