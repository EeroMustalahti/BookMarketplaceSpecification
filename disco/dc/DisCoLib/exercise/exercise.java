/* Generated DisCo engine. Compiler version 0.9 */
package DisCoLib.exercise;
import fi.tut.cs.disco.engine.*;
import java.io.Serializable;
import java.util.Arrays;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Set;
import java.util.Vector;
public class exercise extends DisCo_specification_ {
  public exercise() {
    actions_.addElement(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_register_customer$$$_Customer2$$(actions_.size(), this));
    actions_.addElement(new $_login_customer$$$_Customer2$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_login_admin$$$_Admin6$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$(actions_.size(), this));
    actions_.addElement(new $_logout_customer$$$_Customer2$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_logout_admin$$$_Admin6$$$_System3$$(actions_.size(), this));
    name_of_specification_ = "exercise";
  }
  public String get_disco_compiler_version_() {
    return "0.9 Jul 16 2002 11:32:58 (PRCS: 1.0)";
  }

  public void creation_finished_() throws Assertion_exception_ {
    check_initial_conditions_();
    check_assertions_();
  }
  public void check_assertions_() throws Assertion_exception_ {
    check_global_assertions_();
    // check local assertions
    check_relations_();
  }

  public Vector get_classes_() {
    Vector result_ = new Vector();
    result_.addElement($_System3.get_description_());
    result_.addElement($_Bookstore5.get_description_());
    result_.addElement($_Cart1.get_description_());
    result_.addElement($_Book0.get_description_());
    result_.addElement($_Customer2.get_description_());
    result_.addElement($_Shopkeeper4.get_description_());
    result_.addElement($_Admin6.get_description_());
    return result_;
  }
  Object_vectors_ object_vectors_ = new Object_vectors_();
  public Vector get_objects_(String class_name){
    return object_vectors_.get_by_name_(class_name);
  }
  public DisCo_class_ instantiate_object_(Object_description_ d_) {
    if (d_.class_name == "System") {
      $_System3 o_ = new $_System3(d_);
      o_.$_System3_id_ = object_vectors_.$_System3_objs_.size();
      object_vectors_.$_System3_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Bookstore") {
      $_Bookstore5 o_ = new $_Bookstore5(d_);
      o_.$_Bookstore5_id_ = object_vectors_.$_Bookstore5_objs_.size();
      object_vectors_.$_Bookstore5_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Cart") {
      $_Cart1 o_ = new $_Cart1(d_);
      o_.$_Cart1_id_ = object_vectors_.$_Cart1_objs_.size();
      object_vectors_.$_Cart1_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Book") {
      $_Book0 o_ = new $_Book0(d_);
      o_.$_Book0_id_ = object_vectors_.$_Book0_objs_.size();
      object_vectors_.$_Book0_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Customer") {
      $_Customer2 o_ = new $_Customer2(d_);
      o_.$_Customer2_id_ = object_vectors_.$_Customer2_objs_.size();
      object_vectors_.$_Customer2_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Shopkeeper") {
      $_Shopkeeper4 o_ = new $_Shopkeeper4(d_);
      o_.$_Shopkeeper4_id_ = object_vectors_.$_Shopkeeper4_objs_.size();
      object_vectors_.$_Shopkeeper4_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Admin") {
      $_Admin6 o_ = new $_Admin6(d_);
      o_.$_Admin6_id_ = object_vectors_.$_Admin6_objs_.size();
      object_vectors_.$_Admin6_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else {
      // some error handling code might be added later on
      return null;
    }
  }
  public static DisCo_type_ instantiate_record_value_(Value_description_ v_){
    if(v_.record_type_.type_id_ == 25){
      return new $_Cart1.$_first7(v_);
    }
    if(v_.record_type_.type_id_ == 26){
      return new $_Cart1.$_second8(v_);
    }
    if(v_.record_type_.type_id_ == 27){
      return new $_Cart1.$_third9(v_);
    }
    if(v_.record_type_.type_id_ == 28){
      return new $_Cart1.$_full10(v_);
    }
    if(v_.record_type_.type_id_ == 37){
      return new $_Book0.$_OfficerWithAGoal11(v_);
    }
    if(v_.record_type_.type_id_ == 38){
      return new $_Book0.$_EnemyWithVigor12(v_);
    }
    if(v_.record_type_.type_id_ == 39){
      return new $_Book0.$_GirlsOfThePrison13(v_);
    }
    if(v_.record_type_.type_id_ == 40){
      return new $_Book0.$_GuardiansOfHell14(v_);
    }
    if(v_.record_type_.type_id_ == 41){
      return new $_Book0.$_AliensAndBandits15(v_);
    }
    if(v_.record_type_.type_id_ == 42){
      return new $_Book0.$_AchievementOfDespair16(v_);
    }
    if(v_.record_type_.type_id_ == 43){
      return new $_Book0.$_BorderWithHonor17(v_);
    }
    if(v_.record_type_.type_id_ == 46){
      return new $_Customer2.$_yes18(v_);
    }
    if(v_.record_type_.type_id_ == 47){
      return new $_Customer2.$_no19(v_);
    }
    if(v_.record_type_.type_id_ == 52){
      return new $_Shopkeeper4.$_no20(v_);
    }
    if(v_.record_type_.type_id_ == 53){
      return new $_Shopkeeper4.$_yes21(v_);
    }
    if(v_.record_type_.type_id_ == 56){
      return new $_Admin6.$_no22(v_);
    }
    if(v_.record_type_.type_id_ == 57){
      return new $_Admin6.$_yes23(v_);
    }
    new Assertion(false, "invalid type identifier");
    return null;
  }

  // vd_iter is Value_description_ iterator
  public static DisCo_set_ instantiate_DisCo_set_(Iterator vd_iter, Type_description_ referred_td){
    DisCo_set_ dc_or_ds_ = new DisCo_set_(java.util.Collections.EMPTY_SET);
    while(vd_iter.hasNext()){
      Value_description_ vd = ((Value_description_)vd_iter.next());
      if(referred_td.kind == Type_description_.INTEGER){
        dc_or_ds_.add(new DisCo_int_(vd.intval));
      } else if(referred_td.kind == Type_description_.BOOLEAN){
        dc_or_ds_.add(new DisCo_bool_(vd.boolval));
      } else if(referred_td.kind == Type_description_.REAL){
        dc_or_ds_.add(new DisCo_real_(vd.realval));
      } else if(referred_td.kind == Type_description_.TIME){
        dc_or_ds_.add(new DisCo_real_(vd.realval));
      } else if(referred_td.kind == Type_description_.RECORD){
        dc_or_ds_.add(instantiate_record_value_(vd));
      } else if(referred_td.kind == Type_description_.ENUMERATION){
        new Assertion(false, "Attempt to instantiate enumeration value");
        return null;
      } else if(referred_td.kind == Type_description_.REFERENCE){
        dc_or_ds_.add(new DisCo_int_(vd.referenceval));
      } else if(referred_td.kind == Type_description_.SEQUENCE){
        Iterator iter = vd.containerval.iterator();
        if(iter.hasNext()){ // if not empty set
          DisCo_sequence_ dc_recursive = instantiate_DisCo_sequence_(iter, referred_td.referredType);
          dc_or_ds_.add(dc_recursive);
        }
      } else if(referred_td.kind == Type_description_.SET){
        Iterator iter = vd.containerval.iterator();
        if(iter.hasNext()){ // if not empty set
          DisCo_set_ dc_recursive = instantiate_DisCo_set_(iter, referred_td.referredType);
          dc_or_ds_.add(dc_recursive);
        }
      } else{
        return null; // error
      }
    } // while
    return dc_or_ds_;
  }

  public static Value_description_ disCo_set_to_value_description_(DisCo_set_interface_ set_or_sequence, Type_description_ referred_td){
    Value_description_ ret = new Value_description_();
    for(Iterator iter = set_or_sequence.iterator(); iter.hasNext();){
      Value_description_ vd = new Value_description_();
      Object o = iter.next();
      if(referred_td.kind == Type_description_.RECORD){
        ret.containerval.add(((DisCo_type_)o).get_value_description_());
      } else if(referred_td.kind == Type_description_.ENUMERATION){
        return null;
      } else if(referred_td.kind == Type_description_.SEQUENCE){
        ret.containerval.add(disCo_sequence_to_value_description_((DisCo_sequence_interface_)o, referred_td.referredType));
      } else if(referred_td.kind == Type_description_.SET){
        ret.containerval.add(disCo_set_to_value_description_((DisCo_set_interface_)o, referred_td.referredType));
      } else {
        ret.containerval.add(new Value_description_(o));
      }
    }
    return ret;
  }
  // vd_iter is Value_description_ iterator
  public static DisCo_sequence_ instantiate_DisCo_sequence_(Iterator vd_iter, Type_description_ referred_td){
    DisCo_sequence_ dc_or_ds_ = new DisCo_sequence_(java.util.Collections.EMPTY_LIST);
    while(vd_iter.hasNext()){
      Value_description_ vd = ((Value_description_)vd_iter.next());
      if(referred_td.kind == Type_description_.INTEGER){
        dc_or_ds_.add(new DisCo_int_(vd.intval));
      } else if(referred_td.kind == Type_description_.BOOLEAN){
        dc_or_ds_.add(new DisCo_bool_(vd.boolval));
      } else if(referred_td.kind == Type_description_.REAL){
        dc_or_ds_.add(new DisCo_real_(vd.realval));
      } else if(referred_td.kind == Type_description_.TIME){
        dc_or_ds_.add(new DisCo_real_(vd.realval));
      } else if(referred_td.kind == Type_description_.RECORD){
        dc_or_ds_.add(instantiate_record_value_(vd));
      } else if(referred_td.kind == Type_description_.ENUMERATION){
        new Assertion(false, "Attempt to instantiate enumeration value");
        return null;
      } else if(referred_td.kind == Type_description_.REFERENCE){
        dc_or_ds_.add(new DisCo_int_(vd.referenceval));
      } else if(referred_td.kind == Type_description_.SEQUENCE){
        Iterator iter = vd.containerval.iterator();
        if(iter.hasNext()){ // if not empty set
          DisCo_sequence_ dc_recursive = instantiate_DisCo_sequence_(iter, referred_td.referredType);
          dc_or_ds_.add(dc_recursive);
        }
      } else if(referred_td.kind == Type_description_.SET){
        Iterator iter = vd.containerval.iterator();
        if(iter.hasNext()){ // if not empty set
          DisCo_set_ dc_recursive = instantiate_DisCo_set_(iter, referred_td.referredType);
          dc_or_ds_.add(dc_recursive);
        }
      } else{
        return null; // error
      }
    } // while
    return dc_or_ds_;
  }

  public static Value_description_ disCo_sequence_to_value_description_(DisCo_sequence_interface_ set_or_sequence, Type_description_ referred_td){
    Value_description_ ret = new Value_description_();
    for(Iterator iter = set_or_sequence.iterator(); iter.hasNext();){
      Value_description_ vd = new Value_description_();
      Object o = iter.next();
      if(referred_td.kind == Type_description_.RECORD){
        ret.containerval.add(((DisCo_type_)o).get_value_description_());
      } else if(referred_td.kind == Type_description_.ENUMERATION){
        return null;
      } else if(referred_td.kind == Type_description_.SEQUENCE){
        ret.containerval.add(disCo_sequence_to_value_description_((DisCo_sequence_interface_)o, referred_td.referredType));
      } else if(referred_td.kind == Type_description_.SET){
        ret.containerval.add(disCo_set_to_value_description_((DisCo_set_interface_)o, referred_td.referredType));
      } else {
        ret.containerval.add(new Value_description_(o));
      }
    }
    return ret;
  }
  public DisCo_class_ modify_object_(DisCo_class_ obj, Object_description_ new_state) {
    obj.modify_object_(new_state);
    Iterator iEL = getEngineListeners_();
    while(iEL.hasNext()) {
      ((EngineListener)(iEL.next())).objectStateChanged(obj);
    }
    return obj;
  }

  public DisCo_class_ remove_object_(DisCo_class_ dc) {
    if (dc.get_class_name_() == "System") {
      for(int i = (($_System3)dc).$_System3_id_ + 1; i < object_vectors_.$_System3_objs_.size(); ++i){
        (($_System3)object_vectors_.$_System3_objs_.elementAt(i)).$_System3_id_ -= 1;
      }
      object_vectors_.$_System3_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Bookstore") {
      for(int i = (($_Bookstore5)dc).$_Bookstore5_id_ + 1; i < object_vectors_.$_Bookstore5_objs_.size(); ++i){
        (($_Bookstore5)object_vectors_.$_Bookstore5_objs_.elementAt(i)).$_Bookstore5_id_ -= 1;
      }
      object_vectors_.$_Bookstore5_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Cart") {
      for(int i = (($_Cart1)dc).$_Cart1_id_ + 1; i < object_vectors_.$_Cart1_objs_.size(); ++i){
        (($_Cart1)object_vectors_.$_Cart1_objs_.elementAt(i)).$_Cart1_id_ -= 1;
      }
      object_vectors_.$_Cart1_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Book") {
      for(int i = (($_Book0)dc).$_Book0_id_ + 1; i < object_vectors_.$_Book0_objs_.size(); ++i){
        (($_Book0)object_vectors_.$_Book0_objs_.elementAt(i)).$_Book0_id_ -= 1;
      }
      object_vectors_.$_Book0_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Customer") {
      for(int i = (($_Customer2)dc).$_Customer2_id_ + 1; i < object_vectors_.$_Customer2_objs_.size(); ++i){
        (($_Customer2)object_vectors_.$_Customer2_objs_.elementAt(i)).$_Customer2_id_ -= 1;
      }
      object_vectors_.$_Customer2_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Shopkeeper") {
      for(int i = (($_Shopkeeper4)dc).$_Shopkeeper4_id_ + 1; i < object_vectors_.$_Shopkeeper4_objs_.size(); ++i){
        (($_Shopkeeper4)object_vectors_.$_Shopkeeper4_objs_.elementAt(i)).$_Shopkeeper4_id_ -= 1;
      }
      object_vectors_.$_Shopkeeper4_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Admin") {
      for(int i = (($_Admin6)dc).$_Admin6_id_ + 1; i < object_vectors_.$_Admin6_objs_.size(); ++i){
        (($_Admin6)object_vectors_.$_Admin6_objs_.elementAt(i)).$_Admin6_id_ -= 1;
      }
      object_vectors_.$_Admin6_objs_.remove(dc);
    }
    else {
new Assertion(false, "remove_object_: illegal name of class");
      return null;
    }
    boolean found = false;
    for(int i = 0; i < objects_.size(); i++){
      if(((DisCo_class_)objects_.elementAt(i)).objectID_ == dc.objectID_){
        objects_.remove(i);
        found = true;
        break;
      }
    }
    new Assertion(found, "remove_object_: Illegal objectID_ (" + new Integer(dc.objectID_).toString() + ")");
    Iterator iEL = getEngineListeners_();
    while(iEL.hasNext()) {
      ((EngineListener)(iEL.next())).objectRemoved(dc);
    }
    return dc;
  }
  public Vector get_relations_() {
    Vector result_ = new Vector();
    for(int i = 0; i < relations_.size(); ++i){
      result_.add(((DisCo_relation_class_)relations_.elementAt(i)).get_description_());
    }
    return result_;
  }
  public Vector get_relation_instances_() {
    Vector result_ = new Vector();
    for(int i = 0; i < relations_.size(); ++i){
      result_.addAll(((DisCo_relation_class_)relations_.elementAt(i)).set_of_pairs_);
    }
    return result_;
  }
  private int next_relationID_ = 0;
  public int get_relationID_() {
    int ret = next_relationID_++;
    return ret;
  }
  public DisCo_relation_ set_relation_(Relation_instance_description_ rid) {
    DisCo_relation_ dr = ((DisCo_relation_class_)relations_.elementAt(rid.theRelation_.relationID_)).
        set_relation_((DisCo_class_)(objects_.get(rid.leftfID_)),
        (DisCo_class_)(objects_.get(rid.rightID_)));
    return dr;
  }
  public void remove_relation_instance_(DisCo_relation_ dr) {
    ((DisCo_relation_class_)relations_.elementAt(dr.theRelation_.relationID_)).remove_relation_instance_(dr);
  }
  public void check_relations_() throws Relation_violation_exception_ {
    for(int i = 0; i < relations_.size(); ++i){
      ((DisCo_relation_class_)relations_.elementAt(i)).check_relation_();
    }
  }
  public void check_global_assertions_() throws Assertion_exception_ {
  }
  public void check_initial_conditions_() throws Assertion_exception_ {
  }

  public boolean has_realtime_aspects_() { 
    return false;
  }

  public void disable_checking_assertion_(Assertion_exception_ ae){
  }
  public void enable_checking_assertion_(Assertion_exception_ ae){
  }
  // Function for each quantified expression:
}

class Object_vectors_ implements Serializable {
  public Vector get_by_name_(String java_name){
    if(java_name.equals("$_System3")){
      return $_System3_objs_;
    } else     if(java_name.equals("$_Bookstore5")){
      return $_Bookstore5_objs_;
    } else     if(java_name.equals("$_Cart1")){
      return $_Cart1_objs_;
    } else     if(java_name.equals("$_Book0")){
      return $_Book0_objs_;
    } else     if(java_name.equals("$_Customer2")){
      return $_Customer2_objs_;
    } else     if(java_name.equals("$_Shopkeeper4")){
      return $_Shopkeeper4_objs_;
    } else     if(java_name.equals("$_Admin6")){
      return $_Admin6_objs_;
    } else {
      return null;//assert(false)
    }
  }
  Vector $_System3_objs_ = new Vector();
  Vector $_Bookstore5_objs_ = new Vector();
  Vector $_Cart1_objs_ = new Vector();
  Vector $_Book0_objs_ = new Vector();
  Vector $_Customer2_objs_ = new Vector();
  Vector $_Shopkeeper4_objs_ = new Vector();
  Vector $_Admin6_objs_ = new Vector();
}

class Constants_ {
}

interface $_System3_interface_ {
  DisCo_int_ get_$_active_customer24_();
  void set_$_active_customer24_(int val_);
  DisCo_int_ get_$_active_shopkeeper25_();
  void set_$_active_shopkeeper25_(int val_);
  DisCo_int_ get_$_active_admin26_();
  void set_$_active_admin26_(int val_);
}

interface $_Bookstore5_interface_ {
  DisCo_int_ get_$_owner27_();
  void set_$_owner27_(int val_);
}

interface $_Cart1_interface_ {
  DisCo_int_ get_$_book_128_();
  void set_$_book_128_(int val_);
  DisCo_int_ get_$_book_229_();
  void set_$_book_229_(int val_);
  DisCo_int_ get_$_book_330_();
  void set_$_book_330_(int val_);
  DisCo_type_ get_$_next_empty31_();
  void set_$_next_empty31_(DisCo_type_ val_);
}

interface $_Book0_interface_ {
  DisCo_int_ get_$_owned_bookstore32_();
  void set_$_owned_bookstore32_(int val_);
  DisCo_int_ get_$_owned_customer33_();
  void set_$_owned_customer33_(int val_);
  DisCo_int_ get_$_in_cart34_();
  void set_$_in_cart34_(int val_);
  DisCo_type_ get_$_name35_();
  void set_$_name35_(DisCo_type_ val_);
}

interface $_Customer2_interface_ {
  DisCo_type_ get_$_registered36_();
  void set_$_registered36_(DisCo_type_ val_);
  DisCo_int_ get_$_browsing_currently37_();
  void set_$_browsing_currently37_(int val_);
}

interface $_Shopkeeper4_interface_ {
  DisCo_type_ get_$_in_use38_();
  void set_$_in_use38_(DisCo_type_ val_);
}

interface $_Admin6_interface_ {
  DisCo_type_ get_$_in_use39_();
  void set_$_in_use39_(DisCo_type_ val_);
}

interface $_first7_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_second8_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_third9_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_full10_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_OfficerWithAGoal11_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_EnemyWithVigor12_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_GirlsOfThePrison13_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_GuardiansOfHell14_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_AliensAndBandits15_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_AchievementOfDespair16_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_BorderWithHonor17_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_yes18_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_no19_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_no20_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_yes21_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_no22_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_yes23_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}


