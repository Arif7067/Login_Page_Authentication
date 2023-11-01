package com.xopuntech.authentication.Service;

import com.xopuntech.authentication.model.ProjectUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProjectUserService {

    private List<ProjectUser> store = new ArrayList<>();

    public ProjectUserService() {
        store.add(new ProjectUser(UUID.randomUUID().toString(),"Arif Hassan","arif@ac.in"));
        store.add(new ProjectUser(UUID.randomUUID().toString(),"Harsh Hassan","harsh@ac.in"));
        store.add(new ProjectUser(UUID.randomUUID().toString(),"Ankit Hassan","ankit@ac.in"));
        store.add(new ProjectUser(UUID.randomUUID().toString(),"Gautam Hassan","gautam@ac.in"));
    }

    public List<ProjectUser> getUsers(){
        return this.store;
    }
}
