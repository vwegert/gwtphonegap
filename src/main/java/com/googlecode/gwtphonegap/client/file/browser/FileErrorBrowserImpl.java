package com.googlecode.gwtphonegap.client.file.browser;

import com.googlecode.gwtphonegap.client.file.FileError;

public class FileErrorBrowserImpl implements FileError {

	private final int errorCode;

	public FileErrorBrowserImpl(int errorCode) {
		this.errorCode = errorCode;

	}

	@Override
	public int getErrorCode() {
		return errorCode;
	}

}
