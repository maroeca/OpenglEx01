package br.pucpr.cg;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

import br.pucpr.mage.Keyboard;
import br.pucpr.mage.Scene;
import br.pucpr.mage.Window;

/**
 * Implementação de Scene, onde desenharemos o primeiro Triangulo
 */
public class Triangle implements Scene {
    private Keyboard keys = Keyboard.getInstance();

	/**
	 * Função para inicialização do game. Roda antes do game loop começar.
	 */
	@Override
	public void init() {		
		//Define a cor de limpeza da tela
		glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
	}

	/**
	 * Método update, onde a atualização da lógica da cena deve ocorrer.
	 * Esse código roda a cada passo do loop, antes do draw(). A variável secs contém a quantidade de tempo
	 * entre duas chamadas do update, em segundos.
	 */
	@Override
	public void update(float secs) {
		//Fecha a janela ao se pressionar ESC
        if (keys.isPressed(GLFW_KEY_ESCAPE)) {
            glfwSetWindowShouldClose(glfwGetCurrentContext(), 1);
            return;
        }
	}

	/**
	 * O código de desenho da cena vai aqui. Esse método roda a cada game loop.
	 */
	@Override
	public void draw() {
	}

	/**
	 * Esse código é executado assim que a janela fecha. Pode ser usado para desinicializar a OpenGL de maneira
	 * graciosa.
	 */
	@Override
	public void deinit() {
	}


	public static void main(String[] args) {
		//Executa nosso programa
		new Window(new Triangle()).show();
	}
}
