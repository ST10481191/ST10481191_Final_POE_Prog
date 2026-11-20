# Chat App

**Author:** Ositadima Udeh (ST10481191)  
**Date:** November 2026

## Description
A Java console-based chat application with user registration and login, message creation, message validation, and stored-message management.

## Features

### Part 1 – Registration and Login
- User registration with validation.
- User login.
- Username must contain `_` and be no longer than 5 characters.
- Password must contain at least 8 characters, an uppercase letter, a number, and a special character.
- South African cellphone number must start with `+27` and contain 9 digits after the prefix.

### Part 2 – Send Messages
- Generate a random 10-digit message ID.
- Generate a message hash using the first two ID digits, message sequence number, and the first and last message words.
- Validate recipient cellphone numbers.
- Limit messages to 250 characters.
- Choose to send, delete/disregard, or store a message.

### Part 3 – Stored Messages
- Keep arrays for sent, stored, and disregarded messages.
- Display sender and recipient details for stored messages.
- Find the longest stored message.
- Search by message ID.
- Search messages by recipient.
- Delete a message using its hash.
- Display a full message report.
- Save message data to `messages.json` when the application exits.

## Test registration details
| Field | Example |
|---|---|
| First name | Ositadima |
| Last name | Udeh |
| Username | `osi_9` |
| Password | `Udeh_@99` |
| Phone | `+27751042303` |

The username is five characters and includes an underscore. The password has eight characters and includes an uppercase letter, numbers, and special characters.

## Sample message data
The five sample records are stored in `messages.json` and are also loaded by the application at startup. The fourth sample recipient is written as `+27838884567` so it follows the stated `+27` recipient validation rule.

## How to run
1. Open the project in Apache NetBeans as a Maven project.
2. Run `com.mycompany.poepart1.Poepart1`.
3. Register an account using valid details.
4. Log in with the account you registered.
5. Use the main menu:
   - `1` – Send Messages
   - `2` – Recently sent messages (currently shown as coming soon)
   - `3` – Stored Messages
   - `4` – Quit and save message data to `messages.json`

You can also run the automated tests from the project directory with:

```bash
mvn test
```

## Technologies
- Java
- JUnit 5
- Maven
- Git and GitHub
- GitHub Actions workflow for automated tests
- JSON file storage

## Test suite
The project contains 8 registration/login tests and 11 message tests (19 total test methods). Run `mvn test` to execute them in your environment. The ZIP's previous Surefire reports were from selective test runs, so they are not presented as proof that all 19 tests passed.

## GitHub and video
- **GitHub repository:** [Insert Your GitHub Repository Link Here]
- **YouTube demonstration:** [Insert Your YouTube Video Link Here]

The branch names `main` (production) and `KhanbanTasks` (feature branch) are the intended repository workflow. Branches and remote hosting are not included as live GitHub links in this ZIP.

## References
- GeeksforGeeks (2026) *Java Arrays*. Available at: https://www.geeksforgeeks.org/arrays-in-java/ (Accessed: 20 November 2026).
- GeeksforGeeks (2026) *Java JSON Parsing*. Available at: https://www.geeksforgeeks.org/parse-json-java/ (Accessed: 20 November 2026).
- JUnit Team (2026) *JUnit 5 User Guide*. Available at: https://junit.org/junit5/docs/current/user-guide/ (Accessed: 20 November 2026).
