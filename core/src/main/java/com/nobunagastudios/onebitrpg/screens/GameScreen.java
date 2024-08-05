package com.nobunagastudios.onebitrpg.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nobunagastudios.onebitrpg.OneBitRPGGame;
import com.nobunagastudios.onebitrpg.scenes.Hud;

/** First screen of the application. Displayed after the application is created. */
public class GameScreen implements Screen {
    private OneBitRPGGame game;
    private Texture texture;
    private OrthographicCamera gameCamera;
    private Viewport gamePort;
    private Hud hud;
    public GameScreen(OneBitRPGGame game){
        this.game = game;
        texture = new Texture("libgdx.png");
        gameCamera = new OrthographicCamera();
        gamePort = new FitViewport(OneBitRPGGame.V_WIDTH, OneBitRPGGame.V_HEIGHT, gameCamera);
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {
        // Prepare your screen here.
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
        gamePort.update(width, height);
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
    }
}
