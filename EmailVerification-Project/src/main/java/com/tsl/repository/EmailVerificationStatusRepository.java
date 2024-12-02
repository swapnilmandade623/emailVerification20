package com.tsl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.model.EmailVerificationStatus;
import com.tsl.model.UploadedFile;

public interface EmailVerificationStatusRepository extends JpaRepository<EmailVerificationStatus,Long> {

	List<EmailVerificationStatus> findByUploadedFile(UploadedFile uploadedFile);

}
