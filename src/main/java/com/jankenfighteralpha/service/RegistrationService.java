package com.jankenfighteralpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jankenfighteralpha.entity.Avatar;
import com.jankenfighteralpha.entity.Moveset;
import com.jankenfighteralpha.entity.Users;
import com.jankenfighteralpha.repository.AvatarRepository;
import com.jankenfighteralpha.repository.MoveRepository;
import com.jankenfighteralpha.repository.UserRepository;

@Service
public class RegistrationService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	AvatarRepository avatarRepository;
	@Autowired
	MoveRepository moveRepository;	
	@Autowired
	SendMail userSend;
	
	public void registerUser(Users user) {
		Avatar tempAvatar = new Avatar();
		tempAvatar.setAccesory(avatarRepository.getById(1000).getAccessory());
		tempAvatar.setArmsPart(avatarRepository.getById(1000).getArmsPart());
		tempAvatar.setHeadPart(avatarRepository.getById(1000).getHeadPart());
		tempAvatar.setLegsPart(avatarRepository.getById(1000).getLegsPart());
		tempAvatar.setTorsoPart(avatarRepository.getById(1000).getTorsoPart());
		tempAvatar.setWaistPart(avatarRepository.getById(1000).getWaistPart());
		user.setAvatar(tempAvatar);
		avatarRepository.save(tempAvatar);
		Moveset tempMoveset = new Moveset();
		tempMoveset.setChiMove(moveRepository.getById(1000).getChiMove());
		tempMoveset.setKenMove(moveRepository.getById(1000).getKenMove());
		tempMoveset.setSeiMove(moveRepository.getById(1000).getSeiMove());
		tempMoveset.setSurpriseMove(moveRepository.getById(1000).getSurpriseMove());
		user.setMoveset(tempMoveset);
		moveRepository.save(tempMoveset);
		userRepository.save(user);		
		userSend.send(user.getEmail(), "Janken Fighter Registration Complete", "Congrats, Fighter! "
				+ "\nYour account was successfully created! Prepare yourself for battles of epic proportions...");
	}
}
