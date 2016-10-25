package com.github.flying.george.olimpiad.task1;

/**
 * Created by george.
 */
public class Task1Solver {
    private final int ilya;
    private final int alesha;
    private final int dobrynia;

    /**
     * Конструирует класс, наполняя его информацией "кто сколько раз отжался"
     *
     * @param n - общее число отжиманий
     * @param m - количество отжиманий Алеши + Добрыни
     * @param l - количество отжиманий Алеши + Ильи
     */
    public Task1Solver(int n, int m, int l) {

        if (n >= 30000 || m > n || l > n) {
            throw new IllegalArgumentException();
        }

        ilya = n - m;
        alesha = l - ilya;
        dobrynia = m - alesha;
    }


    public int getIlya() {
        return ilya;
    }

    public int getAlesha() {
        return alesha;
    }

    public int getDobrynia() {
        return dobrynia;
    }
}
