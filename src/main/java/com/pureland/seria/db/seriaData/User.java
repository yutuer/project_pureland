package com.pureland.seria.db.seriaData;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import com.pureland.seria.db.seriaData.core.Player;

public class User implements Serializable {

	private static final long serialVersionUID = 3002034103820652754L;

	private Long userId;
	private String account;
	private String passwd;
	private String telephone;
	private String email;
	private List<Player> players;

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeLong(userId);
		out.writeUTF(account);
		out.writeUTF(passwd);
		out.writeUTF(telephone);
		out.writeUTF(email);
		out.writeObject(players);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		userId = in.readLong();
		account = in.readUTF();
		passwd = in.readUTF();
		telephone = in.readUTF();
		email = in.readUTF();
		players = (List<Player>) in.readObject();
	}

}
