// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qmenu.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QMenu extends QWidget {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QMenu(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QMenu(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QMenu position(long position) {
        return (QMenu)super.position(position);
    }
    @Override public QMenu getPointer(long i) {
        return new QMenu((Pointer)this).position(position + i);
    }

    public QMenu(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QMenu() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QMenu(@Const @ByRef QString title, QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(title, parent); }
    private native void allocate(@Const @ByRef QString title, QWidget parent/*=nullptr*/);
    public QMenu(@Const @ByRef QString title) { super((Pointer)null); allocate(title); }
    private native void allocate(@Const @ByRef QString title);
    public native QAction addAction(@Const @ByRef QString text);
    public native QAction addAction(@Const @ByRef QIcon icon, @Const @ByRef QString text);
    public native QAction addAction(@Const @ByRef QString text, @Const QObject receiver, @Cast("const char*") BytePointer member);
    public native QAction addAction(@Const @ByRef QString text, @Const QObject receiver, String member);
    public native QAction addAction(@Const @ByRef QIcon icon, @Const @ByRef QString text, @Const QObject receiver, @Cast("const char*") BytePointer member);
    public native QAction addAction(@Const @ByRef QIcon icon, @Const @ByRef QString text, @Const QObject receiver, String member);

// #ifdef Q_CLANG_QDOC
// #else
// #endif // !Q_CLANG_QDOC

    public native QAction addMenu(QMenu menu);
    public native QMenu addMenu(@Const @ByRef QString title);
    public native QMenu addMenu(@Const @ByRef QIcon icon, @Const @ByRef QString title);

    public native QAction addSeparator();

    public native QAction addSection(@Const @ByRef QString text);
    public native QAction addSection(@Const @ByRef QIcon icon, @Const @ByRef QString text);

    public native QAction insertMenu(QAction before, QMenu menu);
    public native QAction insertSeparator(QAction before);
    public native QAction insertSection(QAction before, @Const @ByRef QString text);
    public native QAction insertSection(QAction before, @Const @ByRef QIcon icon, @Const @ByRef QString text);

    public native @Cast("bool") boolean isEmpty();
    public native void clear();

    public native void setTearOffEnabled(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isTearOffEnabled();

    public native @Cast("bool") boolean isTearOffMenuVisible();
    public native void showTearOffMenu();
    public native void hideTearOffMenu();

    public native void setDefaultAction(QAction arg0);
    public native QAction defaultAction();

    public native void setActiveAction(QAction act);
    public native QAction activeAction();
    public native QAction exec();

// #if QT_VERSION >= QT_VERSION_CHECK(6,0,0)
// #else
// #endif

    public native @ByVal QSize sizeHint();

    public native QAction menuAction();

    public native @ByVal QString title();
    public native void setTitle(@Const @ByRef QString title);

    public native @ByVal QIcon icon();
    public native void setIcon(@Const @ByRef QIcon icon);

    public native void setNoReplayFor(QWidget widget);

// #if defined(Q_OS_MACOS) || defined(Q_CLANG_QDOC)
    public native @Platform("macosx") void setAsDockMenu();
// #endif

    public native @Cast("bool") boolean separatorsCollapsible();
    public native void setSeparatorsCollapsible(@Cast("bool") boolean collapse);

    public native @Cast("bool") boolean toolTipsVisible();
    public native void setToolTipsVisible(@Cast("bool") boolean visible);

    @Virtual protected native void changeEvent(QEvent arg0);
    @Virtual protected native void enterEvent(QEvent arg0);
    @Virtual protected native void leaveEvent(QEvent arg0);
    @Virtual protected native void paintEvent(QPaintEvent arg0);
    @Virtual protected native void timerEvent(QTimerEvent arg0);
    @Virtual protected native @Cast("bool") boolean event(QEvent arg0);
    @Virtual protected native @Cast("bool") boolean focusNextPrevChild(@Cast("bool") boolean next);
}