class $_System3 extends DisCo_class_ implements $_System3_interface_ {
  public $_System3() {
    super();
  }

  public $_System3(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_active_customer24 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_active_shopkeeper25 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
    $_active_admin26 = ((Value_description_)d_.fields.elementAt(2)).referenceval;
  }

  public int $_System3_id_;
  public String get_class_name_() {
    return "System";
  }

  public String toString() {
    return get_name_() + "(" + "active_customer = " + get_$_active_customer24_().toString() + " ;" + "active_shopkeeper = " + get_$_active_shopkeeper25_().toString() + " ;" + "active_admin = " + get_$_active_admin26_().toString() + " ;" + ")";
  }







  int $_active_customer24;
  public DisCo_int_ get_$_active_customer24_() {
    return new DisCo_int_($_active_customer24);
  }
  public void set_$_active_customer24_(int val_) {
    $_active_customer24 = val_;
  }


  int $_active_shopkeeper25;
  public DisCo_int_ get_$_active_shopkeeper25_() {
    return new DisCo_int_($_active_shopkeeper25);
  }
  public void set_$_active_shopkeeper25_(int val_) {
    $_active_shopkeeper25 = val_;
  }


  int $_active_admin26;
  public DisCo_int_ get_$_active_admin26_() {
    return new DisCo_int_($_active_admin26);
  }
  public void set_$_active_admin26_(int val_) {
    $_active_admin26 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "System";
    Field_description_ active_customer_field_ = new Field_description_();
    active_customer_field_.name = "active_customer";
    Type_description_ active_customer_type_ = new Type_description_(Type_description_.REFERENCE,8, "_exercise_reference_to_Customer__GenName0", "Customer");
    active_customer_field_.value.referenceval = $_active_customer24;
    active_customer_field_.type = active_customer_type_;
    d_.fields.addElement(active_customer_field_);

    Field_description_ active_shopkeeper_field_ = new Field_description_();
    active_shopkeeper_field_.name = "active_shopkeeper";
    Type_description_ active_shopkeeper_type_ = new Type_description_(Type_description_.REFERENCE,10, "_exercise_reference_to_Shopkeeper__GenName1", "Shopkeeper");
    active_shopkeeper_field_.value.referenceval = $_active_shopkeeper25;
    active_shopkeeper_field_.type = active_shopkeeper_type_;
    d_.fields.addElement(active_shopkeeper_field_);

    Field_description_ active_admin_field_ = new Field_description_();
    active_admin_field_.name = "active_admin";
    Type_description_ active_admin_type_ = new Type_description_(Type_description_.REFERENCE,12, "_exercise_reference_to_Admin__GenName2", "Admin");
    active_admin_field_.value.referenceval = $_active_admin26;
    active_admin_field_.type = active_admin_type_;
    d_.fields.addElement(active_admin_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "System";
    Field_description_ active_customer_field_ = new Field_description_();
    active_customer_field_.name = "active_customer";
    Type_description_ active_customer_type_ = new Type_description_(Type_description_.REFERENCE,8, "_exercise_reference_to_Customer__GenName0", "Customer");
    active_customer_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    active_customer_field_.type = active_customer_type_;
    d_.fields.addElement(active_customer_field_);

    Field_description_ active_shopkeeper_field_ = new Field_description_();
    active_shopkeeper_field_.name = "active_shopkeeper";
    Type_description_ active_shopkeeper_type_ = new Type_description_(Type_description_.REFERENCE,10, "_exercise_reference_to_Shopkeeper__GenName1", "Shopkeeper");
    active_shopkeeper_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    active_shopkeeper_field_.type = active_shopkeeper_type_;
    d_.fields.addElement(active_shopkeeper_field_);

    Field_description_ active_admin_field_ = new Field_description_();
    active_admin_field_.name = "active_admin";
    Type_description_ active_admin_type_ = new Type_description_(Type_description_.REFERENCE,12, "_exercise_reference_to_Admin__GenName2", "Admin");
    active_admin_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    active_admin_field_.type = active_admin_type_;
    d_.fields.addElement(active_admin_field_);

    return d_;
  }
}


class $_Bookstore5 extends DisCo_class_ implements $_Bookstore5_interface_ {
  public $_Bookstore5() {
    super();
  }

  public $_Bookstore5(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_owner27 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
  }

  public int $_Bookstore5_id_;
  public String get_class_name_() {
    return "Bookstore";
  }

  public String toString() {
    return get_name_() + "(" + "owner = " + get_$_owner27_().toString() + " ;" + ")";
  }



  int $_owner27;
  public DisCo_int_ get_$_owner27_() {
    return new DisCo_int_($_owner27);
  }
  public void set_$_owner27_(int val_) {
    $_owner27 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Bookstore";
    Field_description_ owner_field_ = new Field_description_();
    owner_field_.name = "owner";
    Type_description_ owner_type_ = new Type_description_(Type_description_.REFERENCE,15, "_exercise_reference_to_Shopkeeper__GenName3", "Shopkeeper");
    owner_field_.value.referenceval = $_owner27;
    owner_field_.type = owner_type_;
    d_.fields.addElement(owner_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Bookstore";
    Field_description_ owner_field_ = new Field_description_();
    owner_field_.name = "owner";
    Type_description_ owner_type_ = new Type_description_(Type_description_.REFERENCE,15, "_exercise_reference_to_Shopkeeper__GenName3", "Shopkeeper");
    owner_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    owner_field_.type = owner_type_;
    d_.fields.addElement(owner_field_);

    return d_;
  }
}


class $_Cart1 extends DisCo_class_ implements $_Cart1_interface_ {
  public $_Cart1() {
    super();
  }

  public $_Cart1(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_book_128 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_book_229 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
    $_book_330 = ((Value_description_)d_.fields.elementAt(2)).referenceval;
    $_next_empty31 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(3));
  }

  public int $_Cart1_id_;
  public String get_class_name_() {
    return "Cart";
  }

  public String toString() {
    return get_name_() + "(" + "book_1 = " + get_$_book_128_().toString() + " ;" + "book_2 = " + get_$_book_229_().toString() + " ;" + "book_3 = " + get_$_book_330_().toString() + " ;" + "next_empty = " + get_$_next_empty31_().toString() + " ;" + ")";
  }






  static class $_first7 extends DisCo_type_ implements $_first7_interface_ {
    public int get_id_of_type_() {
      return 25;
    }

