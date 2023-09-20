package com.project.tourist.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.project.tourist.entity.Tourist;
import com.project.tourist.repository.TouristRepository;

@Service
public class TouristServicesImpl implements TouristServices {
	@Autowired
	private TouristRepository tr;
	@Override
	public List<Tourist> getTourist() {
		//return tr.findAll(Sort.by(Sort.Direction.ASC, "fname" ,"lname"));
		return tr.findAll(Sort.by(Sort.Direction.ASC,"id"));
		//if you have to sort in descending then only it needs direction.desc else do sort.by
	}
	@Override
	public Tourist addTourist(Tourist t){
		return tr.save(t);
	}
	@Override
	public String updateTourist(Tourist t) {
		tr.save(t);
		return "Updated sucessfully";
	}
	@Override
	public boolean deleteTourist(int id) {
        java.util.Optional<Tourist> optionalTourist = tr.findById(id);
        if (optionalTourist.isPresent()) {
            tr.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

