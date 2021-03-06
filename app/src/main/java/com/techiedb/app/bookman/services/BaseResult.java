package com.techiedb.app.bookman.services;

/**
 * Copyright (C) 2014 Techie Digital Benchwork Inc. All rights reserved. Mobile UX Promotion Division. This software and its documentation
 * are confidential and proprietary information of Techie Digital Benchwork Inc.  No part of the software and documents may be copied,
 * reproduced, transmitted, translated, or reduced to any electronic medium or machine-readable form without the prior written consent of
 * Techie Digital Benchwork. Techie Digital Benchwork makes no representations with respect to the contents, and assumes no responsibility
 * for any errors that might appear in the software and documents. This publication and the contents hereof are subject to change without
 * notice. History
 *
 * @author Larry Pham
 * @project BookMan
 * @since Dec.20.2014
 *
 * The BaseResult represents the result which will be received from the tasks or thread.
 */
public class BaseResult {

  protected String mRequestOwner = null;
  protected int mRequestMsg = 0;
  protected int mResultMsg = 0;
  protected int mErrorReason = 0;

  public BaseResult() {

  }

  public String getRequestOwner() {
    return mRequestOwner;
  }

  public void setRequestOwner(String requestOwner) {
    this.mRequestOwner = requestOwner;
  }

  public int getRequestMessage() {
    return mRequestMsg;
  }

  public void setRequestMessage(int requestMessage) {
    this.mRequestMsg = requestMessage;
  }

  public int getResultMessage() {
    return mRequestMsg;
  }

  public void setResultMessage(int resultMessage) {
    this.mResultMsg = resultMessage;
  }

  public int getErrorReason() {
    return this.mErrorReason;
  }

  public void setErrorReason(int errorReason) {
    mErrorReason = errorReason;
  }
}