    public $_first7(Value_description_ d_) {
      super();
      set_name_("first");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_first7() {
      super();
      set_name_("first");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_first7_interface_ o_ = ($_first7_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 25, "first");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_first7 ooo = ($_first7) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_first7 ooo = ($_first7) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 25, "first");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_second8 extends DisCo_type_ implements $_second8_interface_ {
    public int get_id_of_type_() {
      return 26;
    }

    public $_second8(Value_description_ d_) {
      super();
      set_name_("second");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_second8() {
      super();
      set_name_("second");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_second8_interface_ o_ = ($_second8_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 26, "second");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_second8 ooo = ($_second8) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_second8 ooo = ($_second8) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 26, "second");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_third9 extends DisCo_type_ implements $_third9_interface_ {
    public int get_id_of_type_() {
      return 27;
    }

    public $_third9(Value_description_ d_) {
      super();
      set_name_("third");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_third9() {
      super();
      set_name_("third");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_third9_interface_ o_ = ($_third9_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 27, "third");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_third9 ooo = ($_third9) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_third9 ooo = ($_third9) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 27, "third");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_full10 extends DisCo_type_ implements $_full10_interface_ {
    public int get_id_of_type_() {
      return 28;
    }

    public $_full10(Value_description_ d_) {
      super();
      set_name_("full");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_full10() {
      super();
      set_name_("full");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_full10_interface_ o_ = ($_full10_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 28, "full");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_full10 ooo = ($_full10) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_full10 ooo = ($_full10) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 28, "full");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }




  int $_book_128;
  public DisCo_int_ get_$_book_128_() {
    return new DisCo_int_($_book_128);
  }
  public void set_$_book_128_(int val_) {
    $_book_128 = val_;
  }


  int $_book_229;
  public DisCo_int_ get_$_book_229_() {
    return new DisCo_int_($_book_229);
  }
  public void set_$_book_229_(int val_) {
    $_book_229 = val_;
  }


  int $_book_330;
  public DisCo_int_ get_$_book_330_() {
    return new DisCo_int_($_book_330);
  }
  public void set_$_book_330_(int val_) {
    $_book_330 = val_;
  }






  DisCo_type_ $_next_empty31;
  public DisCo_type_ get_$_next_empty31_() {
    return $_next_empty31;
  }
  public void set_$_next_empty31_(DisCo_type_ val_) {
    $_next_empty31 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Cart";
    Field_description_ book_1_field_ = new Field_description_();
    book_1_field_.name = "book_1";
    Type_description_ book_1_type_ = new Type_description_(Type_description_.REFERENCE,18, "_exercise_reference_to_Book__GenName4", "Book");
    book_1_field_.value.referenceval = $_book_128;
    book_1_field_.type = book_1_type_;
    d_.fields.addElement(book_1_field_);

    Field_description_ book_2_field_ = new Field_description_();
    book_2_field_.name = "book_2";
    Type_description_ book_2_type_ = new Type_description_(Type_description_.REFERENCE,20, "_exercise_reference_to_Book__GenName5", "Book");
    book_2_field_.value.referenceval = $_book_229;
    book_2_field_.type = book_2_type_;
    d_.fields.addElement(book_2_field_);

    Field_description_ book_3_field_ = new Field_description_();
    book_3_field_.name = "book_3";
    Type_description_ book_3_type_ = new Type_description_(Type_description_.REFERENCE,22, "_exercise_reference_to_Book__GenName6", "Book");
    book_3_field_.value.referenceval = $_book_330;
    book_3_field_.type = book_3_type_;
    d_.fields.addElement(book_3_field_);

    Field_description_ next_empty_field_ = new Field_description_();
    next_empty_field_.name = "next_empty";
    Type_description_ next_empty_type_ = new Type_description_(Type_description_.ENUMERATION, 24);
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_first7.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_second8.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_third9.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_full10.get_description_());
    next_empty_field_.value.record_type_ = $_next_empty31.get_attributes_();
    get_$_next_empty31_().fields_to_value_description_(next_empty_field_.value);
    next_empty_field_.type = next_empty_type_;
    d_.fields.addElement(next_empty_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Cart";
    Field_description_ book_1_field_ = new Field_description_();
    book_1_field_.name = "book_1";
    Type_description_ book_1_type_ = new Type_description_(Type_description_.REFERENCE,18, "_exercise_reference_to_Book__GenName4", "Book");
    book_1_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    book_1_field_.type = book_1_type_;
    d_.fields.addElement(book_1_field_);

    Field_description_ book_2_field_ = new Field_description_();
    book_2_field_.name = "book_2";
    Type_description_ book_2_type_ = new Type_description_(Type_description_.REFERENCE,20, "_exercise_reference_to_Book__GenName5", "Book");
    book_2_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    book_2_field_.type = book_2_type_;
    d_.fields.addElement(book_2_field_);

    Field_description_ book_3_field_ = new Field_description_();
    book_3_field_.name = "book_3";
    Type_description_ book_3_type_ = new Type_description_(Type_description_.REFERENCE,22, "_exercise_reference_to_Book__GenName6", "Book");
    book_3_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    book_3_field_.type = book_3_type_;
    d_.fields.addElement(book_3_field_);

    Field_description_ next_empty_field_ = new Field_description_();
    next_empty_field_.name = "next_empty";
    Type_description_ next_empty_type_ = new Type_description_(Type_description_.ENUMERATION, 24);
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_first7.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_second8.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_third9.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Cart1.$_full10.get_description_());
    next_empty_field_.value = $_Cart1.$_first7.get_default_value_description_();
    next_empty_field_.type = next_empty_type_;
    d_.fields.addElement(next_empty_field_);

    return d_;
  }
}


class $_Book0 extends DisCo_class_ implements $_Book0_interface_ {
  public $_Book0() {
    super();
  }

  public $_Book0(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_owned_bookstore32 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_owned_customer33 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
    $_in_cart34 = ((Value_description_)d_.fields.elementAt(2)).referenceval;
    $_name35 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(3));
  }

  public int $_Book0_id_;
  public String get_class_name_() {
    return "Book";
  }

  public String toString() {
    return get_name_() + "(" + "owned_bookstore = " + get_$_owned_bookstore32_().toString() + " ;" + "owned_customer = " + get_$_owned_customer33_().toString() + " ;" + "in_cart = " + get_$_in_cart34_().toString() + " ;" + "name = " + get_$_name35_().toString() + " ;" + ")";
  }






  static class $_OfficerWithAGoal11 extends DisCo_type_ implements $_OfficerWithAGoal11_interface_ {
    public int get_id_of_type_() {
      return 37;
    }

    public $_OfficerWithAGoal11(Value_description_ d_) {
      super();
      set_name_("OfficerWithAGoal");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_OfficerWithAGoal11() {
      super();
      set_name_("OfficerWithAGoal");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_OfficerWithAGoal11_interface_ o_ = ($_OfficerWithAGoal11_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 37, "OfficerWithAGoal");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_OfficerWithAGoal11 ooo = ($_OfficerWithAGoal11) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_OfficerWithAGoal11 ooo = ($_OfficerWithAGoal11) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 37, "OfficerWithAGoal");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_EnemyWithVigor12 extends DisCo_type_ implements $_EnemyWithVigor12_interface_ {
    public int get_id_of_type_() {
      return 38;
    }

    public $_EnemyWithVigor12(Value_description_ d_) {
      super();
      set_name_("EnemyWithVigor");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_EnemyWithVigor12() {
      super();
      set_name_("EnemyWithVigor");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_EnemyWithVigor12_interface_ o_ = ($_EnemyWithVigor12_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 38, "EnemyWithVigor");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_EnemyWithVigor12 ooo = ($_EnemyWithVigor12) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_EnemyWithVigor12 ooo = ($_EnemyWithVigor12) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 38, "EnemyWithVigor");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_GirlsOfThePrison13 extends DisCo_type_ implements $_GirlsOfThePrison13_interface_ {
    public int get_id_of_type_() {
      return 39;
    }

    public $_GirlsOfThePrison13(Value_description_ d_) {
      super();
      set_name_("GirlsOfThePrison");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_GirlsOfThePrison13() {
      super();
      set_name_("GirlsOfThePrison");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_GirlsOfThePrison13_interface_ o_ = ($_GirlsOfThePrison13_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 39, "GirlsOfThePrison");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_GirlsOfThePrison13 ooo = ($_GirlsOfThePrison13) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_GirlsOfThePrison13 ooo = ($_GirlsOfThePrison13) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 39, "GirlsOfThePrison");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_GuardiansOfHell14 extends DisCo_type_ implements $_GuardiansOfHell14_interface_ {
    public int get_id_of_type_() {
      return 40;
    }

    public $_GuardiansOfHell14(Value_description_ d_) {
      super();
      set_name_("GuardiansOfHell");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_GuardiansOfHell14() {
      super();
      set_name_("GuardiansOfHell");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_GuardiansOfHell14_interface_ o_ = ($_GuardiansOfHell14_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 40, "GuardiansOfHell");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_GuardiansOfHell14 ooo = ($_GuardiansOfHell14) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_GuardiansOfHell14 ooo = ($_GuardiansOfHell14) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 40, "GuardiansOfHell");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_AliensAndBandits15 extends DisCo_type_ implements $_AliensAndBandits15_interface_ {
    public int get_id_of_type_() {
      return 41;
    }

    public $_AliensAndBandits15(Value_description_ d_) {
      super();
      set_name_("AliensAndBandits");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_AliensAndBandits15() {
      super();
      set_name_("AliensAndBandits");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_AliensAndBandits15_interface_ o_ = ($_AliensAndBandits15_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 41, "AliensAndBandits");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_AliensAndBandits15 ooo = ($_AliensAndBandits15) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_AliensAndBandits15 ooo = ($_AliensAndBandits15) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 41, "AliensAndBandits");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_AchievementOfDespair16 extends DisCo_type_ implements $_AchievementOfDespair16_interface_ {
    public int get_id_of_type_() {
      return 42;
    }

    public $_AchievementOfDespair16(Value_description_ d_) {
      super();
      set_name_("AchievementOfDespair");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_AchievementOfDespair16() {
      super();
      set_name_("AchievementOfDespair");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_AchievementOfDespair16_interface_ o_ = ($_AchievementOfDespair16_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 42, "AchievementOfDespair");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_AchievementOfDespair16 ooo = ($_AchievementOfDespair16) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_AchievementOfDespair16 ooo = ($_AchievementOfDespair16) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 42, "AchievementOfDespair");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_BorderWithHonor17 extends DisCo_type_ implements $_BorderWithHonor17_interface_ {
    public int get_id_of_type_() {
      return 43;
    }

    public $_BorderWithHonor17(Value_description_ d_) {
      super();
      set_name_("BorderWithHonor");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_BorderWithHonor17() {
      super();
      set_name_("BorderWithHonor");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_BorderWithHonor17_interface_ o_ = ($_BorderWithHonor17_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 43, "BorderWithHonor");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_BorderWithHonor17 ooo = ($_BorderWithHonor17) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_BorderWithHonor17 ooo = ($_BorderWithHonor17) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 43, "BorderWithHonor");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }




  int $_owned_bookstore32;
  public DisCo_int_ get_$_owned_bookstore32_() {
    return new DisCo_int_($_owned_bookstore32);
  }
  public void set_$_owned_bookstore32_(int val_) {
    $_owned_bookstore32 = val_;
  }


  int $_owned_customer33;
  public DisCo_int_ get_$_owned_customer33_() {
    return new DisCo_int_($_owned_customer33);
  }
  public void set_$_owned_customer33_(int val_) {
    $_owned_customer33 = val_;
  }


  int $_in_cart34;
  public DisCo_int_ get_$_in_cart34_() {
    return new DisCo_int_($_in_cart34);
  }
  public void set_$_in_cart34_(int val_) {
    $_in_cart34 = val_;
  }









  DisCo_type_ $_name35;
  public DisCo_type_ get_$_name35_() {
    return $_name35;
  }
  public void set_$_name35_(DisCo_type_ val_) {
    $_name35 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Book";
    Field_description_ owned_bookstore_field_ = new Field_description_();
    owned_bookstore_field_.name = "owned_bookstore";
    Type_description_ owned_bookstore_type_ = new Type_description_(Type_description_.REFERENCE,30, "_exercise_reference_to_Bookstore__GenName8", "Bookstore");
    owned_bookstore_field_.value.referenceval = $_owned_bookstore32;
    owned_bookstore_field_.type = owned_bookstore_type_;
    d_.fields.addElement(owned_bookstore_field_);

    Field_description_ owned_customer_field_ = new Field_description_();
    owned_customer_field_.name = "owned_customer";
    Type_description_ owned_customer_type_ = new Type_description_(Type_description_.REFERENCE,32, "_exercise_reference_to_Customer__GenName9", "Customer");
    owned_customer_field_.value.referenceval = $_owned_customer33;
    owned_customer_field_.type = owned_customer_type_;
    d_.fields.addElement(owned_customer_field_);

    Field_description_ in_cart_field_ = new Field_description_();
    in_cart_field_.name = "in_cart";
    Type_description_ in_cart_type_ = new Type_description_(Type_description_.REFERENCE,34, "_exercise_reference_to_Cart__GenName10", "Cart");
    in_cart_field_.value.referenceval = $_in_cart34;
    in_cart_field_.type = in_cart_type_;
    d_.fields.addElement(in_cart_field_);

    Field_description_ name_field_ = new Field_description_();
    name_field_.name = "name";
    Type_description_ name_type_ = new Type_description_(Type_description_.ENUMERATION, 36);
    name_type_.enumerationTypes.addElement($_Book0.$_OfficerWithAGoal11.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_EnemyWithVigor12.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GirlsOfThePrison13.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GuardiansOfHell14.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AliensAndBandits15.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AchievementOfDespair16.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_BorderWithHonor17.get_description_());
    name_field_.value.record_type_ = $_name35.get_attributes_();
    get_$_name35_().fields_to_value_description_(name_field_.value);
    name_field_.type = name_type_;
    d_.fields.addElement(name_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Book";
    Field_description_ owned_bookstore_field_ = new Field_description_();
    owned_bookstore_field_.name = "owned_bookstore";
    Type_description_ owned_bookstore_type_ = new Type_description_(Type_description_.REFERENCE,30, "_exercise_reference_to_Bookstore__GenName8", "Bookstore");
    owned_bookstore_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    owned_bookstore_field_.type = owned_bookstore_type_;
    d_.fields.addElement(owned_bookstore_field_);

    Field_description_ owned_customer_field_ = new Field_description_();
    owned_customer_field_.name = "owned_customer";
    Type_description_ owned_customer_type_ = new Type_description_(Type_description_.REFERENCE,32, "_exercise_reference_to_Customer__GenName9", "Customer");
    owned_customer_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    owned_customer_field_.type = owned_customer_type_;
    d_.fields.addElement(owned_customer_field_);

    Field_description_ in_cart_field_ = new Field_description_();
    in_cart_field_.name = "in_cart";
    Type_description_ in_cart_type_ = new Type_description_(Type_description_.REFERENCE,34, "_exercise_reference_to_Cart__GenName10", "Cart");
    in_cart_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    in_cart_field_.type = in_cart_type_;
    d_.fields.addElement(in_cart_field_);

    Field_description_ name_field_ = new Field_description_();
    name_field_.name = "name";
    Type_description_ name_type_ = new Type_description_(Type_description_.ENUMERATION, 36);
    name_type_.enumerationTypes.addElement($_Book0.$_OfficerWithAGoal11.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_EnemyWithVigor12.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GirlsOfThePrison13.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GuardiansOfHell14.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AliensAndBandits15.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AchievementOfDespair16.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_BorderWithHonor17.get_description_());
    name_field_.value = $_Book0.$_OfficerWithAGoal11.get_default_value_description_();
    name_field_.type = name_type_;
    d_.fields.addElement(name_field_);

    return d_;
  }
}


class $_Customer2 extends DisCo_class_ implements $_Customer2_interface_ {
  public $_Customer2() {
    super();
  }

  public $_Customer2(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_registered36 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(0));
    $_browsing_currently37 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
  }

  public int $_Customer2_id_;
  public String get_class_name_() {
    return "Customer";
  }

  public String toString() {
    return get_name_() + "(" + "registered = " + get_$_registered36_().toString() + " ;" + "browsing_currently = " + get_$_browsing_currently37_().toString() + " ;" + ")";
  }
  static class $_yes18 extends DisCo_type_ implements $_yes18_interface_ {
    public int get_id_of_type_() {
      return 46;
    }

    public $_yes18(Value_description_ d_) {
      super();
      set_name_("yes");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_yes18() {
      super();
      set_name_("yes");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_yes18_interface_ o_ = ($_yes18_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 46, "yes");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_yes18 ooo = ($_yes18) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_yes18 ooo = ($_yes18) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 46, "yes");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_no19 extends DisCo_type_ implements $_no19_interface_ {
    public int get_id_of_type_() {
      return 47;
    }

    public $_no19(Value_description_ d_) {
      super();
      set_name_("no");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_no19() {
      super();
      set_name_("no");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_no19_interface_ o_ = ($_no19_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 47, "no");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_no19 ooo = ($_no19) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_no19 ooo = ($_no19) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 47, "no");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }








  DisCo_type_ $_registered36;
  public DisCo_type_ get_$_registered36_() {
    return $_registered36;
  }
  public void set_$_registered36_(DisCo_type_ val_) {
    $_registered36 = val_;
  }


  int $_browsing_currently37;
  public DisCo_int_ get_$_browsing_currently37_() {
    return new DisCo_int_($_browsing_currently37);
  }
  public void set_$_browsing_currently37_(int val_) {
    $_browsing_currently37 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Customer";
    Field_description_ registered_field_ = new Field_description_();
    registered_field_.name = "registered";
    Type_description_ registered_type_ = new Type_description_(Type_description_.ENUMERATION, 45);
    registered_type_.enumerationTypes.addElement($_Customer2.$_yes18.get_description_());
    registered_type_.enumerationTypes.addElement($_Customer2.$_no19.get_description_());
    registered_field_.value.record_type_ = $_registered36.get_attributes_();
    get_$_registered36_().fields_to_value_description_(registered_field_.value);
    registered_field_.type = registered_type_;
    d_.fields.addElement(registered_field_);

    Field_description_ browsing_currently_field_ = new Field_description_();
    browsing_currently_field_.name = "browsing_currently";
    Type_description_ browsing_currently_type_ = new Type_description_(Type_description_.REFERENCE,48, "_exercise_reference_to_Book__GenName13", "Book");
    browsing_currently_field_.value.referenceval = $_browsing_currently37;
    browsing_currently_field_.type = browsing_currently_type_;
    d_.fields.addElement(browsing_currently_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Customer";
    Field_description_ registered_field_ = new Field_description_();
    registered_field_.name = "registered";
    Type_description_ registered_type_ = new Type_description_(Type_description_.ENUMERATION, 45);
    registered_type_.enumerationTypes.addElement($_Customer2.$_yes18.get_description_());
    registered_type_.enumerationTypes.addElement($_Customer2.$_no19.get_description_());
    registered_field_.value = $_Customer2.$_yes18.get_default_value_description_();
    registered_field_.type = registered_type_;
    d_.fields.addElement(registered_field_);

    Field_description_ browsing_currently_field_ = new Field_description_();
    browsing_currently_field_.name = "browsing_currently";
    Type_description_ browsing_currently_type_ = new Type_description_(Type_description_.REFERENCE,48, "_exercise_reference_to_Book__GenName13", "Book");
    browsing_currently_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    browsing_currently_field_.type = browsing_currently_type_;
    d_.fields.addElement(browsing_currently_field_);

    return d_;
  }
}


class $_Shopkeeper4 extends DisCo_class_ implements $_Shopkeeper4_interface_ {
  public $_Shopkeeper4() {
    super();
  }

  public $_Shopkeeper4(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_in_use38 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(0));
  }

  public int $_Shopkeeper4_id_;
  public String get_class_name_() {
    return "Shopkeeper";
  }

  public String toString() {
    return get_name_() + "(" + "in_use = " + get_$_in_use38_().toString() + " ;" + ")";
  }
  static class $_no20 extends DisCo_type_ implements $_no20_interface_ {
    public int get_id_of_type_() {
      return 52;
    }

    public $_no20(Value_description_ d_) {
      super();
      set_name_("no");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_no20() {
      super();
      set_name_("no");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_no20_interface_ o_ = ($_no20_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 52, "no");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_no20 ooo = ($_no20) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_no20 ooo = ($_no20) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 52, "no");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_yes21 extends DisCo_type_ implements $_yes21_interface_ {
    public int get_id_of_type_() {
      return 53;
    }

    public $_yes21(Value_description_ d_) {
      super();
      set_name_("yes");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_yes21() {
      super();
      set_name_("yes");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_yes21_interface_ o_ = ($_yes21_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 53, "yes");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_yes21 ooo = ($_yes21) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_yes21 ooo = ($_yes21) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 53, "yes");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }






  DisCo_type_ $_in_use38;
  public DisCo_type_ get_$_in_use38_() {
    return $_in_use38;
  }
  public void set_$_in_use38_(DisCo_type_ val_) {
    $_in_use38 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Shopkeeper";
    Field_description_ in_use_field_ = new Field_description_();
    in_use_field_.name = "in_use";
    Type_description_ in_use_type_ = new Type_description_(Type_description_.ENUMERATION, 51);
    in_use_type_.enumerationTypes.addElement($_Shopkeeper4.$_no20.get_description_());
    in_use_type_.enumerationTypes.addElement($_Shopkeeper4.$_yes21.get_description_());
    in_use_field_.value.record_type_ = $_in_use38.get_attributes_();
    get_$_in_use38_().fields_to_value_description_(in_use_field_.value);
    in_use_field_.type = in_use_type_;
    d_.fields.addElement(in_use_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Shopkeeper";
    Field_description_ in_use_field_ = new Field_description_();
    in_use_field_.name = "in_use";
    Type_description_ in_use_type_ = new Type_description_(Type_description_.ENUMERATION, 51);
    in_use_type_.enumerationTypes.addElement($_Shopkeeper4.$_no20.get_description_());
    in_use_type_.enumerationTypes.addElement($_Shopkeeper4.$_yes21.get_description_());
    in_use_field_.value = $_Shopkeeper4.$_no20.get_default_value_description_();
    in_use_field_.type = in_use_type_;
    d_.fields.addElement(in_use_field_);

    return d_;
  }
}


class $_Admin6 extends DisCo_class_ implements $_Admin6_interface_ {
  public $_Admin6() {
    super();
  }

  public $_Admin6(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_in_use39 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(0));
  }

  public int $_Admin6_id_;
  public String get_class_name_() {
    return "Admin";
  }

  public String toString() {
    return get_name_() + "(" + "in_use = " + get_$_in_use39_().toString() + " ;" + ")";
  }
  static class $_no22 extends DisCo_type_ implements $_no22_interface_ {
    public int get_id_of_type_() {
      return 56;
    }

    public $_no22(Value_description_ d_) {
      super();
      set_name_("no");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_no22() {
      super();
      set_name_("no");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_no22_interface_ o_ = ($_no22_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 56, "no");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_no22 ooo = ($_no22) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_no22 ooo = ($_no22) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 56, "no");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_yes23 extends DisCo_type_ implements $_yes23_interface_ {
    public int get_id_of_type_() {
      return 57;
    }

    public $_yes23(Value_description_ d_) {
      super();
      set_name_("yes");
    }

    boolean undefined_value_$_ = false;
    public boolean is_undef_() {
      return undefined_value_$_;
    }
    void set_undef_(){
    undefined_value_$_ = true;
    }

        public Object get_val_() {
        if(is_undef_()){
        throw new Undef_aggregate_exception_();
    }
    return this;
    }
    public $_yes23() {
      super();
      set_name_("yes");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_yes23_interface_ o_ = ($_yes23_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 57, "yes");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_yes23 ooo = ($_yes23) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_yes23 ooo = ($_yes23) o;
        return (is_undef_() || ooo.is_undef_() ?
        new DisCo_bool_() :
        new DisCo_bool_(compareTo(o) == 0));
    }
    public DisCo_bool_ op_neq_(Object o) {
      return this.op_eq_(o).op_not_();
    }
    public Value_description_ get_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Value_description_ get_default_value_description_(){
      Value_description_ ret = new Value_description_();
      ret.record_type_ = get_description_();
      return ret;
    }

    public static Type_description_ get_description_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 57, "yes");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }






  DisCo_type_ $_in_use39;
  public DisCo_type_ get_$_in_use39_() {
    return $_in_use39;
  }
  public void set_$_in_use39_(DisCo_type_ val_) {
    $_in_use39 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Admin";
    Field_description_ in_use_field_ = new Field_description_();
    in_use_field_.name = "in_use";
    Type_description_ in_use_type_ = new Type_description_(Type_description_.ENUMERATION, 55);
    in_use_type_.enumerationTypes.addElement($_Admin6.$_no22.get_description_());
    in_use_type_.enumerationTypes.addElement($_Admin6.$_yes23.get_description_());
    in_use_field_.value.record_type_ = $_in_use39.get_attributes_();
    get_$_in_use39_().fields_to_value_description_(in_use_field_.value);
    in_use_field_.type = in_use_type_;
    d_.fields.addElement(in_use_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Admin";
    Field_description_ in_use_field_ = new Field_description_();
    in_use_field_.name = "in_use";
    Type_description_ in_use_type_ = new Type_description_(Type_description_.ENUMERATION, 55);
    in_use_type_.enumerationTypes.addElement($_Admin6.$_no22.get_description_());
    in_use_type_.enumerationTypes.addElement($_Admin6.$_yes23.get_description_());
    in_use_field_.value = $_Admin6.$_no22.get_default_value_description_();
    in_use_field_.type = in_use_type_;
    d_.fields.addElement(in_use_field_);

    return d_;
  }
}

class $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$ extends DisCo_action_ {
  Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_0;
  $_full10_interface_ rhs_1;
  DisCo_int_ rhs_2;
  $_third9_interface_ rhs_3;
  DisCo_int_ rhs_4;
  $_second8_interface_ rhs_5;
  DisCo_int_ rhs_6;
  boolean treeCondition_0;
  boolean treeCondition_1;
  boolean treeCondition_2;
  public $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ selected_combination_ = new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "insert_book_to_cart";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Book0_interface_ $_book40 = selected_combination_.$_book40;
    $_Cart1_interface_ $_cart41 = selected_combination_.$_cart41;
    $_Customer2_interface_ $_customer42 = selected_combination_.$_customer42;
    $_System3_interface_ $_system43 = selected_combination_.$_system43;
    Parameter_real_ $_now44 = selected_combination_.$_now44;
    return (((((($_book40.get_$_in_cart34_().op_eq_((new DisCo_int_(-1)))).op_and_(($_book40.get_$_owned_customer33_().op_eq_((new DisCo_int_(-1)))))).op_and_(new DisCo_bool_($_customer42.get_$_registered36_() instanceof $_Customer2.$_yes18))).op_and_(($_system43.get_$_active_customer24_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer42).objectID_)))))).op_and_(($_customer42.get_$_browsing_currently37_().op_eq_((new DisCo_int_(((DisCo_class_)$_book40).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book40) {
    return ($_book40.get_$_in_cart34_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book40) {
    return ($_book40.get_$_owned_customer33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Customer2_interface_ $_customer42) {
    return new DisCo_bool_($_customer42.get_$_registered36_() instanceof $_Customer2.$_yes18).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Customer2_interface_ $_customer42, $_System3_interface_ $_system43) {
    return ($_system43.get_$_active_customer24_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer42).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_5_($_Book0_interface_ $_book40, $_Customer2_interface_ $_customer42) {
    return ($_customer42.get_$_browsing_currently37_().op_eq_((new DisCo_int_(((DisCo_class_)$_book40).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ combs_ = new Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_(my_specification_);
    Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ partial_result_ = new Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book40();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book40 = $$$_one_combination_$$$.$_book40;
      if (partial_guard_1_($_book40)) {
        partial_result_.add_combination_(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, null, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book40();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book40 = $$$_one_combination_$$$.$_book40;
      if (partial_guard_2_($_book40)) {
        partial_result_.add_combination_(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, null, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_customer42();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_customer42 = $$$_one_combination_$$$.$_customer42;
      if (partial_guard_3_($_customer42)) {
        partial_result_.add_combination_(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(null, null, $_customer42, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_customer42();
    combs_.generate_explicit_combinations_$_system43();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_customer42 = $$$_one_combination_$$$.$_customer42;
      $_System3_interface_ $_system43 = $$$_one_combination_$$$.$_system43;
      if (partial_guard_4_($_customer42, $_system43)) {
        partial_result_.add_combination_(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(null, null, $_customer42, $_system43, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book40();
    combs_.generate_explicit_combinations_$_customer42();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book40 = $$$_one_combination_$$$.$_book40;
      $_Customer2_interface_ $_customer42 = $$$_one_combination_$$$.$_customer42;
      if (partial_guard_5_($_book40, $_customer42)) {
        partial_result_.add_combination_(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, null, $_customer42, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Book0_interface_ $_book40, $_Cart1_interface_ $_cart41, $_Customer2_interface_ $_customer42, $_System3_interface_ $_system43, Parameter_real_ $_now44) throws Assertion_exception_ {
    treeCondition_0 = false;
    if(new DisCo_bool_($_cart41.get_$_next_empty31_() instanceof $_Cart1.$_third9).get_val_()){
      treeCondition_0 = true;
      rhs_0 = (new DisCo_int_(((DisCo_class_)$_book40).objectID_));
      rhs_1 = new $_Cart1.$_full10();
    }
    treeCondition_1 = false;
    if(new DisCo_bool_($_cart41.get_$_next_empty31_() instanceof $_Cart1.$_second8).get_val_()){
      treeCondition_1 = true;
      rhs_2 = (new DisCo_int_(((DisCo_class_)$_book40).objectID_));
      rhs_3 = new $_Cart1.$_third9();
    }
    treeCondition_2 = false;
    if(new DisCo_bool_($_cart41.get_$_next_empty31_() instanceof $_Cart1.$_first7).get_val_()){
      treeCondition_2 = true;
      rhs_4 = (new DisCo_int_(((DisCo_class_)$_book40).objectID_));
      rhs_5 = new $_Cart1.$_second8();
    }
    rhs_6 = (new DisCo_int_(((DisCo_class_)$_cart41).objectID_));
  }

  public void actual_execute($_Book0_interface_ $_book40, $_Cart1_interface_ $_cart41, $_Customer2_interface_ $_customer42, $_System3_interface_ $_system43, Parameter_real_ $_now44) throws Assertion_exception_ {
    try {
      if(treeCondition_0){
        $_cart41.set_$_book_330_(rhs_0.get_val_());
        Iterator iEL7 = my_specification_.getEngineListeners_();
        while(iEL7.hasNext()) {
          ((EngineListener)(iEL7.next())).objectStateChanged((DisCo_class_)$_cart41);
        }
        $_cart41.set_$_next_empty31_((DisCo_type_) rhs_1);
        Iterator iEL8 = my_specification_.getEngineListeners_();
        while(iEL8.hasNext()) {
          ((EngineListener)(iEL8.next())).objectStateChanged((DisCo_class_)$_cart41);
        }
      }
      if(treeCondition_1){
        $_cart41.set_$_book_229_(rhs_2.get_val_());
        Iterator iEL9 = my_specification_.getEngineListeners_();
        while(iEL9.hasNext()) {
          ((EngineListener)(iEL9.next())).objectStateChanged((DisCo_class_)$_cart41);
        }
        $_cart41.set_$_next_empty31_((DisCo_type_) rhs_3);
        Iterator iEL10 = my_specification_.getEngineListeners_();
        while(iEL10.hasNext()) {
          ((EngineListener)(iEL10.next())).objectStateChanged((DisCo_class_)$_cart41);
        }
      }
      if(treeCondition_2){
        $_cart41.set_$_book_128_(rhs_4.get_val_());
        Iterator iEL11 = my_specification_.getEngineListeners_();
        while(iEL11.hasNext()) {
          ((EngineListener)(iEL11.next())).objectStateChanged((DisCo_class_)$_cart41);
        }
        $_cart41.set_$_next_empty31_((DisCo_type_) rhs_5);
        Iterator iEL12 = my_specification_.getEngineListeners_();
        while(iEL12.hasNext()) {
          ((EngineListener)(iEL12.next())).objectStateChanged((DisCo_class_)$_cart41);
        }
      }
      $_book40.set_$_in_cart34_(rhs_6.get_val_());
      Iterator iEL13 = my_specification_.getEngineListeners_();
      while(iEL13.hasNext()) {
        ((EngineListener)(iEL13.next())).objectStateChanged((DisCo_class_)$_book40);
      }
      my_specification_.rt_.set_omega_($_now44.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Book0_interface_ $_book40, $_Cart1_interface_ $_cart41, $_Customer2_interface_ $_customer42, $_System3_interface_ $_system43, Parameter_real_ $_now44) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_book40, $_cart41, $_customer42, $_system43, $_now44);
    actual_execute($_book40, $_cart41, $_customer42, $_system43, $_now44);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action insert_book_to_cart(Book, Cart, Customer, System)");
    eval_guard_();
    selected_combination_ = new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("cart", "Cart"));
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now44.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now44.realval = value.realval;
      selected_combination_.$_now44.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action insert_book_to_cart(Book, Cart, Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now44 = new Parameter_real_();
      selected_combination_.$_now44.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action insert_book_to_cart(Book, Cart, Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for insert_book_to_cart(Book, Cart, Customer, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_book40 != null, "Participant $_book40 == null");
    new Assertion(selected_combination_.$_cart41 != null, "Participant $_cart41 == null");
    new Assertion(selected_combination_.$_customer42 != null, "Participant $_customer42 == null");
    new Assertion(selected_combination_.$_system43 != null, "Participant $_system43 == null");
    $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action insert_book_to_cart(Book, Cart, Customer, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_book40, selected_combination_.$_cart41, selected_combination_.$_customer42, selected_combination_.$_system43, selected_combination_.$_now44);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_book40 = ($_Book0_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_cart41 = ($_Cart1_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_customer42 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_system43 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_book40;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_cart41;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_customer42;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_system43;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ comb_ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now44.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action insert_book_to_cart(Book, Cart, Customer, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_book40() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book40 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book40() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_cart41() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_cart41 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_cart41() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_customer42() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer42 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer42() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system43() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system43 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system43() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book40());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_cart41());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer42());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system43());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if(comb.$_book40 != null && (($_Book0) (comb.$_book40)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book40)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_cart41 != null && (($_Cart1) (comb.$_cart41)).objectID_ != (($_Cart1) ($$$_ccc_$$$.$_cart41)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_customer42 != null && (($_Customer2) (comb.$_customer42)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer42)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system43 != null && (($_System3) (comb.$_system43)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system43)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ pick_actual_parameters_($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ comb = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_  comb_to_add_ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ comb_to_add_ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ combine(Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ other_) {
    Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_ result = new Combinations_$_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ mycomb = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ otherscomb = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) otherselems.next();
        $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ c = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Book0_interface_ $_book40 = null;
  $_Cart1_interface_ $_cart41 = null;
  $_Customer2_interface_ $_customer42 = null;
  $_System3_interface_ $_system43 = null;
  Parameter_real_ $_now44 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_Book0_interface_ $_book40, $_Cart1_interface_ $_cart41, $_Customer2_interface_ $_customer42, $_System3_interface_ $_system43, DisCo_specification_ my_specification) {
    this.$_book40 = $_book40;
    this.$_cart41 = $_cart41;
    this.$_customer42 = $_customer42;
    this.$_system43 = $_system43;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now44);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ $$$_other_$$$ = ($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_book40 = ((DisCo_class_) $$$_other_$$$.$_book40);
    DisCo_class_ $$_other_$_cart41 = ((DisCo_class_) $$$_other_$$$.$_cart41);
    DisCo_class_ $$_other_$_customer42 = ((DisCo_class_) $$$_other_$$$.$_customer42);
    DisCo_class_ $$_other_$_system43 = ((DisCo_class_) $$$_other_$$$.$_system43);
    if($_book40 == null && $$_other_$_book40 != null){
      return -1;
    }
    if($_book40 != null && $$_other_$_book40 == null){
      return 1;
    }
    if($_book40 != null && $$_other_$_book40!= null && ((DisCo_class_) $_book40).objectID_ != $$_other_$_book40.objectID_){
      return ((DisCo_class_) $_book40).objectID_ - $$_other_$_book40.objectID_;
    }
    if($_cart41 == null && $$_other_$_cart41 != null){
      return -1;
    }
    if($_cart41 != null && $$_other_$_cart41 == null){
      return 1;
    }
    if($_cart41 != null && $$_other_$_cart41!= null && ((DisCo_class_) $_cart41).objectID_ != $$_other_$_cart41.objectID_){
      return ((DisCo_class_) $_cart41).objectID_ - $$_other_$_cart41.objectID_;
    }
    if($_customer42 == null && $$_other_$_customer42 != null){
      return -1;
    }
    if($_customer42 != null && $$_other_$_customer42 == null){
      return 1;
    }
    if($_customer42 != null && $$_other_$_customer42!= null && ((DisCo_class_) $_customer42).objectID_ != $$_other_$_customer42.objectID_){
      return ((DisCo_class_) $_customer42).objectID_ - $$_other_$_customer42.objectID_;
    }
    if($_system43 == null && $$_other_$_system43 != null){
      return -1;
    }
    if($_system43 != null && $$_other_$_system43 == null){
      return 1;
    }
    if($_system43 != null && $$_other_$_system43!= null && ((DisCo_class_) $_system43).objectID_ != $$_other_$_system43.objectID_){
      return ((DisCo_class_) $_system43).objectID_ - $$_other_$_system43.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_book40() {
    Vector ret = new Vector();
    if($_book40 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(($_Book0_interface_)iter_.nextElement(), $_cart41, $_customer42, $_system43, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_cart41() {
    Vector ret = new Vector();
    if($_cart41 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Cart1").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, ($_Cart1_interface_)iter_.nextElement(), $_customer42, $_system43, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_customer42() {
    Vector ret = new Vector();
    if($_customer42 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, $_cart41, ($_Customer2_interface_)iter_.nextElement(), $_system43, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system43() {
    Vector ret = new Vector();
    if($_system43 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, $_cart41, $_customer42, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "book=" + ($_book40 == null ? "<any>" : $_book40.toString()) + ", "
       + "cart=" + ($_cart41 == null ? "<any>" : $_cart41.toString()) + ", "
       + "customer=" + ($_customer42 == null ? "<any>" : $_customer42.toString()) + ", "
       + "system=" + ($_system43 == null ? "<any>" : $_system43.toString()) + ", "
       + "now=" + ($_now44 == null ? "<any>" : $_now44.toString()) + ", ");
  }

  public boolean equal_participants_($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ trial) {
    return $_book40 != null && $_book40 == trial.$_book40  && $_cart41 != null && $_cart41 == trial.$_cart41  && $_customer42 != null && $_customer42 == trial.$_customer42  && $_system43 != null && $_system43 == trial.$_system43 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_book40);
    result_.addElement($_cart41);
    result_.addElement($_customer42);
    result_.addElement($_system43);
    return result_;
  }

  public $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ clone_() {
    return new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_($_book40, $_cart41, $_customer42, $_system43, my_specification_);
  }

  public boolean invalid_() {
    if ($_book40 != null && $_book40 == $_cart41) return true;
    if ($_book40 != null && $_book40 == $_customer42) return true;
    if ($_book40 != null && $_book40 == $_system43) return true;
    if ($_cart41 != null && $_cart41 == $_customer42) return true;
    if ($_cart41 != null && $_cart41 == $_system43) return true;
    if ($_customer42 != null && $_customer42 == $_system43) return true;
    return invalid_;
  }

  public $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ combine($_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ other_) {
    $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_ result_ = new $_insert_book_to_cart$$$_Book0$$$_Cart1$$$_Customer2$$$_System3$$_combination_(null, null, null, null, my_specification_);
    if ($_book40 == null) {
      result_.$_book40 = other_.$_book40;
    }
    else if (other_.$_book40 == null) {
      result_.$_book40 = $_book40;
    }
    else if($_book40 == other_.$_book40) {
      result_.$_book40 = $_book40;
    }
    else return null;

    if ($_cart41 == null) {
      result_.$_cart41 = other_.$_cart41;
    }
    else if (other_.$_cart41 == null) {
      result_.$_cart41 = $_cart41;
    }
    else if($_cart41 == other_.$_cart41) {
      result_.$_cart41 = $_cart41;
    }
    else return null;

    if ($_customer42 == null) {
      result_.$_customer42 = other_.$_customer42;
    }
    else if (other_.$_customer42 == null) {
      result_.$_customer42 = $_customer42;
    }
    else if($_customer42 == other_.$_customer42) {
      result_.$_customer42 = $_customer42;
    }
    else return null;

    if ($_system43 == null) {
      result_.$_system43 = other_.$_system43;
    }
    else if (other_.$_system43 == null) {
      result_.$_system43 = $_system43;
    }
    else if($_system43 == other_.$_system43) {
      result_.$_system43 = $_system43;
    }
    else return null;

    return result_;
  }
}

class $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$ extends DisCo_action_ {
  Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_14;
  public $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ selected_combination_ = new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "add_book_store";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper4_interface_ $_shopkeeper45 = selected_combination_.$_shopkeeper45;
    $_Book0_interface_ $_book46 = selected_combination_.$_book46;
    $_Bookstore5_interface_ $_bookstore47 = selected_combination_.$_bookstore47;
    $_System3_interface_ $_system48 = selected_combination_.$_system48;
    Parameter_real_ $_now49 = selected_combination_.$_now49;
    return ((((($_book46.get_$_in_cart34_().op_eq_((new DisCo_int_(-1)))).op_and_(($_book46.get_$_owned_customer33_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_book46.get_$_owned_bookstore32_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system48.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper45).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book46) {
    return ($_book46.get_$_in_cart34_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book46) {
    return ($_book46.get_$_owned_customer33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Book0_interface_ $_book46) {
    return ($_book46.get_$_owned_bookstore32_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Shopkeeper4_interface_ $_shopkeeper45, $_System3_interface_ $_system48) {
    return ($_system48.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper45).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ combs_ = new Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(my_specification_);
    Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ partial_result_ = new Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book46();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book46 = $$$_one_combination_$$$.$_book46;
      if (partial_guard_1_($_book46)) {
        partial_result_.add_combination_(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, $_book46, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book46();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book46 = $$$_one_combination_$$$.$_book46;
      if (partial_guard_2_($_book46)) {
        partial_result_.add_combination_(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, $_book46, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book46();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book46 = $$$_one_combination_$$$.$_book46;
      if (partial_guard_3_($_book46)) {
        partial_result_.add_combination_(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, $_book46, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper45();
    combs_.generate_explicit_combinations_$_system48();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Shopkeeper4_interface_ $_shopkeeper45 = $$$_one_combination_$$$.$_shopkeeper45;
      $_System3_interface_ $_system48 = $$$_one_combination_$$$.$_system48;
      if (partial_guard_4_($_shopkeeper45, $_system48)) {
        partial_result_.add_combination_(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper45, null, null, $_system48, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Shopkeeper4_interface_ $_shopkeeper45, $_Book0_interface_ $_book46, $_Bookstore5_interface_ $_bookstore47, $_System3_interface_ $_system48, Parameter_real_ $_now49) throws Assertion_exception_ {
    rhs_14 = (new DisCo_int_(((DisCo_class_)$_bookstore47).objectID_));
  }

  public void actual_execute($_Shopkeeper4_interface_ $_shopkeeper45, $_Book0_interface_ $_book46, $_Bookstore5_interface_ $_bookstore47, $_System3_interface_ $_system48, Parameter_real_ $_now49) throws Assertion_exception_ {
    try {
      $_book46.set_$_owned_bookstore32_(rhs_14.get_val_());
      Iterator iEL15 = my_specification_.getEngineListeners_();
      while(iEL15.hasNext()) {
        ((EngineListener)(iEL15.next())).objectStateChanged((DisCo_class_)$_book46);
      }
      my_specification_.rt_.set_omega_($_now49.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper4_interface_ $_shopkeeper45, $_Book0_interface_ $_book46, $_Bookstore5_interface_ $_bookstore47, $_System3_interface_ $_system48, Parameter_real_ $_now49) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper45, $_book46, $_bookstore47, $_system48, $_now49);
    actual_execute($_shopkeeper45, $_book46, $_bookstore47, $_system48, $_now49);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action add_book_store(Shopkeeper, Book, Bookstore, System)");
    eval_guard_();
    selected_combination_ = new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now49.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now49.realval = value.realval;
      selected_combination_.$_now49.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action add_book_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now49 = new Parameter_real_();
      selected_combination_.$_now49.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action add_book_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for add_book_store(Shopkeeper, Book, Bookstore, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper45 != null, "Participant $_shopkeeper45 == null");
    new Assertion(selected_combination_.$_book46 != null, "Participant $_book46 == null");
    new Assertion(selected_combination_.$_bookstore47 != null, "Participant $_bookstore47 == null");
    new Assertion(selected_combination_.$_system48 != null, "Participant $_system48 == null");
    $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action add_book_store(Shopkeeper, Book, Bookstore, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_shopkeeper45, selected_combination_.$_book46, selected_combination_.$_bookstore47, selected_combination_.$_system48, selected_combination_.$_now49);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper45 = ($_Shopkeeper4_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book46 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore47 = ($_Bookstore5_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_system48 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper45;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book46;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore47;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_system48;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb_ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now49.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action add_book_store(Shopkeeper, Book, Bookstore, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper45() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper45 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper45() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book46() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book46 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book46() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore47() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore47 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore47() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system48() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system48 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system48() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper45());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book46());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore47());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system48());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper45 != null && (($_Shopkeeper4) (comb.$_shopkeeper45)).objectID_ != (($_Shopkeeper4) ($$$_ccc_$$$.$_shopkeeper45)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book46 != null && (($_Book0) (comb.$_book46)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book46)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore47 != null && (($_Bookstore5) (comb.$_bookstore47)).objectID_ != (($_Bookstore5) ($$$_ccc_$$$.$_bookstore47)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system48 != null && (($_System3) (comb.$_system48)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system48)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ pick_actual_parameters_($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_  comb_to_add_ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb_to_add_ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ combine(Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ other_) {
    Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ result = new Combinations_$_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ mycomb = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ otherscomb = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) otherselems.next();
        $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ c = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper4_interface_ $_shopkeeper45 = null;
  $_Book0_interface_ $_book46 = null;
  $_Bookstore5_interface_ $_bookstore47 = null;
  $_System3_interface_ $_system48 = null;
  Parameter_real_ $_now49 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_Shopkeeper4_interface_ $_shopkeeper45, $_Book0_interface_ $_book46, $_Bookstore5_interface_ $_bookstore47, $_System3_interface_ $_system48, DisCo_specification_ my_specification) {
    this.$_shopkeeper45 = $_shopkeeper45;
    this.$_book46 = $_book46;
    this.$_bookstore47 = $_bookstore47;
    this.$_system48 = $_system48;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now49);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_other_$$$ = ($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper45 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper45);
    DisCo_class_ $$_other_$_book46 = ((DisCo_class_) $$$_other_$$$.$_book46);
    DisCo_class_ $$_other_$_bookstore47 = ((DisCo_class_) $$$_other_$$$.$_bookstore47);
    DisCo_class_ $$_other_$_system48 = ((DisCo_class_) $$$_other_$$$.$_system48);
    if($_shopkeeper45 == null && $$_other_$_shopkeeper45 != null){
      return -1;
    }
    if($_shopkeeper45 != null && $$_other_$_shopkeeper45 == null){
      return 1;
    }
    if($_shopkeeper45 != null && $$_other_$_shopkeeper45!= null && ((DisCo_class_) $_shopkeeper45).objectID_ != $$_other_$_shopkeeper45.objectID_){
      return ((DisCo_class_) $_shopkeeper45).objectID_ - $$_other_$_shopkeeper45.objectID_;
    }
    if($_book46 == null && $$_other_$_book46 != null){
      return -1;
    }
    if($_book46 != null && $$_other_$_book46 == null){
      return 1;
    }
    if($_book46 != null && $$_other_$_book46!= null && ((DisCo_class_) $_book46).objectID_ != $$_other_$_book46.objectID_){
      return ((DisCo_class_) $_book46).objectID_ - $$_other_$_book46.objectID_;
    }
    if($_bookstore47 == null && $$_other_$_bookstore47 != null){
      return -1;
    }
    if($_bookstore47 != null && $$_other_$_bookstore47 == null){
      return 1;
    }
    if($_bookstore47 != null && $$_other_$_bookstore47!= null && ((DisCo_class_) $_bookstore47).objectID_ != $$_other_$_bookstore47.objectID_){
      return ((DisCo_class_) $_bookstore47).objectID_ - $$_other_$_bookstore47.objectID_;
    }
    if($_system48 == null && $$_other_$_system48 != null){
      return -1;
    }
    if($_system48 != null && $$_other_$_system48 == null){
      return 1;
    }
    if($_system48 != null && $$_other_$_system48!= null && ((DisCo_class_) $_system48).objectID_ != $$_other_$_system48.objectID_){
      return ((DisCo_class_) $_system48).objectID_ - $$_other_$_system48.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper45() {
    Vector ret = new Vector();
    if($_shopkeeper45 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(($_Shopkeeper4_interface_)iter_.nextElement(), $_book46, $_bookstore47, $_system48, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book46() {
    Vector ret = new Vector();
    if($_book46 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper45, ($_Book0_interface_)iter_.nextElement(), $_bookstore47, $_system48, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore47() {
    Vector ret = new Vector();
    if($_bookstore47 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper45, $_book46, ($_Bookstore5_interface_)iter_.nextElement(), $_system48, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system48() {
    Vector ret = new Vector();
    if($_system48 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper45, $_book46, $_bookstore47, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper45 == null ? "<any>" : $_shopkeeper45.toString()) + ", "
       + "book=" + ($_book46 == null ? "<any>" : $_book46.toString()) + ", "
       + "bookstore=" + ($_bookstore47 == null ? "<any>" : $_bookstore47.toString()) + ", "
       + "system=" + ($_system48 == null ? "<any>" : $_system48.toString()) + ", "
       + "now=" + ($_now49 == null ? "<any>" : $_now49.toString()) + ", ");
  }

  public boolean equal_participants_($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ trial) {
    return $_shopkeeper45 != null && $_shopkeeper45 == trial.$_shopkeeper45  && $_book46 != null && $_book46 == trial.$_book46  && $_bookstore47 != null && $_bookstore47 == trial.$_bookstore47  && $_system48 != null && $_system48 == trial.$_system48 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper45);
    result_.addElement($_book46);
    result_.addElement($_bookstore47);
    result_.addElement($_system48);
    return result_;
  }

  public $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ clone_() {
    return new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper45, $_book46, $_bookstore47, $_system48, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper45 != null && $_shopkeeper45 == $_book46) return true;
    if ($_shopkeeper45 != null && $_shopkeeper45 == $_bookstore47) return true;
    if ($_shopkeeper45 != null && $_shopkeeper45 == $_system48) return true;
    if ($_book46 != null && $_book46 == $_bookstore47) return true;
    if ($_book46 != null && $_book46 == $_system48) return true;
    if ($_bookstore47 != null && $_bookstore47 == $_system48) return true;
    return invalid_;
  }

  public $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ combine($_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ other_) {
    $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ result_ = new $_add_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, null, null, null, my_specification_);
    if ($_shopkeeper45 == null) {
      result_.$_shopkeeper45 = other_.$_shopkeeper45;
    }
    else if (other_.$_shopkeeper45 == null) {
      result_.$_shopkeeper45 = $_shopkeeper45;
    }
    else if($_shopkeeper45 == other_.$_shopkeeper45) {
      result_.$_shopkeeper45 = $_shopkeeper45;
    }
    else return null;

    if ($_book46 == null) {
      result_.$_book46 = other_.$_book46;
    }
    else if (other_.$_book46 == null) {
      result_.$_book46 = $_book46;
    }
    else if($_book46 == other_.$_book46) {
      result_.$_book46 = $_book46;
    }
    else return null;

    if ($_bookstore47 == null) {
      result_.$_bookstore47 = other_.$_bookstore47;
    }
    else if (other_.$_bookstore47 == null) {
      result_.$_bookstore47 = $_bookstore47;
    }
    else if($_bookstore47 == other_.$_bookstore47) {
      result_.$_bookstore47 = $_bookstore47;
    }
    else return null;

    if ($_system48 == null) {
      result_.$_system48 = other_.$_system48;
    }
    else if (other_.$_system48 == null) {
      result_.$_system48 = $_system48;
    }
    else if($_system48 == other_.$_system48) {
      result_.$_system48 = $_system48;
    }
    else return null;

    return result_;
  }
}

class $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$ extends DisCo_action_ {
  Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_16;
  public $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ selected_combination_ = new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "remove_book_store";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper4_interface_ $_shopkeeper50 = selected_combination_.$_shopkeeper50;
    $_Book0_interface_ $_book51 = selected_combination_.$_book51;
    $_Bookstore5_interface_ $_bookstore52 = selected_combination_.$_bookstore52;
    $_System3_interface_ $_system53 = selected_combination_.$_system53;
    Parameter_real_ $_now54 = selected_combination_.$_now54;
    return ((((($_book51.get_$_in_cart34_().op_eq_((new DisCo_int_(-1)))).op_and_(($_book51.get_$_owned_customer33_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_book51.get_$_owned_bookstore32_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore52).objectID_)))))).op_and_(($_system53.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper50).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book51) {
    return ($_book51.get_$_in_cart34_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book51) {
    return ($_book51.get_$_owned_customer33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Book0_interface_ $_book51, $_Bookstore5_interface_ $_bookstore52) {
    return ($_book51.get_$_owned_bookstore32_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore52).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Shopkeeper4_interface_ $_shopkeeper50, $_System3_interface_ $_system53) {
    return ($_system53.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper50).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ combs_ = new Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(my_specification_);
    Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ partial_result_ = new Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book51();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book51 = $$$_one_combination_$$$.$_book51;
      if (partial_guard_1_($_book51)) {
        partial_result_.add_combination_(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, $_book51, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book51();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book51 = $$$_one_combination_$$$.$_book51;
      if (partial_guard_2_($_book51)) {
        partial_result_.add_combination_(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, $_book51, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book51();
    combs_.generate_explicit_combinations_$_bookstore52();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book51 = $$$_one_combination_$$$.$_book51;
      $_Bookstore5_interface_ $_bookstore52 = $$$_one_combination_$$$.$_bookstore52;
      if (partial_guard_3_($_book51, $_bookstore52)) {
        partial_result_.add_combination_(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, $_book51, $_bookstore52, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper50();
    combs_.generate_explicit_combinations_$_system53();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) comb_i_.next();
      $_Shopkeeper4_interface_ $_shopkeeper50 = $$$_one_combination_$$$.$_shopkeeper50;
      $_System3_interface_ $_system53 = $$$_one_combination_$$$.$_system53;
      if (partial_guard_4_($_shopkeeper50, $_system53)) {
        partial_result_.add_combination_(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper50, null, null, $_system53, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Shopkeeper4_interface_ $_shopkeeper50, $_Book0_interface_ $_book51, $_Bookstore5_interface_ $_bookstore52, $_System3_interface_ $_system53, Parameter_real_ $_now54) throws Assertion_exception_ {
    rhs_16 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Shopkeeper4_interface_ $_shopkeeper50, $_Book0_interface_ $_book51, $_Bookstore5_interface_ $_bookstore52, $_System3_interface_ $_system53, Parameter_real_ $_now54) throws Assertion_exception_ {
    try {
      $_book51.set_$_owned_bookstore32_(rhs_16.get_val_());
      Iterator iEL17 = my_specification_.getEngineListeners_();
      while(iEL17.hasNext()) {
        ((EngineListener)(iEL17.next())).objectStateChanged((DisCo_class_)$_book51);
      }
      my_specification_.rt_.set_omega_($_now54.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper4_interface_ $_shopkeeper50, $_Book0_interface_ $_book51, $_Bookstore5_interface_ $_bookstore52, $_System3_interface_ $_system53, Parameter_real_ $_now54) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper50, $_book51, $_bookstore52, $_system53, $_now54);
    actual_execute($_shopkeeper50, $_book51, $_bookstore52, $_system53, $_now54);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action remove_book_store(Shopkeeper, Book, Bookstore, System)");
    eval_guard_();
    selected_combination_ = new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now54.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now54.realval = value.realval;
      selected_combination_.$_now54.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action remove_book_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now54 = new Parameter_real_();
      selected_combination_.$_now54.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action remove_book_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for remove_book_store(Shopkeeper, Book, Bookstore, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper50 != null, "Participant $_shopkeeper50 == null");
    new Assertion(selected_combination_.$_book51 != null, "Participant $_book51 == null");
    new Assertion(selected_combination_.$_bookstore52 != null, "Participant $_bookstore52 == null");
    new Assertion(selected_combination_.$_system53 != null, "Participant $_system53 == null");
    $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action remove_book_store(Shopkeeper, Book, Bookstore, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_shopkeeper50, selected_combination_.$_book51, selected_combination_.$_bookstore52, selected_combination_.$_system53, selected_combination_.$_now54);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper50 = ($_Shopkeeper4_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book51 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore52 = ($_Bookstore5_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_system53 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper50;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book51;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore52;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_system53;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb_ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now54.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action remove_book_store(Shopkeeper, Book, Bookstore, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper50() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper50 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper50() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book51() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book51 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book51() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore52() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore52 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore52() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system53() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system53 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system53() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper50());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book51());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore52());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system53());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper50 != null && (($_Shopkeeper4) (comb.$_shopkeeper50)).objectID_ != (($_Shopkeeper4) ($$$_ccc_$$$.$_shopkeeper50)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book51 != null && (($_Book0) (comb.$_book51)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book51)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore52 != null && (($_Bookstore5) (comb.$_bookstore52)).objectID_ != (($_Bookstore5) ($$$_ccc_$$$.$_bookstore52)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system53 != null && (($_System3) (comb.$_system53)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system53)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ pick_actual_parameters_($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_  comb_to_add_ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb_to_add_ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ combine(Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ other_) {
    Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_ result = new Combinations_$_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ mycomb = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ otherscomb = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) otherselems.next();
        $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ c = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper4_interface_ $_shopkeeper50 = null;
  $_Book0_interface_ $_book51 = null;
  $_Bookstore5_interface_ $_bookstore52 = null;
  $_System3_interface_ $_system53 = null;
  Parameter_real_ $_now54 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_Shopkeeper4_interface_ $_shopkeeper50, $_Book0_interface_ $_book51, $_Bookstore5_interface_ $_bookstore52, $_System3_interface_ $_system53, DisCo_specification_ my_specification) {
    this.$_shopkeeper50 = $_shopkeeper50;
    this.$_book51 = $_book51;
    this.$_bookstore52 = $_bookstore52;
    this.$_system53 = $_system53;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now54);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ $$$_other_$$$ = ($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper50 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper50);
    DisCo_class_ $$_other_$_book51 = ((DisCo_class_) $$$_other_$$$.$_book51);
    DisCo_class_ $$_other_$_bookstore52 = ((DisCo_class_) $$$_other_$$$.$_bookstore52);
    DisCo_class_ $$_other_$_system53 = ((DisCo_class_) $$$_other_$$$.$_system53);
    if($_shopkeeper50 == null && $$_other_$_shopkeeper50 != null){
      return -1;
    }
    if($_shopkeeper50 != null && $$_other_$_shopkeeper50 == null){
      return 1;
    }
    if($_shopkeeper50 != null && $$_other_$_shopkeeper50!= null && ((DisCo_class_) $_shopkeeper50).objectID_ != $$_other_$_shopkeeper50.objectID_){
      return ((DisCo_class_) $_shopkeeper50).objectID_ - $$_other_$_shopkeeper50.objectID_;
    }
    if($_book51 == null && $$_other_$_book51 != null){
      return -1;
    }
    if($_book51 != null && $$_other_$_book51 == null){
      return 1;
    }
    if($_book51 != null && $$_other_$_book51!= null && ((DisCo_class_) $_book51).objectID_ != $$_other_$_book51.objectID_){
      return ((DisCo_class_) $_book51).objectID_ - $$_other_$_book51.objectID_;
    }
    if($_bookstore52 == null && $$_other_$_bookstore52 != null){
      return -1;
    }
    if($_bookstore52 != null && $$_other_$_bookstore52 == null){
      return 1;
    }
    if($_bookstore52 != null && $$_other_$_bookstore52!= null && ((DisCo_class_) $_bookstore52).objectID_ != $$_other_$_bookstore52.objectID_){
      return ((DisCo_class_) $_bookstore52).objectID_ - $$_other_$_bookstore52.objectID_;
    }
    if($_system53 == null && $$_other_$_system53 != null){
      return -1;
    }
    if($_system53 != null && $$_other_$_system53 == null){
      return 1;
    }
    if($_system53 != null && $$_other_$_system53!= null && ((DisCo_class_) $_system53).objectID_ != $$_other_$_system53.objectID_){
      return ((DisCo_class_) $_system53).objectID_ - $$_other_$_system53.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper50() {
    Vector ret = new Vector();
    if($_shopkeeper50 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(($_Shopkeeper4_interface_)iter_.nextElement(), $_book51, $_bookstore52, $_system53, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book51() {
    Vector ret = new Vector();
    if($_book51 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper50, ($_Book0_interface_)iter_.nextElement(), $_bookstore52, $_system53, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore52() {
    Vector ret = new Vector();
    if($_bookstore52 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper50, $_book51, ($_Bookstore5_interface_)iter_.nextElement(), $_system53, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system53() {
    Vector ret = new Vector();
    if($_system53 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper50, $_book51, $_bookstore52, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper50 == null ? "<any>" : $_shopkeeper50.toString()) + ", "
       + "book=" + ($_book51 == null ? "<any>" : $_book51.toString()) + ", "
       + "bookstore=" + ($_bookstore52 == null ? "<any>" : $_bookstore52.toString()) + ", "
       + "system=" + ($_system53 == null ? "<any>" : $_system53.toString()) + ", "
       + "now=" + ($_now54 == null ? "<any>" : $_now54.toString()) + ", ");
  }

  public boolean equal_participants_($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ trial) {
    return $_shopkeeper50 != null && $_shopkeeper50 == trial.$_shopkeeper50  && $_book51 != null && $_book51 == trial.$_book51  && $_bookstore52 != null && $_bookstore52 == trial.$_bookstore52  && $_system53 != null && $_system53 == trial.$_system53 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper50);
    result_.addElement($_book51);
    result_.addElement($_bookstore52);
    result_.addElement($_system53);
    return result_;
  }

  public $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ clone_() {
    return new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_($_shopkeeper50, $_book51, $_bookstore52, $_system53, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper50 != null && $_shopkeeper50 == $_book51) return true;
    if ($_shopkeeper50 != null && $_shopkeeper50 == $_bookstore52) return true;
    if ($_shopkeeper50 != null && $_shopkeeper50 == $_system53) return true;
    if ($_book51 != null && $_book51 == $_bookstore52) return true;
    if ($_book51 != null && $_book51 == $_system53) return true;
    if ($_bookstore52 != null && $_bookstore52 == $_system53) return true;
    return invalid_;
  }

  public $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ combine($_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ other_) {
    $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_ result_ = new $_remove_book_store$$$_Shopkeeper4$$$_Book0$$$_Bookstore5$$$_System3$$_combination_(null, null, null, null, my_specification_);
    if ($_shopkeeper50 == null) {
      result_.$_shopkeeper50 = other_.$_shopkeeper50;
    }
    else if (other_.$_shopkeeper50 == null) {
      result_.$_shopkeeper50 = $_shopkeeper50;
    }
    else if($_shopkeeper50 == other_.$_shopkeeper50) {
      result_.$_shopkeeper50 = $_shopkeeper50;
    }
    else return null;

    if ($_book51 == null) {
      result_.$_book51 = other_.$_book51;
    }
    else if (other_.$_book51 == null) {
      result_.$_book51 = $_book51;
    }
    else if($_book51 == other_.$_book51) {
      result_.$_book51 = $_book51;
    }
    else return null;

    if ($_bookstore52 == null) {
      result_.$_bookstore52 = other_.$_bookstore52;
    }
    else if (other_.$_bookstore52 == null) {
      result_.$_bookstore52 = $_bookstore52;
    }
    else if($_bookstore52 == other_.$_bookstore52) {
      result_.$_bookstore52 = $_bookstore52;
    }
    else return null;

    if ($_system53 == null) {
      result_.$_system53 = other_.$_system53;
    }
    else if (other_.$_system53 == null) {
      result_.$_system53 = $_system53;
    }
    else if($_system53 == other_.$_system53) {
      result_.$_system53 = $_system53;
    }
    else return null;

    return result_;
  }
}

class $_register_customer$$$_Customer2$$ extends DisCo_action_ {
  Combinations_$_register_customer$$$_Customer2$$_ enabled_for_;

  $_yes18_interface_ rhs_18;
  public $_register_customer$$$_Customer2$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_register_customer$$$_Customer2$$_combination_ selected_combination_ = new $_register_customer$$$_Customer2$$_combination_(my_specification_);
  public String get_name_() {
    return "register_customer";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_c55 = selected_combination_.$_c55;
    Parameter_real_ $_now56 = selected_combination_.$_now56;
    return (new DisCo_bool_($_c55.get_$_registered36_() instanceof $_Customer2.$_no19)).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Customer2_interface_ $_c55) {
    return new DisCo_bool_($_c55.get_$_registered36_() instanceof $_Customer2.$_no19).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_register_customer$$$_Customer2$$_ combs_ = new Combinations_$_register_customer$$$_Customer2$$_(my_specification_);
    Combinations_$_register_customer$$$_Customer2$$_ partial_result_ = new Combinations_$_register_customer$$$_Customer2$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_c55();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_register_customer$$$_Customer2$$_combination_ $$$_one_combination_$$$ = ($_register_customer$$$_Customer2$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_c55 = $$$_one_combination_$$$.$_c55;
      if (partial_guard_1_($_c55)) {
        partial_result_.add_combination_(new $_register_customer$$$_Customer2$$_combination_($_c55, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Customer2_interface_ $_c55, Parameter_real_ $_now56) throws Assertion_exception_ {
    rhs_18 = new $_Customer2.$_yes18();
  }

  public void actual_execute($_Customer2_interface_ $_c55, Parameter_real_ $_now56) throws Assertion_exception_ {
    try {
      $_c55.set_$_registered36_((DisCo_type_) rhs_18);
      Iterator iEL19 = my_specification_.getEngineListeners_();
      while(iEL19.hasNext()) {
        ((EngineListener)(iEL19.next())).objectStateChanged((DisCo_class_)$_c55);
      }
      my_specification_.rt_.set_omega_($_now56.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Customer2_interface_ $_c55, Parameter_real_ $_now56) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_c55, $_now56);
    actual_execute($_c55, $_now56);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action register_customer(Customer)");
    eval_guard_();
    selected_combination_ = new $_register_customer$$$_Customer2$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("c", "Customer"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 1){
      vd_ = new Value_description_(selected_combination_.$_now56.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 1){
      selected_combination_.$_now56.realval = value.realval;
      selected_combination_.$_now56.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action register_customer(Customer)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 1){
      selected_combination_.$_now56 = new Parameter_real_();
      selected_combination_.$_now56.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action register_customer(Customer)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for register_customer(Customer) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_register_customer$$$_Customer2$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_c55 != null, "Participant $_c55 == null");
    $_register_customer$$$_Customer2$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action register_customer(Customer) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_c55, selected_combination_.$_now56);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_c55 = ($_Customer2_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_c55;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_register_customer$$$_Customer2$$_combination_(null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_register_customer$$$_Customer2$$_combination_ comb_ = ($_register_customer$$$_Customer2$$_combination_) iter.next();
      if (!comb_.$_now56.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action register_customer(Customer)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_register_customer$$$_Customer2$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_register_customer$$$_Customer2$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_register_customer$$$_Customer2$$_combination_(null, my_specification_));
  }

  public void generate_explicit_combinations_$_c55() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_register_customer$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_register_customer$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_c55 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_c55() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_register_customer$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_c55());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_register_customer$$$_Customer2$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_register_customer$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_register_customer$$$_Customer2$$_combination_) iter.next();
      if(comb.$_c55 != null && (($_Customer2) (comb.$_c55)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_c55)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_register_customer$$$_Customer2$$_combination_) iter.next()).debug_();
    }
  }

  public $_register_customer$$$_Customer2$$_combination_ pick_actual_parameters_($_register_customer$$$_Customer2$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_register_customer$$$_Customer2$$_combination_ comb = ($_register_customer$$$_Customer2$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_register_customer$$$_Customer2$$_combination_  comb_to_add_ = ($_register_customer$$$_Customer2$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_register_customer$$$_Customer2$$_combination_ comb_to_add_ = ($_register_customer$$$_Customer2$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_register_customer$$$_Customer2$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_register_customer$$$_Customer2$$_ combine(Combinations_$_register_customer$$$_Customer2$$_ other_) {
    Combinations_$_register_customer$$$_Customer2$$_ result = new Combinations_$_register_customer$$$_Customer2$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_register_customer$$$_Customer2$$_combination_ mycomb = ($_register_customer$$$_Customer2$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_register_customer$$$_Customer2$$_combination_ otherscomb = ($_register_customer$$$_Customer2$$_combination_) otherselems.next();
        $_register_customer$$$_Customer2$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_register_customer$$$_Customer2$$_combination_ c = ($_register_customer$$$_Customer2$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_register_customer$$$_Customer2$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Customer2_interface_ $_c55 = null;
  Parameter_real_ $_now56 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_register_customer$$$_Customer2$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_register_customer$$$_Customer2$$_combination_($_Customer2_interface_ $_c55, DisCo_specification_ my_specification) {
    this.$_c55 = $_c55;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now56);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_register_customer$$$_Customer2$$_combination_ $$$_other_$$$ = ($_register_customer$$$_Customer2$$_combination_)o;
    DisCo_class_ $$_other_$_c55 = ((DisCo_class_) $$$_other_$$$.$_c55);
    if($_c55 == null && $$_other_$_c55 != null){
      return -1;
    }
    if($_c55 != null && $$_other_$_c55 == null){
      return 1;
    }
    if($_c55 != null && $$_other_$_c55!= null && ((DisCo_class_) $_c55).objectID_ != $$_other_$_c55.objectID_){
      return ((DisCo_class_) $_c55).objectID_ - $$_other_$_c55.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_c55() {
    Vector ret = new Vector();
    if($_c55 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_register_customer$$$_Customer2$$_combination_(($_Customer2_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "c=" + ($_c55 == null ? "<any>" : $_c55.toString()) + ", "
       + "now=" + ($_now56 == null ? "<any>" : $_now56.toString()) + ", ");
  }

  public boolean equal_participants_($_register_customer$$$_Customer2$$_combination_ trial) {
    return $_c55 != null && $_c55 == trial.$_c55 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_c55);
    return result_;
  }

  public $_register_customer$$$_Customer2$$_combination_ clone_() {
    return new $_register_customer$$$_Customer2$$_combination_($_c55, my_specification_);
  }

  public boolean invalid_() {
    return invalid_;
  }

  public $_register_customer$$$_Customer2$$_combination_ combine($_register_customer$$$_Customer2$$_combination_ other_) {
    $_register_customer$$$_Customer2$$_combination_ result_ = new $_register_customer$$$_Customer2$$_combination_(null, my_specification_);
    if ($_c55 == null) {
      result_.$_c55 = other_.$_c55;
    }
    else if (other_.$_c55 == null) {
      result_.$_c55 = $_c55;
    }
    else if($_c55 == other_.$_c55) {
      result_.$_c55 = $_c55;
    }
    else return null;

    return result_;
  }
}

class $_login_customer$$$_Customer2$$$_System3$$ extends DisCo_action_ {
  Combinations_$_login_customer$$$_Customer2$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_20;
  public $_login_customer$$$_Customer2$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_login_customer$$$_Customer2$$$_System3$$_combination_ selected_combination_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "login_customer";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_customer57 = selected_combination_.$_customer57;
    $_System3_interface_ $_system58 = selected_combination_.$_system58;
    Parameter_real_ $_now59 = selected_combination_.$_now59;
    return ((((($_system58.get_$_active_customer24_().op_eq_((new DisCo_int_(-1)))).op_and_(($_system58.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system58.get_$_active_admin26_().op_eq_((new DisCo_int_(-1)))))).op_and_(new DisCo_bool_($_customer57.get_$_registered36_() instanceof $_Customer2.$_yes18)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system58) {
    return ($_system58.get_$_active_customer24_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_System3_interface_ $_system58) {
    return ($_system58.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_System3_interface_ $_system58) {
    return ($_system58.get_$_active_admin26_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Customer2_interface_ $_customer57) {
    return new DisCo_bool_($_customer57.get_$_registered36_() instanceof $_Customer2.$_yes18).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_login_customer$$$_Customer2$$$_System3$$_ combs_ = new Combinations_$_login_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Combinations_$_login_customer$$$_Customer2$$$_System3$$_ partial_result_ = new Combinations_$_login_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system58();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system58 = $$$_one_combination_$$$.$_system58;
      if (partial_guard_1_($_system58)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, $_system58, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system58();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system58 = $$$_one_combination_$$$.$_system58;
      if (partial_guard_2_($_system58)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, $_system58, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system58();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system58 = $$$_one_combination_$$$.$_system58;
      if (partial_guard_3_($_system58)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, $_system58, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_customer57();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_customer57 = $$$_one_combination_$$$.$_customer57;
      if (partial_guard_4_($_customer57)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_($_customer57, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Customer2_interface_ $_customer57, $_System3_interface_ $_system58, Parameter_real_ $_now59) throws Assertion_exception_ {
    rhs_20 = (new DisCo_int_(((DisCo_class_)$_customer57).objectID_));
  }

  public void actual_execute($_Customer2_interface_ $_customer57, $_System3_interface_ $_system58, Parameter_real_ $_now59) throws Assertion_exception_ {
    try {
      $_system58.set_$_active_customer24_(rhs_20.get_val_());
      Iterator iEL21 = my_specification_.getEngineListeners_();
      while(iEL21.hasNext()) {
        ((EngineListener)(iEL21.next())).objectStateChanged((DisCo_class_)$_system58);
      }
      my_specification_.rt_.set_omega_($_now59.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Customer2_interface_ $_customer57, $_System3_interface_ $_system58, Parameter_real_ $_now59) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_customer57, $_system58, $_now59);
    actual_execute($_customer57, $_system58, $_now59);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action login_customer(Customer, System)");
    eval_guard_();
    selected_combination_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 2){
      vd_ = new Value_description_(selected_combination_.$_now59.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now59.realval = value.realval;
      selected_combination_.$_now59.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action login_customer(Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now59 = new Parameter_real_();
      selected_combination_.$_now59.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action login_customer(Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for login_customer(Customer, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_customer57 != null, "Participant $_customer57 == null");
    new Assertion(selected_combination_.$_system58 != null, "Participant $_system58 == null");
    $_login_customer$$$_Customer2$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action login_customer(Customer, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_customer57, selected_combination_.$_system58, selected_combination_.$_now59);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_customer57 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system58 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_customer57;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system58;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_login_customer$$$_Customer2$$$_System3$$_combination_ comb_ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now59.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action login_customer(Customer, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_login_customer$$$_Customer2$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_login_customer$$$_Customer2$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_customer57() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer57 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer57() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system58() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system58 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system58() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer57());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system58());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_login_customer$$$_Customer2$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if(comb.$_customer57 != null && (($_Customer2) (comb.$_customer57)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer57)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system58 != null && (($_System3) (comb.$_system58)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system58)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_ pick_actual_parameters_($_login_customer$$$_Customer2$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_customer$$$_Customer2$$$_System3$$_combination_ comb = ($_login_customer$$$_Customer2$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_  comb_to_add_ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ comb_to_add_ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_login_customer$$$_Customer2$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_login_customer$$$_Customer2$$$_System3$$_ combine(Combinations_$_login_customer$$$_Customer2$$$_System3$$_ other_) {
    Combinations_$_login_customer$$$_Customer2$$$_System3$$_ result = new Combinations_$_login_customer$$$_Customer2$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ mycomb = ($_login_customer$$$_Customer2$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_login_customer$$$_Customer2$$$_System3$$_combination_ otherscomb = ($_login_customer$$$_Customer2$$$_System3$$_combination_) otherselems.next();
        $_login_customer$$$_Customer2$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_customer$$$_Customer2$$$_System3$$_combination_ c = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_login_customer$$$_Customer2$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Customer2_interface_ $_customer57 = null;
  $_System3_interface_ $_system58 = null;
  Parameter_real_ $_now59 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_login_customer$$$_Customer2$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_($_Customer2_interface_ $_customer57, $_System3_interface_ $_system58, DisCo_specification_ my_specification) {
    this.$_customer57 = $_customer57;
    this.$_system58 = $_system58;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now59);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_other_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_customer57 = ((DisCo_class_) $$$_other_$$$.$_customer57);
    DisCo_class_ $$_other_$_system58 = ((DisCo_class_) $$$_other_$$$.$_system58);
    if($_customer57 == null && $$_other_$_customer57 != null){
      return -1;
    }
    if($_customer57 != null && $$_other_$_customer57 == null){
      return 1;
    }
    if($_customer57 != null && $$_other_$_customer57!= null && ((DisCo_class_) $_customer57).objectID_ != $$_other_$_customer57.objectID_){
      return ((DisCo_class_) $_customer57).objectID_ - $$_other_$_customer57.objectID_;
    }
    if($_system58 == null && $$_other_$_system58 != null){
      return -1;
    }
    if($_system58 != null && $$_other_$_system58 == null){
      return 1;
    }
    if($_system58 != null && $$_other_$_system58!= null && ((DisCo_class_) $_system58).objectID_ != $$_other_$_system58.objectID_){
      return ((DisCo_class_) $_system58).objectID_ - $$_other_$_system58.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_customer57() {
    Vector ret = new Vector();
    if($_customer57 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_customer$$$_Customer2$$$_System3$$_combination_(($_Customer2_interface_)iter_.nextElement(), $_system58, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system58() {
    Vector ret = new Vector();
    if($_system58 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_customer$$$_Customer2$$$_System3$$_combination_($_customer57, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "customer=" + ($_customer57 == null ? "<any>" : $_customer57.toString()) + ", "
       + "system=" + ($_system58 == null ? "<any>" : $_system58.toString()) + ", "
       + "now=" + ($_now59 == null ? "<any>" : $_now59.toString()) + ", ");
  }

  public boolean equal_participants_($_login_customer$$$_Customer2$$$_System3$$_combination_ trial) {
    return $_customer57 != null && $_customer57 == trial.$_customer57  && $_system58 != null && $_system58 == trial.$_system58 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_customer57);
    result_.addElement($_system58);
    return result_;
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_ clone_() {
    return new $_login_customer$$$_Customer2$$$_System3$$_combination_($_customer57, $_system58, my_specification_);
  }

  public boolean invalid_() {
    if ($_customer57 != null && $_customer57 == $_system58) return true;
    return invalid_;
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_ combine($_login_customer$$$_Customer2$$$_System3$$_combination_ other_) {
    $_login_customer$$$_Customer2$$$_System3$$_combination_ result_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
    if ($_customer57 == null) {
      result_.$_customer57 = other_.$_customer57;
    }
    else if (other_.$_customer57 == null) {
      result_.$_customer57 = $_customer57;
    }
    else if($_customer57 == other_.$_customer57) {
      result_.$_customer57 = $_customer57;
    }
    else return null;

    if ($_system58 == null) {
      result_.$_system58 = other_.$_system58;
    }
    else if (other_.$_system58 == null) {
      result_.$_system58 = $_system58;
    }
    else if($_system58 == other_.$_system58) {
      result_.$_system58 = $_system58;
    }
    else return null;

    return result_;
  }
}

class $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$ extends DisCo_action_ {
  Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_22;
  public $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ selected_combination_ = new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "login_shopkeeper";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper4_interface_ $_shopkeeper60 = selected_combination_.$_shopkeeper60;
    $_System3_interface_ $_system61 = selected_combination_.$_system61;
    Parameter_real_ $_now62 = selected_combination_.$_now62;
    return (((($_system61.get_$_active_customer24_().op_eq_((new DisCo_int_(-1)))).op_and_(($_system61.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system61.get_$_active_admin26_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system61) {
    return ($_system61.get_$_active_customer24_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_System3_interface_ $_system61) {
    return ($_system61.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_System3_interface_ $_system61) {
    return ($_system61.get_$_active_admin26_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ combs_ = new Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_(my_specification_);
    Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ partial_result_ = new Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system61();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system61 = $$$_one_combination_$$$.$_system61;
      if (partial_guard_1_($_system61)) {
        partial_result_.add_combination_(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, $_system61, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system61();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system61 = $$$_one_combination_$$$.$_system61;
      if (partial_guard_2_($_system61)) {
        partial_result_.add_combination_(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, $_system61, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system61();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system61 = $$$_one_combination_$$$.$_system61;
      if (partial_guard_3_($_system61)) {
        partial_result_.add_combination_(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, $_system61, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Shopkeeper4_interface_ $_shopkeeper60, $_System3_interface_ $_system61, Parameter_real_ $_now62) throws Assertion_exception_ {
    rhs_22 = (new DisCo_int_(((DisCo_class_)$_shopkeeper60).objectID_));
  }

  public void actual_execute($_Shopkeeper4_interface_ $_shopkeeper60, $_System3_interface_ $_system61, Parameter_real_ $_now62) throws Assertion_exception_ {
    try {
      $_system61.set_$_active_shopkeeper25_(rhs_22.get_val_());
      Iterator iEL23 = my_specification_.getEngineListeners_();
      while(iEL23.hasNext()) {
        ((EngineListener)(iEL23.next())).objectStateChanged((DisCo_class_)$_system61);
      }
      my_specification_.rt_.set_omega_($_now62.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper4_interface_ $_shopkeeper60, $_System3_interface_ $_system61, Parameter_real_ $_now62) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper60, $_system61, $_now62);
    actual_execute($_shopkeeper60, $_system61, $_now62);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action login_shopkeeper(Shopkeeper, System)");
    eval_guard_();
    selected_combination_ = new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 2){
      vd_ = new Value_description_(selected_combination_.$_now62.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now62.realval = value.realval;
      selected_combination_.$_now62.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action login_shopkeeper(Shopkeeper, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now62 = new Parameter_real_();
      selected_combination_.$_now62.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action login_shopkeeper(Shopkeeper, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for login_shopkeeper(Shopkeeper, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper60 != null, "Participant $_shopkeeper60 == null");
    new Assertion(selected_combination_.$_system61 != null, "Participant $_system61 == null");
    $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action login_shopkeeper(Shopkeeper, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_shopkeeper60, selected_combination_.$_system61, selected_combination_.$_now62);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper60 = ($_Shopkeeper4_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system61 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper60;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system61;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb_ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now62.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action login_shopkeeper(Shopkeeper, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper60() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper60 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper60() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system61() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system61 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system61() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper60());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system61());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper60 != null && (($_Shopkeeper4) (comb.$_shopkeeper60)).objectID_ != (($_Shopkeeper4) ($$$_ccc_$$$.$_shopkeeper60)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system61 != null && (($_System3) (comb.$_system61)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system61)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ pick_actual_parameters_($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_  comb_to_add_ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb_to_add_ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ combine(Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ other_) {
    Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_ result = new Combinations_$_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ mycomb = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ otherscomb = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) otherselems.next();
        $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ c = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper4_interface_ $_shopkeeper60 = null;
  $_System3_interface_ $_system61 = null;
  Parameter_real_ $_now62 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_Shopkeeper4_interface_ $_shopkeeper60, $_System3_interface_ $_system61, DisCo_specification_ my_specification) {
    this.$_shopkeeper60 = $_shopkeeper60;
    this.$_system61 = $_system61;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now62);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_other_$$$ = ($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper60 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper60);
    DisCo_class_ $$_other_$_system61 = ((DisCo_class_) $$$_other_$$$.$_system61);
    if($_shopkeeper60 == null && $$_other_$_shopkeeper60 != null){
      return -1;
    }
    if($_shopkeeper60 != null && $$_other_$_shopkeeper60 == null){
      return 1;
    }
    if($_shopkeeper60 != null && $$_other_$_shopkeeper60!= null && ((DisCo_class_) $_shopkeeper60).objectID_ != $$_other_$_shopkeeper60.objectID_){
      return ((DisCo_class_) $_shopkeeper60).objectID_ - $$_other_$_shopkeeper60.objectID_;
    }
    if($_system61 == null && $$_other_$_system61 != null){
      return -1;
    }
    if($_system61 != null && $$_other_$_system61 == null){
      return 1;
    }
    if($_system61 != null && $$_other_$_system61!= null && ((DisCo_class_) $_system61).objectID_ != $$_other_$_system61.objectID_){
      return ((DisCo_class_) $_system61).objectID_ - $$_other_$_system61.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper60() {
    Vector ret = new Vector();
    if($_shopkeeper60 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(($_Shopkeeper4_interface_)iter_.nextElement(), $_system61, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system61() {
    Vector ret = new Vector();
    if($_system61 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_shopkeeper60, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper60 == null ? "<any>" : $_shopkeeper60.toString()) + ", "
       + "system=" + ($_system61 == null ? "<any>" : $_system61.toString()) + ", "
       + "now=" + ($_now62 == null ? "<any>" : $_now62.toString()) + ", ");
  }

  public boolean equal_participants_($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ trial) {
    return $_shopkeeper60 != null && $_shopkeeper60 == trial.$_shopkeeper60  && $_system61 != null && $_system61 == trial.$_system61 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper60);
    result_.addElement($_system61);
    return result_;
  }

  public $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ clone_() {
    return new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_shopkeeper60, $_system61, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper60 != null && $_shopkeeper60 == $_system61) return true;
    return invalid_;
  }

  public $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ combine($_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ other_) {
    $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ result_ = new $_login_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, null, my_specification_);
    if ($_shopkeeper60 == null) {
      result_.$_shopkeeper60 = other_.$_shopkeeper60;
    }
    else if (other_.$_shopkeeper60 == null) {
      result_.$_shopkeeper60 = $_shopkeeper60;
    }
    else if($_shopkeeper60 == other_.$_shopkeeper60) {
      result_.$_shopkeeper60 = $_shopkeeper60;
    }
    else return null;

    if ($_system61 == null) {
      result_.$_system61 = other_.$_system61;
    }
    else if (other_.$_system61 == null) {
      result_.$_system61 = $_system61;
    }
    else if($_system61 == other_.$_system61) {
      result_.$_system61 = $_system61;
    }
    else return null;

    return result_;
  }
}

class $_login_admin$$$_Admin6$$$_System3$$ extends DisCo_action_ {
  Combinations_$_login_admin$$$_Admin6$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_24;
  public $_login_admin$$$_Admin6$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_login_admin$$$_Admin6$$$_System3$$_combination_ selected_combination_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "login_admin";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Admin6_interface_ $_admin63 = selected_combination_.$_admin63;
    $_System3_interface_ $_system64 = selected_combination_.$_system64;
    Parameter_real_ $_now65 = selected_combination_.$_now65;
    return (((($_system64.get_$_active_customer24_().op_eq_((new DisCo_int_(-1)))).op_and_(($_system64.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system64.get_$_active_admin26_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system64) {
    return ($_system64.get_$_active_customer24_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_System3_interface_ $_system64) {
    return ($_system64.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_System3_interface_ $_system64) {
    return ($_system64.get_$_active_admin26_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_login_admin$$$_Admin6$$$_System3$$_ combs_ = new Combinations_$_login_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Combinations_$_login_admin$$$_Admin6$$$_System3$$_ partial_result_ = new Combinations_$_login_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system64();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system64 = $$$_one_combination_$$$.$_system64;
      if (partial_guard_1_($_system64)) {
        partial_result_.add_combination_(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, $_system64, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system64();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system64 = $$$_one_combination_$$$.$_system64;
      if (partial_guard_2_($_system64)) {
        partial_result_.add_combination_(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, $_system64, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system64();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system64 = $$$_one_combination_$$$.$_system64;
      if (partial_guard_3_($_system64)) {
        partial_result_.add_combination_(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, $_system64, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Admin6_interface_ $_admin63, $_System3_interface_ $_system64, Parameter_real_ $_now65) throws Assertion_exception_ {
    rhs_24 = (new DisCo_int_(((DisCo_class_)$_admin63).objectID_));
  }

  public void actual_execute($_Admin6_interface_ $_admin63, $_System3_interface_ $_system64, Parameter_real_ $_now65) throws Assertion_exception_ {
    try {
      $_system64.set_$_active_admin26_(rhs_24.get_val_());
      Iterator iEL25 = my_specification_.getEngineListeners_();
      while(iEL25.hasNext()) {
        ((EngineListener)(iEL25.next())).objectStateChanged((DisCo_class_)$_system64);
      }
      my_specification_.rt_.set_omega_($_now65.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Admin6_interface_ $_admin63, $_System3_interface_ $_system64, Parameter_real_ $_now65) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_admin63, $_system64, $_now65);
    actual_execute($_admin63, $_system64, $_now65);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action login_admin(Admin, System)");
    eval_guard_();
    selected_combination_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("admin", "Admin"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 2){
      vd_ = new Value_description_(selected_combination_.$_now65.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now65.realval = value.realval;
      selected_combination_.$_now65.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action login_admin(Admin, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now65 = new Parameter_real_();
      selected_combination_.$_now65.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action login_admin(Admin, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for login_admin(Admin, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_admin63 != null, "Participant $_admin63 == null");
    new Assertion(selected_combination_.$_system64 != null, "Participant $_system64 == null");
    $_login_admin$$$_Admin6$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action login_admin(Admin, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_admin63, selected_combination_.$_system64, selected_combination_.$_now65);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_admin63 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system64 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_admin63;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system64;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_login_admin$$$_Admin6$$$_System3$$_combination_ comb_ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now65.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action login_admin(Admin, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_login_admin$$$_Admin6$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_login_admin$$$_Admin6$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_admin63() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin63 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin63() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system64() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system64 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system64() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin63());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system64());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_login_admin$$$_Admin6$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if(comb.$_admin63 != null && (($_Admin6) (comb.$_admin63)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin63)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system64 != null && (($_System3) (comb.$_system64)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system64)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_ pick_actual_parameters_($_login_admin$$$_Admin6$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_admin$$$_Admin6$$$_System3$$_combination_ comb = ($_login_admin$$$_Admin6$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_  comb_to_add_ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ comb_to_add_ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_login_admin$$$_Admin6$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_login_admin$$$_Admin6$$$_System3$$_ combine(Combinations_$_login_admin$$$_Admin6$$$_System3$$_ other_) {
    Combinations_$_login_admin$$$_Admin6$$$_System3$$_ result = new Combinations_$_login_admin$$$_Admin6$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ mycomb = ($_login_admin$$$_Admin6$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_login_admin$$$_Admin6$$$_System3$$_combination_ otherscomb = ($_login_admin$$$_Admin6$$$_System3$$_combination_) otherselems.next();
        $_login_admin$$$_Admin6$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_admin$$$_Admin6$$$_System3$$_combination_ c = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_login_admin$$$_Admin6$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Admin6_interface_ $_admin63 = null;
  $_System3_interface_ $_system64 = null;
  Parameter_real_ $_now65 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_login_admin$$$_Admin6$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_($_Admin6_interface_ $_admin63, $_System3_interface_ $_system64, DisCo_specification_ my_specification) {
    this.$_admin63 = $_admin63;
    this.$_system64 = $_system64;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now65);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_other_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_admin63 = ((DisCo_class_) $$$_other_$$$.$_admin63);
    DisCo_class_ $$_other_$_system64 = ((DisCo_class_) $$$_other_$$$.$_system64);
    if($_admin63 == null && $$_other_$_admin63 != null){
      return -1;
    }
    if($_admin63 != null && $$_other_$_admin63 == null){
      return 1;
    }
    if($_admin63 != null && $$_other_$_admin63!= null && ((DisCo_class_) $_admin63).objectID_ != $$_other_$_admin63.objectID_){
      return ((DisCo_class_) $_admin63).objectID_ - $$_other_$_admin63.objectID_;
    }
    if($_system64 == null && $$_other_$_system64 != null){
      return -1;
    }
    if($_system64 != null && $$_other_$_system64 == null){
      return 1;
    }
    if($_system64 != null && $$_other_$_system64!= null && ((DisCo_class_) $_system64).objectID_ != $$_other_$_system64.objectID_){
      return ((DisCo_class_) $_system64).objectID_ - $$_other_$_system64.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_admin63() {
    Vector ret = new Vector();
    if($_admin63 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_admin$$$_Admin6$$$_System3$$_combination_(($_Admin6_interface_)iter_.nextElement(), $_system64, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system64() {
    Vector ret = new Vector();
    if($_system64 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_admin$$$_Admin6$$$_System3$$_combination_($_admin63, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "admin=" + ($_admin63 == null ? "<any>" : $_admin63.toString()) + ", "
       + "system=" + ($_system64 == null ? "<any>" : $_system64.toString()) + ", "
       + "now=" + ($_now65 == null ? "<any>" : $_now65.toString()) + ", ");
  }

  public boolean equal_participants_($_login_admin$$$_Admin6$$$_System3$$_combination_ trial) {
    return $_admin63 != null && $_admin63 == trial.$_admin63  && $_system64 != null && $_system64 == trial.$_system64 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_admin63);
    result_.addElement($_system64);
    return result_;
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_ clone_() {
    return new $_login_admin$$$_Admin6$$$_System3$$_combination_($_admin63, $_system64, my_specification_);
  }

  public boolean invalid_() {
    if ($_admin63 != null && $_admin63 == $_system64) return true;
    return invalid_;
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_ combine($_login_admin$$$_Admin6$$$_System3$$_combination_ other_) {
    $_login_admin$$$_Admin6$$$_System3$$_combination_ result_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
    if ($_admin63 == null) {
      result_.$_admin63 = other_.$_admin63;
    }
    else if (other_.$_admin63 == null) {
      result_.$_admin63 = $_admin63;
    }
    else if($_admin63 == other_.$_admin63) {
      result_.$_admin63 = $_admin63;
    }
    else return null;

    if ($_system64 == null) {
      result_.$_system64 = other_.$_system64;
    }
    else if (other_.$_system64 == null) {
      result_.$_system64 = $_system64;
    }
    else if($_system64 == other_.$_system64) {
      result_.$_system64 = $_system64;
    }
    else return null;

    return result_;
  }
}

class $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$ extends DisCo_action_ {
  Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ enabled_for_;

  DisCo_int_ rhs_26;
  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ selected_combination_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(my_specification_);
  public String get_name_() {
    return "browse_book";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_customer66 = selected_combination_.$_customer66;
    $_Book0_interface_ $_book67 = selected_combination_.$_book67;
    $_Bookstore5_interface_ $_bookstore68 = selected_combination_.$_bookstore68;
    Parameter_real_ $_now69 = selected_combination_.$_now69;
    return (($_book67.get_$_owned_bookstore32_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore68).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book67, $_Bookstore5_interface_ $_bookstore68) {
    return ($_book67.get_$_owned_bookstore32_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore68).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ combs_ = new Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_(my_specification_);
    Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ partial_result_ = new Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book67();
    combs_.generate_explicit_combinations_$_bookstore68();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ $$$_one_combination_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book67 = $$$_one_combination_$$$.$_book67;
      $_Bookstore5_interface_ $_bookstore68 = $$$_one_combination_$$$.$_bookstore68;
      if (partial_guard_1_($_book67, $_bookstore68)) {
        partial_result_.add_combination_(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(null, $_book67, $_bookstore68, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Customer2_interface_ $_customer66, $_Book0_interface_ $_book67, $_Bookstore5_interface_ $_bookstore68, Parameter_real_ $_now69) throws Assertion_exception_ {
    rhs_26 = (new DisCo_int_(((DisCo_class_)$_book67).objectID_));
  }

  public void actual_execute($_Customer2_interface_ $_customer66, $_Book0_interface_ $_book67, $_Bookstore5_interface_ $_bookstore68, Parameter_real_ $_now69) throws Assertion_exception_ {
    try {
      $_customer66.set_$_browsing_currently37_(rhs_26.get_val_());
      Iterator iEL27 = my_specification_.getEngineListeners_();
      while(iEL27.hasNext()) {
        ((EngineListener)(iEL27.next())).objectStateChanged((DisCo_class_)$_customer66);
      }
      my_specification_.rt_.set_omega_($_now69.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Customer2_interface_ $_customer66, $_Book0_interface_ $_book67, $_Bookstore5_interface_ $_bookstore68, Parameter_real_ $_now69) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_customer66, $_book67, $_bookstore68, $_now69);
    actual_execute($_customer66, $_book67, $_bookstore68, $_now69);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action browse_book(Customer, Book, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 3){
      vd_ = new Value_description_(selected_combination_.$_now69.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 3){
      selected_combination_.$_now69.realval = value.realval;
      selected_combination_.$_now69.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action browse_book(Customer, Book, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 3){
      selected_combination_.$_now69 = new Parameter_real_();
      selected_combination_.$_now69.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action browse_book(Customer, Book, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for browse_book(Customer, Book, Bookstore) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_customer66 != null, "Participant $_customer66 == null");
    new Assertion(selected_combination_.$_book67 != null, "Participant $_book67 == null");
    new Assertion(selected_combination_.$_bookstore68 != null, "Participant $_bookstore68 == null");
    $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action browse_book(Customer, Book, Bookstore) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_customer66, selected_combination_.$_book67, selected_combination_.$_bookstore68, selected_combination_.$_now69);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_customer66 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book67 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore68 = ($_Bookstore5_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_customer66;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book67;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore68;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ comb_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      if (!comb_.$_now69.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action browse_book(Customer, Book, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_customer66() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer66 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer66() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book67() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book67 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book67() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore68() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore68 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore68() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer66());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book67());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore68());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      if(comb.$_customer66 != null && (($_Customer2) (comb.$_customer66)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer66)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book67 != null && (($_Book0) (comb.$_book67)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book67)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore68 != null && (($_Bookstore5) (comb.$_bookstore68)).objectID_ != (($_Bookstore5) ($$$_ccc_$$$.$_bookstore68)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next()).debug_();
    }
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ pick_actual_parameters_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ comb = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_  comb_to_add_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ comb_to_add_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ combine(Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ other_) {
    Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_ result = new Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ mycomb = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ otherscomb = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) otherselems.next();
        $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ c = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Customer2_interface_ $_customer66 = null;
  $_Book0_interface_ $_book67 = null;
  $_Bookstore5_interface_ $_bookstore68 = null;
  Parameter_real_ $_now69 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_($_Customer2_interface_ $_customer66, $_Book0_interface_ $_book67, $_Bookstore5_interface_ $_bookstore68, DisCo_specification_ my_specification) {
    this.$_customer66 = $_customer66;
    this.$_book67 = $_book67;
    this.$_bookstore68 = $_bookstore68;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now69);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ $$$_other_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_)o;
    DisCo_class_ $$_other_$_customer66 = ((DisCo_class_) $$$_other_$$$.$_customer66);
    DisCo_class_ $$_other_$_book67 = ((DisCo_class_) $$$_other_$$$.$_book67);
    DisCo_class_ $$_other_$_bookstore68 = ((DisCo_class_) $$$_other_$$$.$_bookstore68);
    if($_customer66 == null && $$_other_$_customer66 != null){
      return -1;
    }
    if($_customer66 != null && $$_other_$_customer66 == null){
      return 1;
    }
    if($_customer66 != null && $$_other_$_customer66!= null && ((DisCo_class_) $_customer66).objectID_ != $$_other_$_customer66.objectID_){
      return ((DisCo_class_) $_customer66).objectID_ - $$_other_$_customer66.objectID_;
    }
    if($_book67 == null && $$_other_$_book67 != null){
      return -1;
    }
    if($_book67 != null && $$_other_$_book67 == null){
      return 1;
    }
    if($_book67 != null && $$_other_$_book67!= null && ((DisCo_class_) $_book67).objectID_ != $$_other_$_book67.objectID_){
      return ((DisCo_class_) $_book67).objectID_ - $$_other_$_book67.objectID_;
    }
    if($_bookstore68 == null && $$_other_$_bookstore68 != null){
      return -1;
    }
    if($_bookstore68 != null && $$_other_$_bookstore68 == null){
      return 1;
    }
    if($_bookstore68 != null && $$_other_$_bookstore68!= null && ((DisCo_class_) $_bookstore68).objectID_ != $$_other_$_bookstore68.objectID_){
      return ((DisCo_class_) $_bookstore68).objectID_ - $$_other_$_bookstore68.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_customer66() {
    Vector ret = new Vector();
    if($_customer66 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(($_Customer2_interface_)iter_.nextElement(), $_book67, $_bookstore68, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book67() {
    Vector ret = new Vector();
    if($_book67 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_($_customer66, ($_Book0_interface_)iter_.nextElement(), $_bookstore68, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore68() {
    Vector ret = new Vector();
    if($_bookstore68 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_($_customer66, $_book67, ($_Bookstore5_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "customer=" + ($_customer66 == null ? "<any>" : $_customer66.toString()) + ", "
       + "book=" + ($_book67 == null ? "<any>" : $_book67.toString()) + ", "
       + "bookstore=" + ($_bookstore68 == null ? "<any>" : $_bookstore68.toString()) + ", "
       + "now=" + ($_now69 == null ? "<any>" : $_now69.toString()) + ", ");
  }

  public boolean equal_participants_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ trial) {
    return $_customer66 != null && $_customer66 == trial.$_customer66  && $_book67 != null && $_book67 == trial.$_book67  && $_bookstore68 != null && $_bookstore68 == trial.$_bookstore68 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_customer66);
    result_.addElement($_book67);
    result_.addElement($_bookstore68);
    return result_;
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ clone_() {
    return new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_($_customer66, $_book67, $_bookstore68, my_specification_);
  }

  public boolean invalid_() {
    if ($_customer66 != null && $_customer66 == $_book67) return true;
    if ($_customer66 != null && $_customer66 == $_bookstore68) return true;
    if ($_book67 != null && $_book67 == $_bookstore68) return true;
    return invalid_;
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ combine($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ other_) {
    $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_ result_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore5$$_combination_(null, null, null, my_specification_);
    if ($_customer66 == null) {
      result_.$_customer66 = other_.$_customer66;
    }
    else if (other_.$_customer66 == null) {
      result_.$_customer66 = $_customer66;
    }
    else if($_customer66 == other_.$_customer66) {
      result_.$_customer66 = $_customer66;
    }
    else return null;

    if ($_book67 == null) {
      result_.$_book67 = other_.$_book67;
    }
    else if (other_.$_book67 == null) {
      result_.$_book67 = $_book67;
    }
    else if($_book67 == other_.$_book67) {
      result_.$_book67 = $_book67;
    }
    else return null;

    if ($_bookstore68 == null) {
      result_.$_bookstore68 = other_.$_bookstore68;
    }
    else if (other_.$_bookstore68 == null) {
      result_.$_bookstore68 = $_bookstore68;
    }
    else if($_bookstore68 == other_.$_bookstore68) {
      result_.$_bookstore68 = $_bookstore68;
    }
    else return null;

    return result_;
  }
}

class $_logout_customer$$$_Customer2$$$_System3$$ extends DisCo_action_ {
  Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_28;
  public $_logout_customer$$$_Customer2$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_logout_customer$$$_Customer2$$$_System3$$_combination_ selected_combination_ = new $_logout_customer$$$_Customer2$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "logout_customer";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_customer70 = selected_combination_.$_customer70;
    $_System3_interface_ $_system71 = selected_combination_.$_system71;
    Parameter_real_ $_now72 = selected_combination_.$_now72;
    return (($_system71.get_$_active_customer24_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer70).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71) {
    return ($_system71.get_$_active_customer24_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer70).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ combs_ = new Combinations_$_logout_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ partial_result_ = new Combinations_$_logout_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_customer70();
    combs_.generate_explicit_combinations_$_system71();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_customer70 = $$$_one_combination_$$$.$_customer70;
      $_System3_interface_ $_system71 = $$$_one_combination_$$$.$_system71;
      if (partial_guard_1_($_customer70, $_system71)) {
        partial_result_.add_combination_(new $_logout_customer$$$_Customer2$$$_System3$$_combination_($_customer70, $_system71, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71, Parameter_real_ $_now72) throws Assertion_exception_ {
    rhs_28 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71, Parameter_real_ $_now72) throws Assertion_exception_ {
    try {
      $_system71.set_$_active_customer24_(rhs_28.get_val_());
      Iterator iEL29 = my_specification_.getEngineListeners_();
      while(iEL29.hasNext()) {
        ((EngineListener)(iEL29.next())).objectStateChanged((DisCo_class_)$_system71);
      }
      my_specification_.rt_.set_omega_($_now72.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71, Parameter_real_ $_now72) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_customer70, $_system71, $_now72);
    actual_execute($_customer70, $_system71, $_now72);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action logout_customer(Customer, System)");
    eval_guard_();
    selected_combination_ = new $_logout_customer$$$_Customer2$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 2){
      vd_ = new Value_description_(selected_combination_.$_now72.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now72.realval = value.realval;
      selected_combination_.$_now72.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action logout_customer(Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now72 = new Parameter_real_();
      selected_combination_.$_now72.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action logout_customer(Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for logout_customer(Customer, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_customer70 != null, "Participant $_customer70 == null");
    new Assertion(selected_combination_.$_system71 != null, "Participant $_system71 == null");
    $_logout_customer$$$_Customer2$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action logout_customer(Customer, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_customer70, selected_combination_.$_system71, selected_combination_.$_now72);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_customer70 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system71 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_customer70;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system71;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_logout_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ comb_ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now72.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action logout_customer(Customer, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_logout_customer$$$_Customer2$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_logout_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_customer70() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer70 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer70() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system71() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system71 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system71() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer70());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system71());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_logout_customer$$$_Customer2$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if(comb.$_customer70 != null && (($_Customer2) (comb.$_customer70)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer70)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system71 != null && (($_System3) (comb.$_system71)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system71)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_ pick_actual_parameters_($_logout_customer$$$_Customer2$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ comb = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_  comb_to_add_ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ comb_to_add_ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_logout_customer$$$_Customer2$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ combine(Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ other_) {
    Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ result = new Combinations_$_logout_customer$$$_Customer2$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ mycomb = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_logout_customer$$$_Customer2$$$_System3$$_combination_ otherscomb = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) otherselems.next();
        $_logout_customer$$$_Customer2$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ c = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_logout_customer$$$_Customer2$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Customer2_interface_ $_customer70 = null;
  $_System3_interface_ $_system71 = null;
  Parameter_real_ $_now72 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71, DisCo_specification_ my_specification) {
    this.$_customer70 = $_customer70;
    this.$_system71 = $_system71;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now72);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_other_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_customer70 = ((DisCo_class_) $$$_other_$$$.$_customer70);
    DisCo_class_ $$_other_$_system71 = ((DisCo_class_) $$$_other_$$$.$_system71);
    if($_customer70 == null && $$_other_$_customer70 != null){
      return -1;
    }
    if($_customer70 != null && $$_other_$_customer70 == null){
      return 1;
    }
    if($_customer70 != null && $$_other_$_customer70!= null && ((DisCo_class_) $_customer70).objectID_ != $$_other_$_customer70.objectID_){
      return ((DisCo_class_) $_customer70).objectID_ - $$_other_$_customer70.objectID_;
    }
    if($_system71 == null && $$_other_$_system71 != null){
      return -1;
    }
    if($_system71 != null && $$_other_$_system71 == null){
      return 1;
    }
    if($_system71 != null && $$_other_$_system71!= null && ((DisCo_class_) $_system71).objectID_ != $$_other_$_system71.objectID_){
      return ((DisCo_class_) $_system71).objectID_ - $$_other_$_system71.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_customer70() {
    Vector ret = new Vector();
    if($_customer70 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_customer$$$_Customer2$$$_System3$$_combination_(($_Customer2_interface_)iter_.nextElement(), $_system71, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system71() {
    Vector ret = new Vector();
    if($_system71 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_customer$$$_Customer2$$$_System3$$_combination_($_customer70, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "customer=" + ($_customer70 == null ? "<any>" : $_customer70.toString()) + ", "
       + "system=" + ($_system71 == null ? "<any>" : $_system71.toString()) + ", "
       + "now=" + ($_now72 == null ? "<any>" : $_now72.toString()) + ", ");
  }

  public boolean equal_participants_($_logout_customer$$$_Customer2$$$_System3$$_combination_ trial) {
    return $_customer70 != null && $_customer70 == trial.$_customer70  && $_system71 != null && $_system71 == trial.$_system71 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_customer70);
    result_.addElement($_system71);
    return result_;
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_ clone_() {
    return new $_logout_customer$$$_Customer2$$$_System3$$_combination_($_customer70, $_system71, my_specification_);
  }

  public boolean invalid_() {
    if ($_customer70 != null && $_customer70 == $_system71) return true;
    return invalid_;
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_ combine($_logout_customer$$$_Customer2$$$_System3$$_combination_ other_) {
    $_logout_customer$$$_Customer2$$$_System3$$_combination_ result_ = new $_logout_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
    if ($_customer70 == null) {
      result_.$_customer70 = other_.$_customer70;
    }
    else if (other_.$_customer70 == null) {
      result_.$_customer70 = $_customer70;
    }
    else if($_customer70 == other_.$_customer70) {
      result_.$_customer70 = $_customer70;
    }
    else return null;

    if ($_system71 == null) {
      result_.$_system71 = other_.$_system71;
    }
    else if (other_.$_system71 == null) {
      result_.$_system71 = $_system71;
    }
    else if($_system71 == other_.$_system71) {
      result_.$_system71 = $_system71;
    }
    else return null;

    return result_;
  }
}

class $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$ extends DisCo_action_ {
  Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_30;
  public $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ selected_combination_ = new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "logout_shopkeeper";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper4_interface_ $_shopkeeper73 = selected_combination_.$_shopkeeper73;
    $_System3_interface_ $_system74 = selected_combination_.$_system74;
    Parameter_real_ $_now75 = selected_combination_.$_now75;
    return (($_system74.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper73).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Shopkeeper4_interface_ $_shopkeeper73, $_System3_interface_ $_system74) {
    return ($_system74.get_$_active_shopkeeper25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper73).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ combs_ = new Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_(my_specification_);
    Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ partial_result_ = new Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper73();
    combs_.generate_explicit_combinations_$_system74();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) comb_i_.next();
      $_Shopkeeper4_interface_ $_shopkeeper73 = $$$_one_combination_$$$.$_shopkeeper73;
      $_System3_interface_ $_system74 = $$$_one_combination_$$$.$_system74;
      if (partial_guard_1_($_shopkeeper73, $_system74)) {
        partial_result_.add_combination_(new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_shopkeeper73, $_system74, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Shopkeeper4_interface_ $_shopkeeper73, $_System3_interface_ $_system74, Parameter_real_ $_now75) throws Assertion_exception_ {
    rhs_30 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Shopkeeper4_interface_ $_shopkeeper73, $_System3_interface_ $_system74, Parameter_real_ $_now75) throws Assertion_exception_ {
    try {
      $_system74.set_$_active_shopkeeper25_(rhs_30.get_val_());
      Iterator iEL31 = my_specification_.getEngineListeners_();
      while(iEL31.hasNext()) {
        ((EngineListener)(iEL31.next())).objectStateChanged((DisCo_class_)$_system74);
      }
      my_specification_.rt_.set_omega_($_now75.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper4_interface_ $_shopkeeper73, $_System3_interface_ $_system74, Parameter_real_ $_now75) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper73, $_system74, $_now75);
    actual_execute($_shopkeeper73, $_system74, $_now75);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action logout_shopkeeper(Shopkeeper, System)");
    eval_guard_();
    selected_combination_ = new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 2){
      vd_ = new Value_description_(selected_combination_.$_now75.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now75.realval = value.realval;
      selected_combination_.$_now75.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action logout_shopkeeper(Shopkeeper, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now75 = new Parameter_real_();
      selected_combination_.$_now75.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action logout_shopkeeper(Shopkeeper, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for logout_shopkeeper(Shopkeeper, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper73 != null, "Participant $_shopkeeper73 == null");
    new Assertion(selected_combination_.$_system74 != null, "Participant $_system74 == null");
    $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action logout_shopkeeper(Shopkeeper, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_shopkeeper73, selected_combination_.$_system74, selected_combination_.$_now75);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper73 = ($_Shopkeeper4_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system74 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper73;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system74;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb_ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now75.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action logout_shopkeeper(Shopkeeper, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper73() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper73 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper73() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system74() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system74 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system74() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper73());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system74());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper73 != null && (($_Shopkeeper4) (comb.$_shopkeeper73)).objectID_ != (($_Shopkeeper4) ($$$_ccc_$$$.$_shopkeeper73)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system74 != null && (($_System3) (comb.$_system74)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system74)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ pick_actual_parameters_($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_  comb_to_add_ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb_to_add_ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ combine(Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ other_) {
    Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_ result = new Combinations_$_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ mycomb = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ otherscomb = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) otherselems.next();
        $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ c = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper4_interface_ $_shopkeeper73 = null;
  $_System3_interface_ $_system74 = null;
  Parameter_real_ $_now75 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_Shopkeeper4_interface_ $_shopkeeper73, $_System3_interface_ $_system74, DisCo_specification_ my_specification) {
    this.$_shopkeeper73 = $_shopkeeper73;
    this.$_system74 = $_system74;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now75);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ $$$_other_$$$ = ($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper73 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper73);
    DisCo_class_ $$_other_$_system74 = ((DisCo_class_) $$$_other_$$$.$_system74);
    if($_shopkeeper73 == null && $$_other_$_shopkeeper73 != null){
      return -1;
    }
    if($_shopkeeper73 != null && $$_other_$_shopkeeper73 == null){
      return 1;
    }
    if($_shopkeeper73 != null && $$_other_$_shopkeeper73!= null && ((DisCo_class_) $_shopkeeper73).objectID_ != $$_other_$_shopkeeper73.objectID_){
      return ((DisCo_class_) $_shopkeeper73).objectID_ - $$_other_$_shopkeeper73.objectID_;
    }
    if($_system74 == null && $$_other_$_system74 != null){
      return -1;
    }
    if($_system74 != null && $$_other_$_system74 == null){
      return 1;
    }
    if($_system74 != null && $$_other_$_system74!= null && ((DisCo_class_) $_system74).objectID_ != $$_other_$_system74.objectID_){
      return ((DisCo_class_) $_system74).objectID_ - $$_other_$_system74.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper73() {
    Vector ret = new Vector();
    if($_shopkeeper73 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(($_Shopkeeper4_interface_)iter_.nextElement(), $_system74, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system74() {
    Vector ret = new Vector();
    if($_system74 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_shopkeeper73, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper73 == null ? "<any>" : $_shopkeeper73.toString()) + ", "
       + "system=" + ($_system74 == null ? "<any>" : $_system74.toString()) + ", "
       + "now=" + ($_now75 == null ? "<any>" : $_now75.toString()) + ", ");
  }

  public boolean equal_participants_($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ trial) {
    return $_shopkeeper73 != null && $_shopkeeper73 == trial.$_shopkeeper73  && $_system74 != null && $_system74 == trial.$_system74 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper73);
    result_.addElement($_system74);
    return result_;
  }

  public $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ clone_() {
    return new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_($_shopkeeper73, $_system74, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper73 != null && $_shopkeeper73 == $_system74) return true;
    return invalid_;
  }

  public $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ combine($_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ other_) {
    $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_ result_ = new $_logout_shopkeeper$$$_Shopkeeper4$$$_System3$$_combination_(null, null, my_specification_);
    if ($_shopkeeper73 == null) {
      result_.$_shopkeeper73 = other_.$_shopkeeper73;
    }
    else if (other_.$_shopkeeper73 == null) {
      result_.$_shopkeeper73 = $_shopkeeper73;
    }
    else if($_shopkeeper73 == other_.$_shopkeeper73) {
      result_.$_shopkeeper73 = $_shopkeeper73;
    }
    else return null;

    if ($_system74 == null) {
      result_.$_system74 = other_.$_system74;
    }
    else if (other_.$_system74 == null) {
      result_.$_system74 = $_system74;
    }
    else if($_system74 == other_.$_system74) {
      result_.$_system74 = $_system74;
    }
    else return null;

    return result_;
  }
}

class $_logout_admin$$$_Admin6$$$_System3$$ extends DisCo_action_ {
  Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_32;
  public $_logout_admin$$$_Admin6$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_logout_admin$$$_Admin6$$$_System3$$_combination_ selected_combination_ = new $_logout_admin$$$_Admin6$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "logout_admin";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Admin6_interface_ $_admin76 = selected_combination_.$_admin76;
    $_System3_interface_ $_system77 = selected_combination_.$_system77;
    Parameter_real_ $_now78 = selected_combination_.$_now78;
    return (($_system77.get_$_active_admin26_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin76).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77) {
    return ($_system77.get_$_active_admin26_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin76).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ combs_ = new Combinations_$_logout_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ partial_result_ = new Combinations_$_logout_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_admin76();
    combs_.generate_explicit_combinations_$_system77();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_Admin6_interface_ $_admin76 = $$$_one_combination_$$$.$_admin76;
      $_System3_interface_ $_system77 = $$$_one_combination_$$$.$_system77;
      if (partial_guard_1_($_admin76, $_system77)) {
        partial_result_.add_combination_(new $_logout_admin$$$_Admin6$$$_System3$$_combination_($_admin76, $_system77, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    enabled_for_ = combs_;
    enabled_bit_ = !combs_.empty();
    return enabled_bit_;
  }
  public void initialize_execute($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77, Parameter_real_ $_now78) throws Assertion_exception_ {
    rhs_32 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77, Parameter_real_ $_now78) throws Assertion_exception_ {
    try {
      $_system77.set_$_active_admin26_(rhs_32.get_val_());
      Iterator iEL33 = my_specification_.getEngineListeners_();
      while(iEL33.hasNext()) {
        ((EngineListener)(iEL33.next())).objectStateChanged((DisCo_class_)$_system77);
      }
      my_specification_.rt_.set_omega_($_now78.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77, Parameter_real_ $_now78) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_admin76, $_system77, $_now78);
    actual_execute($_admin76, $_system77, $_now78);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action logout_admin(Admin, System)");
    eval_guard_();
    selected_combination_ = new $_logout_admin$$$_Admin6$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("admin", "Admin"));
    result_.addElement(new Name_type_pair_("system", "System"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 2){
      vd_ = new Value_description_(selected_combination_.$_now78.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now78.realval = value.realval;
      selected_combination_.$_now78.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action logout_admin(Admin, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now78 = new Parameter_real_();
      selected_combination_.$_now78.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action logout_admin(Admin, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for logout_admin(Admin, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_admin76 != null, "Participant $_admin76 == null");
    new Assertion(selected_combination_.$_system77 != null, "Participant $_system77 == null");
    $_logout_admin$$$_Admin6$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
    if(comb == null){
      return false;
    } else {
      my_specification_.debug_("Selected combination is");
      selected_combination_.debug_();
      my_specification_.debug_("Guard evaluates to");
      my_specification_.debug_(eval_guard_for_selected_combination_());
      return eval_guard_for_selected_combination_();
    }
  }
  public Vector get_combinations_() {
    enabled_for_.generate_explicit_combinations_();
    fix_parameters_();
    return enabled_for_.to_vector_();
  }
  public void execute_action_() throws Assertion_exception_ {
    my_specification_.debug_("Executing action logout_admin(Admin, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_admin76, selected_combination_.$_system77, selected_combination_.$_now78);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_admin76 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system77 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_admin76;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system77;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_logout_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ comb_ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now78.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action logout_admin(Admin, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_logout_admin$$$_Admin6$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_logout_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_admin76() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin76 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin76() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system77() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system77 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system77() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  //Combinations are created with respect to roles
  public void generate_explicit_combinations_() {
    Set tmp_combinations;
    Iterator combs_iter_;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin76());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system77());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_logout_admin$$$_Admin6$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if(comb.$_admin76 != null && (($_Admin6) (comb.$_admin76)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin76)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system77 != null && (($_System3) (comb.$_system77)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system77)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_ pick_actual_parameters_($_logout_admin$$$_Admin6$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ comb = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) (iter.next());
      if(comb.equal_participants_(selected_combination)){
        return comb;
      }
    }
    return null;
  }

  public Vector to_vector_of_combination_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_  comb_to_add_ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ comb_to_add_ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_logout_admin$$$_Admin6$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ combine(Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ other_) {
    Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ result = new Combinations_$_logout_admin$$$_Admin6$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ mycomb = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_logout_admin$$$_Admin6$$$_System3$$_combination_ otherscomb = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) otherselems.next();
        $_logout_admin$$$_Admin6$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
        if (resultcomb != null) {
          result.combinations.add(resultcomb);
        }
      }
    }

    remove_invalid_combinations_();
    return result;
  }

  public void remove_invalid_combinations_() {
    Set TMP_combinations = new TreeSet();
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ c = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_logout_admin$$$_Admin6$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Admin6_interface_ $_admin76 = null;
  $_System3_interface_ $_system77 = null;
  Parameter_real_ $_now78 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77, DisCo_specification_ my_specification) {
    this.$_admin76 = $_admin76;
    this.$_system77 = $_system77;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now78);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_other_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_admin76 = ((DisCo_class_) $$$_other_$$$.$_admin76);
    DisCo_class_ $$_other_$_system77 = ((DisCo_class_) $$$_other_$$$.$_system77);
    if($_admin76 == null && $$_other_$_admin76 != null){
      return -1;
    }
    if($_admin76 != null && $$_other_$_admin76 == null){
      return 1;
    }
    if($_admin76 != null && $$_other_$_admin76!= null && ((DisCo_class_) $_admin76).objectID_ != $$_other_$_admin76.objectID_){
      return ((DisCo_class_) $_admin76).objectID_ - $$_other_$_admin76.objectID_;
    }
    if($_system77 == null && $$_other_$_system77 != null){
      return -1;
    }
    if($_system77 != null && $$_other_$_system77 == null){
      return 1;
    }
    if($_system77 != null && $$_other_$_system77!= null && ((DisCo_class_) $_system77).objectID_ != $$_other_$_system77.objectID_){
      return ((DisCo_class_) $_system77).objectID_ - $$_other_$_system77.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_admin76() {
    Vector ret = new Vector();
    if($_admin76 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_admin$$$_Admin6$$$_System3$$_combination_(($_Admin6_interface_)iter_.nextElement(), $_system77, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system77() {
    Vector ret = new Vector();
    if($_system77 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_admin$$$_Admin6$$$_System3$$_combination_($_admin76, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "admin=" + ($_admin76 == null ? "<any>" : $_admin76.toString()) + ", "
       + "system=" + ($_system77 == null ? "<any>" : $_system77.toString()) + ", "
       + "now=" + ($_now78 == null ? "<any>" : $_now78.toString()) + ", ");
  }

  public boolean equal_participants_($_logout_admin$$$_Admin6$$$_System3$$_combination_ trial) {
    return $_admin76 != null && $_admin76 == trial.$_admin76  && $_system77 != null && $_system77 == trial.$_system77 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_admin76);
    result_.addElement($_system77);
    return result_;
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_ clone_() {
    return new $_logout_admin$$$_Admin6$$$_System3$$_combination_($_admin76, $_system77, my_specification_);
  }

  public boolean invalid_() {
    if ($_admin76 != null && $_admin76 == $_system77) return true;
    return invalid_;
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_ combine($_logout_admin$$$_Admin6$$$_System3$$_combination_ other_) {
    $_logout_admin$$$_Admin6$$$_System3$$_combination_ result_ = new $_logout_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
    if ($_admin76 == null) {
      result_.$_admin76 = other_.$_admin76;
    }
    else if (other_.$_admin76 == null) {
      result_.$_admin76 = $_admin76;
    }
    else if($_admin76 == other_.$_admin76) {
      result_.$_admin76 = $_admin76;
    }
    else return null;

    if ($_system77 == null) {
      result_.$_system77 = other_.$_system77;
    }
    else if (other_.$_system77 == null) {
      result_.$_system77 = $_system77;
    }
    else if($_system77 == other_.$_system77) {
      result_.$_system77 = $_system77;
    }
    else return null;

    return result_;
  }
}

class Functions_ {
}

