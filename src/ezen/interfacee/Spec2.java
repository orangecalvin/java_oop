package ezen.interfacee;


/**
 * 인터페이스간에도 상속이 가능하며 거기에다 다중 상속까지 가능하다.
 * @author 김규래
 * @Date 2023. 1. 6.
 */
public interface Spec2 extends Spec1,Weapon {
	public void doTask3();
}
