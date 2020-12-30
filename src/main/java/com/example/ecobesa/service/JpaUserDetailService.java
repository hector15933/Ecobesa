package com.example.ecobesa.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecobesa.dao.IUserDao;
import com.example.ecobesa.entity.Cargo;
import com.example.ecobesa.entity.Role;
import com.example.ecobesa.entity.User;


@Service("jpaUserDetailService")
public class JpaUserDetailService implements UserDetailsService{

	
	@Autowired
	private IUserDao usuarioDao;
	
	private Logger looger;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		com.example.ecobesa.entity.User user = usuarioDao.findByUsuario(usuario);
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		//for(Role role: usuarios.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(user.getRole().getAuthority()));
		//}
		
		return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getPassword(), user.getEstado(), true, true, true, authorities);
	}

}
