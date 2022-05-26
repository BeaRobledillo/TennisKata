# TennisKata

> Tennis has a rather quirky scoring system, and to newcomers it can be a little difficult to keep track of. The Tennis Society has contracted you to **build a scoreboard** to display the current score during tennis games. The umpire will have a handset with **two buttons** labelled “player 1 scores” and “player 2 scores”, which he or she will press when the respective players score a point. When this happens, a big scoreboard display should update to show the current score. (When you first switch on the scoreboard, both players are assumed to have no points). When one of the players has won, the scoreboard should display which one.
> 

> El tenis tiene un sistema de puntuación bastante peculiar y, para las recién llegadas, puede ser un poco difícil seguirle la pista. La Tennis Society os ha contratado para construir un marcador que muestre el *score* actual durante los juegos de tenis. El árbitro tendrá un aparato con dos botones etiquetados como “jugador 1 anota” y “jugador 2 anota”, que presionará cuando los respectivos jugadores anoten un punto. Cuando esto suceda, una gran pantalla de marcador debería actualizarse para mostrar la puntuación actual. (Cuando enciendes el marcador por primera vez, se supone que ambos jugadores no tienen puntos). Cuando uno de los jugadores ha ganado, el marcador debe mostrar cuál.
>
**Your task is to write a `TennisGame` class** containing the logic which outputs the correct score as a string for display on the scoreboard. You can assume that the umpire pressing the button “player 1 scores” will result in a **method `wonPoint(“player1”)` being called on your class**, and similarly **`wonPoint(“player2”)` for the other button**. Afterwards, you will get a call **`getScore()`** from the scoreboard asking what it should display. This method should return a `String` with the current score.  

**Vuestra tarea es escribir una clase `TennisGame`** que contenga la lógica para generar la puntuación correcta como `String` para mostrarla en el marcador. Supongamos que cuando árbitro que presiona el botón “jugador 1 anota” esto resultará en una llamada a un método `wonPoint("jugador1")` de la clase, y de manera similar `wonPoint("jugador2")` para el otro botón. El programa recibirá una llamada al método `getScore ()` desde el marcador preguntando qué debería mostrar. Este método debería devolver un `String` con la puntuación actual.

## Tennis Game Rules

1. A game is won by the first player to have won **at least four points in total and at least two points more than the opponent.** The score is then `“Win for player1”` or `“Win for player2”`.
2. The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as “Love” (`0`), “Fifteen”(`15`), “Thirty”(`30`), and “Forty”(`40`) respectively.
3. If **at least three points have been scored by each player, and the scores are equal**, the score is `“Deuce”`.
4. If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is `“Advantage player1”` or `“Advantage player2”`.

The Tennis Society has agreed that Sets and Matches are out of scope, so **you only need to report the score for the current game**. 

However, they have requested another feature with lower priority. They want to be able to change the name of the players from “player1” to “Björn Borg” and “player2” to “John McEnroe”. This feature has been categorized “Nice to have”, or, more accurately, “in your dreams”!”

## Tennis Kata: cómo empezar

- Creamos una clase para escribir en ella los tests

```java
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisGameTest {
    @Test
    void playersStartWithNoPoints() {
        TennisGame game = new TennisGame();

        assertThat(game.getScore(), equalTo("0 - 0"));
    }
}
```

- Creamos la clase TennisGame que nos pide el test

```java
public class TennisGame {
    public String getScore() {
        // qué tendremos que devolver para que pase el test?
    }
}
```
