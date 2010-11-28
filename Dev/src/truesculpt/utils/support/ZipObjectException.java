package truesculpt.utils.support;

import java.io.Serializable;

/**
 * <B>ZipObjectException</B> is thrown by ZipObject during zip and unzip
 * operations if something goes wrong. This is caused by IOExceptions generated
 * by the streams used.
 * 
 * @author : Nazmul Idris
 *         <p/>
 *         Creation Date : 9/4/1999 Creation Time : 2:05am
 * @version : 1.0
 * @see com.developerlife.support.ZipObject
 */
public class ZipObjectException extends java.lang.Exception implements Serializable {

	static final long serialVersionUID = -3087758326366037488L;

	//

	// Methods
	//
	public ZipObjectException(String msg) {
		super(msg);
	}

	public ZipObjectException(String msg, Exception e) {
		super(msg, e);
	}

}// end of ZipObjectException class
