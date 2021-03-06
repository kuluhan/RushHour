package com.mygdx.game;

import java.util.ArrayList;
import java.util.Arrays;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Level4 extends Levels {
	

	public Level4(BaseGame game) {
		super(game);
		levelno=4;
	}

	public void createCars(ArrayList<Car> list){
		Car car1=new Car(1,0,4,1,2,0);//
		Car car2=new Car(1,1,4,1,2,0);//
		Car car3=new Car(0,0,3,2,1,1);//
		Car car4=new Car(1,2,3,1,2,0);//
		Car car5=new Car(0,1,1,2,1,0);//
		Car car6=new Car(0,1,0,2,1,0);//
		Car car7=new Car(0,3,5,3,1,0);//
		Car car8=new Car(1,4,2,1,3,0);//
		Car car9=new Car(0,3,0,2,1,0);//
		Car car10=new Car(1,5,3,1,2,0);//
		Car car11=new Car(1,5,1,1,2,0);//
		
		Texture vert = game.skin.get("obs_car_vert_Theme1",Texture.class);
		Texture horiz = game.skin.get("obs_car_horiz_Theme1",Texture.class);
		Texture truck_vert = game.skin.get("truck_vert_Theme1",Texture.class);
		Texture truck_horiz = game.skin.get("truck_horiz_Theme1",Texture.class);
		if(SelectTheme.targetNumber == 2) {
			vert = game.skin.get("obs_car_vert_Theme2",Texture.class);
			horiz = game.skin.get("obs_car_horiz_Theme2",Texture.class);
			truck_vert = game.skin.get("truck_vert_Theme2",Texture.class);
			truck_horiz = game.skin.get("truck_horiz_Theme2",Texture.class);
		}
		
		car1.setTexture(vert);
		car1.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car1.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car1.y/height_tiles);
		
		car2.setTexture(vert);
		car2.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car2.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car2.y/height_tiles);
		
		car3.setTexture(new Texture("car10.png"));
		car3.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car3.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car3.y/height_tiles);
		
		car4.setTexture(vert);
		car4.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car4.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car4.y/height_tiles);
				
		car5.setTexture(horiz);
		car5.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car5.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car5.y/height_tiles);
				
		car6.setTexture(horiz);
		car6.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car6.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car6.y/height_tiles);
				
		car7.setTexture(truck_horiz);
		car7.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car7.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car7.y/height_tiles);
		
		car8.setTexture(truck_vert);
		car8.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car8.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car8.y/height_tiles);
	
		car9.setTexture(horiz);
		car9.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car9.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car9.y/height_tiles);
				
		car10.setTexture(vert);
		car10.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car10.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car10.y/height_tiles);
		
		car11.setTexture(vert);
		car11.setPosition(VIEW_WIDTH/2-half_of_view_width/2+car11.x*half_of_view_width/width_tiles, VIEW_HEIGHT/2-half_of_view_height/2+half_of_view_height*car11.y/height_tiles);
		
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		list.add(car6);
		list.add(car7);
		list.add(car8);
		list.add(car9);
		list.add(car10);
		list.add(car11);

		mainStage.addActor(car1);
		mainStage.addActor(car2);
		mainStage.addActor(car3);
		mainStage.addActor(car4);
		mainStage.addActor(car5);
		mainStage.addActor(car6);
		mainStage.addActor(car7);
		mainStage.addActor(car8);
		mainStage.addActor(car9);
		mainStage.addActor(car10);
		mainStage.addActor(car11);
	
		startX=car3.getX();
		startY=car3.getY();
	}
	
}
	
	
	

