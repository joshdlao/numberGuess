# 🎯 Number Guessing Game

A simple Java console-based game where the player tries to guess a randomly selected number between 1 and 100. The player chooses a difficulty level, which determines the number of attempts allowed.

## 🧠 How It Works

1. The game generates a random number between **1 and 100**.
2. The player selects a **difficulty level**:
   - **Easy** – 10 chances
   - **Medium** – 5 chances
   - **Hard** – 3 chances
3. The player enters guesses one by one.
4. The game provides feedback:
   - "The number is less than your guess" or
   - "The number is greater than your guess"
5. If the player guesses correctly, they win.
6. If the player uses all attempts without guessing, the game reveals the correct number.
7. After the game ends, the player can choose to **restart** or **exit**.

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- Console-based interaction (no GUI)

## 🚀 Getting Started

### Prerequisites
- Java installed on your system
- IDE (like IntelliJ, Eclipse) or a simple text editor and terminal

### Running the Game

1. **Clone or download the project**
2. Open the project in your Java IDE or terminal.
3. Compile the program:

   ```bash
   javac NumberGuess.java
