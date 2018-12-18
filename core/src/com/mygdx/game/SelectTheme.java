package com.mygdx.game;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class SelectTheme extends BaseScreen {
	TextButton returnMenu;
//	TextButton newtheme1,newtheme2,newtheme3,newtheme4;
//	TextButton[] themeButtons;
//	static Texture targetTexture = new Texture("ambulance.png"); //png ye gore degisecek
//	static int targetNumber=1;
	public SelectTheme(BaseGame game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

//		themeButtons=new TextButton[4];
//		newtheme1=new TextButton(targetNumber==1?"CHOOSEN":"", game.skin,"buttonThemeStyle1");
//		newtheme2=new TextButton(targetNumber==2?"CHOOSEN":"", game.skin,"buttonThemeStyle2");
//		newtheme3=new TextButton(targetNumber==3?"CHOOSEN":"", game.skin,"buttonThemeStyle3");
//		newtheme4=new TextButton(targetNumber==4?"CHOOSEN":"", game.skin,"buttonThemeStyle4");
//		themeButtons[0] = newtheme1;
//		themeButtons[1] = newtheme2;
//		themeButtons[2] = newtheme3;
//		themeButtons[3] = newtheme4;
//		
//		targetTexture=game.skin.get("theme1Texture",Texture.class);
		
		returnMenu=new TextButton("Back", game.skin, "buttonStyle3");
		returnMenu.addListener(new InputListener()
		{
			public boolean touchDown(InputEvent ev,float x,float y,int pointer,int button){
				game.skin.get("buton",Sound.class).play();
				return true;
			}
			public void touchUp(InputEvent ev,float x,float y,int pointer,int button){
				game.setScreen(new MainMenu(game));
			}
		});


//		newtheme1.addListener(new InputListener()
//		{
//			public boolean touchDown(InputEvent ev,float x,float y,int pointer,int button){
//				game.skin.get("buton",Sound.class).play();
//				//First clean
//				for (int i = 0;i < themeButtons.length; i++)
//					themeButtons[i].setText("");
//
//				return true;
//			}
//			public void touchUp(InputEvent ev, float x, float y, int pointer, int button){
//				newtheme1.setText("CHOOSEN");
//				targetTexture = game.skin.get("theme1Texture", Texture.class);
//				targetNumber = 1;
//			}
//		});
//		newtheme2.addListener(new InputListener()
//		{
//			public boolean touchDown(InputEvent ev,float x,float y,int pointer,int button){
//				game.skin.get("buton",Sound.class).play();
//				//First clean
//				for (int i = 0;i < themeButtons.length; i++)
//					themeButtons[i].setText("");
//
//				return true;
//			}
//			public void touchUp(InputEvent ev,float x,float y,int pointer,int button){
//				newtheme1.setText("CHOOSEN");
//				targetTexture = game.skin.get("theme2Texture",Texture.class);
//				targetNumber = 2;
//			}
//		});
//		newtheme3.addListener(new InputListener()
//		{
//			public boolean touchDown(InputEvent ev,float x,float y,int pointer,int button){
//				game.skin.get("buton",Sound.class).play();
//				//First clean
//				for (int i = 0;i < themeButtons.length; i++)
//					themeButtons[i].setText("");
//
//				return true;
//			}
//			public void touchUp(InputEvent ev,float x,float y,int pointer,int button){
//				newtheme1.setText("CHOOSEN");
//				targetTexture = game.skin.get("theme3Texture",Texture.class);
//				targetNumber = 3;
//			}
//		});
//		newtheme4.addListener(new InputListener()
//		{
//			public boolean touchDown(InputEvent ev,float x,float y,int pointer,int button){
//				game.skin.get("buton",Sound.class).play();
//				//First clean
//				for (int i = 0;i < themeButtons.length; i++)
//					themeButtons[i].setText("");
//
//				return true;
//			}
//			public void touchUp(InputEvent ev,float x,float y,int pointer,int button){
//				newtheme1.setText("CHOOSEN");
//				targetTexture = game.skin.get("theme4Texture",Texture.class);
//				targetNumber = 4;
//			}
//		});

		

		uiTable.setBackground(game.skin.getDrawable("background"));

//		uiStage.addActor(newtheme1);
//		uiStage.addActor(newtheme2);
//		uiStage.addActor(newtheme3);
//		uiStage.addActor(newtheme4);

		uiTable.add(returnMenu);

	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub

//		for(int i=0;i<themeButtons.length;i++){ //not sure
//			int cbx=90;
//			themeButtons[i].setWidth(cbx);
//			themeButtons[i].setHeight(cbx);
//			themeButtons[i].setPosition((cbx)*2*(i%(themeButtons.length/2))+VIEW_WIDTH/4, 3*VIEW_HEIGHT/4-(cbx+10)*(i/(themeButtons.length/2)));
//		}

		returnMenu.setPosition(30, 0);
		returnMenu.setWidth(180);

	}

}
