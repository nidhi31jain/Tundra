package tundra.message;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-09-28 20:22:28 EST
// -----( ON-HOST: 192.168.66.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import permafrost.tundra.configuration.ConfigurationManager;
import permafrost.tundra.data.IDataHelper;
import permafrost.tundra.lang.BooleanHelper;
import permafrost.tundra.lang.ExceptionHelper;
import permafrost.tundra.math.IntegerHelper;
import permafrost.tundra.message.format.Format;
import permafrost.tundra.message.format.Recognizer;
// --- <<IS-END-IMPORTS>> ---

public final class format

{
	// ---( internal utility methods )---

	final static format _instance = new format();

	static format _newInstance() { return new format(); }

	static format _cast(Object o) { return (format)o; }

	// ---( server methods )---




	public static final void clear (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(clear)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		RECOGNIZER.clear();
		// --- <<IS-END>> ---

                
	}



	public static final void get (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(get)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $message.format.name
		// [o] recref:0:optional $message.format tundra.schema.message:format
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    String name = IDataUtil.getString(cursor, "$message.format.name");
		    Format format = RECOGNIZER.get(name);
		    if (format != null) IDataUtil.put(cursor, "$message.format", format.getIData());
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void list (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(list)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [o] recref:1:required $message.formats tundra.schema.message:format
		// [o] field:0:required $message.formats.length
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    Collection<Format> collection = RECOGNIZER.list();
		    IDataUtil.put(cursor, "$message.formats", Format.toIDataArray(collection));
		    IDataUtil.put(cursor, "$message.formats.length", IntegerHelper.emit(collection.size()));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void recognize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(recognize)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [o] field:0:required $message.recognized?
		// [o] recref:0:optional $message.format tundra.schema.message:format
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    Format format = RECOGNIZER.recognize(pipeline);
		    boolean recognized = format != null;
		    IDataUtil.put(cursor, "$message.recognized?", BooleanHelper.emit(recognized));
		    if (recognized) IDataUtil.put(cursor, "$message.format", format.getIData());
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void refresh (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(refresh)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    IData[] configurations = ConfigurationManager.list(true, false);
		
		    List<Format> formats = new ArrayList<Format>();
		    List<Exception> exceptions = new ArrayList<Exception>();
		
		    for (IData configuration : configurations) {
		        Object value = IDataHelper.get(IDataHelper.stringify(IDataHelper.normalize(configuration), true), "configuration/tundra/message/format");
		
		        try {
		            if (value instanceof IData) {
		                formats.add(Format.of((IData)value));
		            } else if (value instanceof IData[]) {
		                formats.addAll(Format.of(Arrays.asList((IData[])value)));
		            }
		        } catch(Exception ex) {
		            exceptions.add(ex);
		        }
		    }
		
		    RECOGNIZER.initialize(formats);
		
		    if (exceptions.size() > 0) ExceptionHelper.raise(exceptions);
		} catch(IOException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	public static final Recognizer RECOGNIZER = new Recognizer();
	// --- <<IS-END-SHARED>> ---
}

