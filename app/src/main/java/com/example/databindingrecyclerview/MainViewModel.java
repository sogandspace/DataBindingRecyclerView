package com.example.databindingrecyclerview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.databindingrecyclerview.model.Employee;
import com.example.databindingrecyclerview.model.EmployeeRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private EmployeeRepository employeeRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        employeeRepository = new EmployeeRepository();
    }

    public LiveData<List<Employee>> getAllEmployee() {
        return employeeRepository.getMutableLiveData();
    }
}
