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

public class Level3 extends Levels {
	

	public Level3(BaseGame game) {
		super(game);
		levelno=3;
	}

	public void createCars(ArrayList<Car> list){
		Car car1=new Car(0,0,3,2,1,1);//
		Car car2=new Car(1,1,1,1,2,0);//
		Car car3=new Car(1,3,3,1,3,0);//
		Car car4=new Car(0,2,2,2,1,0);//
		Car car5=new Car(0,2,1,2,1,0);//
		Car car6=new Car(0,2,0,3,1,0);//
		Car car7=new Car(1,4,4,1,2,0);//
		Car car8=new Car(1,5,1,1,3,0);//
		
		
		car1.setTexture(new Texture("mercedes.png"));
		car1.setPosition(VIEW_WIDTH/2-w/2+car1.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car1.y/number_of_height_tiles);
		
		car2.setTexture(new Texture("obs_car_vert.png"));
		car2.setPosition(VIEW_WIDTH/2-w/2+car2.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car2.y/number_of_height_tiles);
		
		car3.setTexture(new Texture("truck_vert.png"));
		car3.setPosition(VIEW_WIDTH/2-w/2+car3.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car3.y/number_of_height_tiles);
		
		car4.setTexture(new Texture("obs_car_horiz.png"));
		car4.setPosition(VIEW_WIDTH/2-w/2+car4.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car4.y/number_of_height_tiles);
				
		car5.setTexture(new Texture("obs_car_horiz.png"));
		car5.setPosition(VIEW_WIDTH/2-w/2+car5.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car5.y/number_of_height_tiles);
				
		car6.setTexture(new Texture("truck_horiz.png"));
		car6.setPosition(VIEW_WIDTH/2-w/2+car6.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car6.y/number_of_height_tiles);
				
		car7.setTexture(new Texture("obs_car_vert.png"));
		car7.setPosition(VIEW_WIDTH/2-w/2+car7.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car7.y/number_of_height_tiles);
		
		car8.setTexture(new Texture("truck_vert.png"));
		car8.setPosition(VIEW_WIDTH/2-w/2+car8.x*w/number_of_width_tiles, VIEW_HEIGHT/2-h/2+h*car8.y/number_of_height_tiles);
	
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		list.add(car6);
		list.add(car7);
		list.add(car8);

		mainStage.addActor(car1);
		mainStage.addActor(car2);
		mainStage.addActor(car3);
		mainStage.addActor(car4);
		mainStage.addActor(car5);
		mainStage.addActor(car6);
		mainStage.addActor(car7);
		mainStage.addActor(car8);
	
		startX=car1.getX();
		startY=car1.getY();
	}
}
	
	
	

