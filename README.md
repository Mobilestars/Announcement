# 📢 Announcement

A simple and flexible **Minecraft Spigot/Paper plugin** that lets you send colorful announcements to all players on the server.  
Perfect for staff notifications, server messages, or global event announcements.

---

## ⚙️ Features

- 📣 Send **custom messages** to all online players  
- 🎨 Choose from a wide range of **text colors**  
- 💬 Automatically prefixes messages with a styled “Announcement” tag  
- ⚡ Lightweight, fast, and easy to use  
- 🧑‍💻 Works from both console and in-game  

---

## 📁 Installation

1. Download the plugin `.jar` file  
2. Place it inside your server’s `plugins/` folder  
3. Start or reload your server — ready to use immediately!

---

## 💡 Usage

### Command

/announce <message> <color>

### Example
/announce Server restart in 5 minutes! red


### Result (visible to all players)
> [Announcement] Server restart in 5 minutes!  

*(Displayed in red color)*

If no color is provided, the message defaults to **yellow**.

---

## 🎨 Available Colors

You can use any of the following color names:

| Color Name | Example |
|-------------|----------|
| black | `black` |
| dark_blue | `dark_blue` |
| dark_green | `dark_green` |
| dark_aqua | `dark_aqua` |
| dark_red | `dark_red` |
| dark_purple | `dark_purple` |
| gold | `gold` |
| gray | `gray` |
| dark_gray | `dark_gray` |
| blue | `blue` |
| green | `green` |
| aqua | `aqua` |
| red | `red` |
| light_purple | `light_purple` |
| yellow | `yellow` |
| white | `white` |

---

## 🧩 Developer Information

**Main classes:**
- `de.scholle.announcement.Announcement` – main plugin class  
- `de.scholle.announcement.AnnounceCommand` – handles `/announce`  
- `de.scholle.announcement.MessageUtils` – formats and sends messages  

---

## 🧰 Compatibility

- ✅ Works with **Spigot**, **Paper**, and **Purpur**  
- 🧱 Tested for **Minecraft 1.18+**  
- ⚙️ Requires **Java 17+**

---

## 🧑‍💻 Author

**Developed by:** Scholle  
**Package:** `de.scholle.announcement`

---

## 📜 License

This project is licensed under the **Apache License 2.0**.  
You may use, modify, and distribute it in compliance with the terms of that license.  
For more information, see: [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)
