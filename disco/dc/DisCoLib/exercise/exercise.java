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
    actions_.addElement(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$(actions_.size(), this));
    actions_.addElement(new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$(actions_.size(), this));
    actions_.addElement(new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$(actions_.size(), this));
    actions_.addElement(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$(actions_.size(), this));
    actions_.addElement(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_login_customer$$$_Customer2$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_login_admin$$$_Admin6$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_logout_customer$$$_Customer2$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_logout_admin$$$_Admin6$$$_System3$$(actions_.size(), this));
    actions_.addElement(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$(actions_.size(), this));
    actions_.addElement(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$(actions_.size(), this));
    actions_.addElement(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$(actions_.size(), this));
    actions_.addElement(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$(actions_.size(), this));
    actions_.addElement(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$(actions_.size(), this));
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
    result_.addElement($_Bookstore4.get_description_());
    result_.addElement($_Basket1.get_description_());
    result_.addElement($_Book0.get_description_());
    result_.addElement($_Customer2.get_description_());
    result_.addElement($_Shopkeeper5.get_description_());
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
      $_Bookstore4 o_ = new $_Bookstore4(d_);
      o_.$_Bookstore4_id_ = object_vectors_.$_Bookstore4_objs_.size();
      object_vectors_.$_Bookstore4_objs_.addElement(o_);
      o_.objectID_ = nextObjectID_++;
      objects_.addElement(o_);
      Iterator iEL = getEngineListeners_();
      while(iEL.hasNext()) {
        ((EngineListener)(iEL.next())).objectAdded(o_);
      }
      return o_;
    }
    else if (d_.class_name == "Basket") {
      $_Basket1 o_ = new $_Basket1(d_);
      o_.$_Basket1_id_ = object_vectors_.$_Basket1_objs_.size();
      object_vectors_.$_Basket1_objs_.addElement(o_);
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
      $_Shopkeeper5 o_ = new $_Shopkeeper5(d_);
      o_.$_Shopkeeper5_id_ = object_vectors_.$_Shopkeeper5_objs_.size();
      object_vectors_.$_Shopkeeper5_objs_.addElement(o_);
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
    if(v_.record_type_.type_id_ == 18){
      return new $_Bookstore4.$_yes7(v_);
    }
    if(v_.record_type_.type_id_ == 19){
      return new $_Bookstore4.$_no8(v_);
    }
    if(v_.record_type_.type_id_ == 28){
      return new $_Basket1.$_first9(v_);
    }
    if(v_.record_type_.type_id_ == 29){
      return new $_Basket1.$_second10(v_);
    }
    if(v_.record_type_.type_id_ == 30){
      return new $_Basket1.$_third11(v_);
    }
    if(v_.record_type_.type_id_ == 31){
      return new $_Basket1.$_full12(v_);
    }
    if(v_.record_type_.type_id_ == 40){
      return new $_Book0.$_OfficerWithAGoal13(v_);
    }
    if(v_.record_type_.type_id_ == 41){
      return new $_Book0.$_EnemyWithVigor14(v_);
    }
    if(v_.record_type_.type_id_ == 42){
      return new $_Book0.$_GirlsOfThePrison15(v_);
    }
    if(v_.record_type_.type_id_ == 43){
      return new $_Book0.$_GuardiansOfHell16(v_);
    }
    if(v_.record_type_.type_id_ == 44){
      return new $_Book0.$_AliensAndBandits17(v_);
    }
    if(v_.record_type_.type_id_ == 45){
      return new $_Book0.$_AchievementOfDespair18(v_);
    }
    if(v_.record_type_.type_id_ == 46){
      return new $_Book0.$_BorderWithHonor19(v_);
    }
    if(v_.record_type_.type_id_ == 54){
      return new $_Shopkeeper5.$_no20(v_);
    }
    if(v_.record_type_.type_id_ == 55){
      return new $_Shopkeeper5.$_yes21(v_);
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
      for(int i = (($_Bookstore4)dc).$_Bookstore4_id_ + 1; i < object_vectors_.$_Bookstore4_objs_.size(); ++i){
        (($_Bookstore4)object_vectors_.$_Bookstore4_objs_.elementAt(i)).$_Bookstore4_id_ -= 1;
      }
      object_vectors_.$_Bookstore4_objs_.remove(dc);
    }
    else if (dc.get_class_name_() == "Basket") {
      for(int i = (($_Basket1)dc).$_Basket1_id_ + 1; i < object_vectors_.$_Basket1_objs_.size(); ++i){
        (($_Basket1)object_vectors_.$_Basket1_objs_.elementAt(i)).$_Basket1_id_ -= 1;
      }
      object_vectors_.$_Basket1_objs_.remove(dc);
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
      for(int i = (($_Shopkeeper5)dc).$_Shopkeeper5_id_ + 1; i < object_vectors_.$_Shopkeeper5_objs_.size(); ++i){
        (($_Shopkeeper5)object_vectors_.$_Shopkeeper5_objs_.elementAt(i)).$_Shopkeeper5_id_ -= 1;
      }
      object_vectors_.$_Shopkeeper5_objs_.remove(dc);
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
    } else     if(java_name.equals("$_Bookstore4")){
      return $_Bookstore4_objs_;
    } else     if(java_name.equals("$_Basket1")){
      return $_Basket1_objs_;
    } else     if(java_name.equals("$_Book0")){
      return $_Book0_objs_;
    } else     if(java_name.equals("$_Customer2")){
      return $_Customer2_objs_;
    } else     if(java_name.equals("$_Shopkeeper5")){
      return $_Shopkeeper5_objs_;
    } else     if(java_name.equals("$_Admin6")){
      return $_Admin6_objs_;
    } else {
      return null;//assert(false)
    }
  }
  Vector $_System3_objs_ = new Vector();
  Vector $_Bookstore4_objs_ = new Vector();
  Vector $_Basket1_objs_ = new Vector();
  Vector $_Book0_objs_ = new Vector();
  Vector $_Customer2_objs_ = new Vector();
  Vector $_Shopkeeper5_objs_ = new Vector();
  Vector $_Admin6_objs_ = new Vector();
}

class Constants_ {
}

interface $_System3_interface_ {
  DisCo_int_ get_$_active_customer22_();
  void set_$_active_customer22_(int val_);
  DisCo_int_ get_$_active_shopkeeper23_();
  void set_$_active_shopkeeper23_(int val_);
  DisCo_int_ get_$_active_admin24_();
  void set_$_active_admin24_(int val_);
}

interface $_Bookstore4_interface_ {
  DisCo_int_ get_$_owner25_();
  void set_$_owner25_(int val_);
  DisCo_type_ get_$_created26_();
  void set_$_created26_(DisCo_type_ val_);
}

interface $_Basket1_interface_ {
  DisCo_int_ get_$_book_127_();
  void set_$_book_127_(int val_);
  DisCo_int_ get_$_book_228_();
  void set_$_book_228_(int val_);
  DisCo_int_ get_$_book_329_();
  void set_$_book_329_(int val_);
  DisCo_type_ get_$_next_empty30_();
  void set_$_next_empty30_(DisCo_type_ val_);
}

interface $_Book0_interface_ {
  DisCo_int_ get_$_owned_bookstore31_();
  void set_$_owned_bookstore31_(int val_);
  DisCo_int_ get_$_owned_customer32_();
  void set_$_owned_customer32_(int val_);
  DisCo_int_ get_$_in_basket33_();
  void set_$_in_basket33_(int val_);
  DisCo_type_ get_$_name34_();
  void set_$_name34_(DisCo_type_ val_);
}

interface $_Customer2_interface_ {
  DisCo_int_ get_$_browsing_currently35_();
  void set_$_browsing_currently35_(int val_);
  DisCo_int_ get_$_owns_basket36_();
  void set_$_owns_basket36_(int val_);
}

interface $_Shopkeeper5_interface_ {
  DisCo_type_ get_$_registed37_();
  void set_$_registed37_(DisCo_type_ val_);
}

interface $_Admin6_interface_ {
}

interface $_yes7_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_no8_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_first9_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_second10_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_third11_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_full12_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_OfficerWithAGoal13_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_EnemyWithVigor14_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_GirlsOfThePrison15_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_GuardiansOfHell16_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_AliensAndBandits17_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_AchievementOfDespair18_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
  Object clone();
  void fields_to_value_description_(Value_description_ v_);
  Value_description_ get_value_description_();
  public Object get_val_();
}

interface $_BorderWithHonor19_interface_ extends DisCo_type_interface_, DisCo_expression_interface_, Comparable {
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
    $_active_customer22 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_active_shopkeeper23 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
    $_active_admin24 = ((Value_description_)d_.fields.elementAt(2)).referenceval;
  }

  public int $_System3_id_;
  public String get_class_name_() {
    return "System";
  }

  public String toString() {
    return get_name_() + "(" + "active_customer = " + get_$_active_customer22_().toString() + " ;" + "active_shopkeeper = " + get_$_active_shopkeeper23_().toString() + " ;" + "active_admin = " + get_$_active_admin24_().toString() + " ;" + ")";
  }







  int $_active_customer22;
  public DisCo_int_ get_$_active_customer22_() {
    return new DisCo_int_($_active_customer22);
  }
  public void set_$_active_customer22_(int val_) {
    $_active_customer22 = val_;
  }


  int $_active_shopkeeper23;
  public DisCo_int_ get_$_active_shopkeeper23_() {
    return new DisCo_int_($_active_shopkeeper23);
  }
  public void set_$_active_shopkeeper23_(int val_) {
    $_active_shopkeeper23 = val_;
  }


  int $_active_admin24;
  public DisCo_int_ get_$_active_admin24_() {
    return new DisCo_int_($_active_admin24);
  }
  public void set_$_active_admin24_(int val_) {
    $_active_admin24 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "System";
    Field_description_ active_customer_field_ = new Field_description_();
    active_customer_field_.name = "active_customer";
    Type_description_ active_customer_type_ = new Type_description_(Type_description_.REFERENCE,8, "_exercise_reference_to_Customer__GenName0", "Customer");
    active_customer_field_.value.referenceval = $_active_customer22;
    active_customer_field_.type = active_customer_type_;
    d_.fields.addElement(active_customer_field_);

    Field_description_ active_shopkeeper_field_ = new Field_description_();
    active_shopkeeper_field_.name = "active_shopkeeper";
    Type_description_ active_shopkeeper_type_ = new Type_description_(Type_description_.REFERENCE,10, "_exercise_reference_to_Shopkeeper__GenName1", "Shopkeeper");
    active_shopkeeper_field_.value.referenceval = $_active_shopkeeper23;
    active_shopkeeper_field_.type = active_shopkeeper_type_;
    d_.fields.addElement(active_shopkeeper_field_);

    Field_description_ active_admin_field_ = new Field_description_();
    active_admin_field_.name = "active_admin";
    Type_description_ active_admin_type_ = new Type_description_(Type_description_.REFERENCE,12, "_exercise_reference_to_Admin__GenName2", "Admin");
    active_admin_field_.value.referenceval = $_active_admin24;
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


class $_Bookstore4 extends DisCo_class_ implements $_Bookstore4_interface_ {
  public $_Bookstore4() {
    super();
  }

  public $_Bookstore4(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_owner25 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_created26 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(1));
  }

  public int $_Bookstore4_id_;
  public String get_class_name_() {
    return "Bookstore";
  }

  public String toString() {
    return get_name_() + "(" + "owner = " + get_$_owner25_().toString() + " ;" + "created = " + get_$_created26_().toString() + " ;" + ")";
  }


  static class $_yes7 extends DisCo_type_ implements $_yes7_interface_ {
    public int get_id_of_type_() {
      return 18;
    }

    public $_yes7(Value_description_ d_) {
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
    public $_yes7() {
      super();
      set_name_("yes");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_yes7_interface_ o_ = ($_yes7_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 18, "yes");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_yes7 ooo = ($_yes7) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_yes7 ooo = ($_yes7) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 18, "yes");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_no8 extends DisCo_type_ implements $_no8_interface_ {
    public int get_id_of_type_() {
      return 19;
    }

    public $_no8(Value_description_ d_) {
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
    public $_no8() {
      super();
      set_name_("no");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_no8_interface_ o_ = ($_no8_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 19, "no");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_no8 ooo = ($_no8) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_no8 ooo = ($_no8) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 19, "no");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }




  int $_owner25;
  public DisCo_int_ get_$_owner25_() {
    return new DisCo_int_($_owner25);
  }
  public void set_$_owner25_(int val_) {
    $_owner25 = val_;
  }




  DisCo_type_ $_created26;
  public DisCo_type_ get_$_created26_() {
    return $_created26;
  }
  public void set_$_created26_(DisCo_type_ val_) {
    $_created26 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Bookstore";
    Field_description_ owner_field_ = new Field_description_();
    owner_field_.name = "owner";
    Type_description_ owner_type_ = new Type_description_(Type_description_.REFERENCE,15, "_exercise_reference_to_Shopkeeper__GenName3", "Shopkeeper");
    owner_field_.value.referenceval = $_owner25;
    owner_field_.type = owner_type_;
    d_.fields.addElement(owner_field_);

    Field_description_ created_field_ = new Field_description_();
    created_field_.name = "created";
    Type_description_ created_type_ = new Type_description_(Type_description_.ENUMERATION, 17);
    created_type_.enumerationTypes.addElement($_Bookstore4.$_yes7.get_description_());
    created_type_.enumerationTypes.addElement($_Bookstore4.$_no8.get_description_());
    created_field_.value.record_type_ = $_created26.get_attributes_();
    get_$_created26_().fields_to_value_description_(created_field_.value);
    created_field_.type = created_type_;
    d_.fields.addElement(created_field_);

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

    Field_description_ created_field_ = new Field_description_();
    created_field_.name = "created";
    Type_description_ created_type_ = new Type_description_(Type_description_.ENUMERATION, 17);
    created_type_.enumerationTypes.addElement($_Bookstore4.$_yes7.get_description_());
    created_type_.enumerationTypes.addElement($_Bookstore4.$_no8.get_description_());
    created_field_.value = $_Bookstore4.$_yes7.get_default_value_description_();
    created_field_.type = created_type_;
    d_.fields.addElement(created_field_);

    return d_;
  }
}


class $_Basket1 extends DisCo_class_ implements $_Basket1_interface_ {
  public $_Basket1() {
    super();
  }

  public $_Basket1(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_book_127 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_book_228 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
    $_book_329 = ((Value_description_)d_.fields.elementAt(2)).referenceval;
    $_next_empty30 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(3));
  }

  public int $_Basket1_id_;
  public String get_class_name_() {
    return "Basket";
  }

  public String toString() {
    return get_name_() + "(" + "book_1 = " + get_$_book_127_().toString() + " ;" + "book_2 = " + get_$_book_228_().toString() + " ;" + "book_3 = " + get_$_book_329_().toString() + " ;" + "next_empty = " + get_$_next_empty30_().toString() + " ;" + ")";
  }






  static class $_first9 extends DisCo_type_ implements $_first9_interface_ {
    public int get_id_of_type_() {
      return 28;
    }

    public $_first9(Value_description_ d_) {
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
    public $_first9() {
      super();
      set_name_("first");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_first9_interface_ o_ = ($_first9_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 28, "first");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_first9 ooo = ($_first9) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_first9 ooo = ($_first9) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 28, "first");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_second10 extends DisCo_type_ implements $_second10_interface_ {
    public int get_id_of_type_() {
      return 29;
    }

    public $_second10(Value_description_ d_) {
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
    public $_second10() {
      super();
      set_name_("second");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_second10_interface_ o_ = ($_second10_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 29, "second");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_second10 ooo = ($_second10) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_second10 ooo = ($_second10) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 29, "second");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_third11 extends DisCo_type_ implements $_third11_interface_ {
    public int get_id_of_type_() {
      return 30;
    }

    public $_third11(Value_description_ d_) {
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
    public $_third11() {
      super();
      set_name_("third");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_third11_interface_ o_ = ($_third11_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 30, "third");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_third11 ooo = ($_third11) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_third11 ooo = ($_third11) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 30, "third");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_full12 extends DisCo_type_ implements $_full12_interface_ {
    public int get_id_of_type_() {
      return 31;
    }

    public $_full12(Value_description_ d_) {
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
    public $_full12() {
      super();
      set_name_("full");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_full12_interface_ o_ = ($_full12_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 31, "full");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_full12 ooo = ($_full12) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_full12 ooo = ($_full12) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 31, "full");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }




  int $_book_127;
  public DisCo_int_ get_$_book_127_() {
    return new DisCo_int_($_book_127);
  }
  public void set_$_book_127_(int val_) {
    $_book_127 = val_;
  }


  int $_book_228;
  public DisCo_int_ get_$_book_228_() {
    return new DisCo_int_($_book_228);
  }
  public void set_$_book_228_(int val_) {
    $_book_228 = val_;
  }


  int $_book_329;
  public DisCo_int_ get_$_book_329_() {
    return new DisCo_int_($_book_329);
  }
  public void set_$_book_329_(int val_) {
    $_book_329 = val_;
  }






  DisCo_type_ $_next_empty30;
  public DisCo_type_ get_$_next_empty30_() {
    return $_next_empty30;
  }
  public void set_$_next_empty30_(DisCo_type_ val_) {
    $_next_empty30 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Basket";
    Field_description_ book_1_field_ = new Field_description_();
    book_1_field_.name = "book_1";
    Type_description_ book_1_type_ = new Type_description_(Type_description_.REFERENCE,21, "_exercise_reference_to_Book__GenName5", "Book");
    book_1_field_.value.referenceval = $_book_127;
    book_1_field_.type = book_1_type_;
    d_.fields.addElement(book_1_field_);

    Field_description_ book_2_field_ = new Field_description_();
    book_2_field_.name = "book_2";
    Type_description_ book_2_type_ = new Type_description_(Type_description_.REFERENCE,23, "_exercise_reference_to_Book__GenName6", "Book");
    book_2_field_.value.referenceval = $_book_228;
    book_2_field_.type = book_2_type_;
    d_.fields.addElement(book_2_field_);

    Field_description_ book_3_field_ = new Field_description_();
    book_3_field_.name = "book_3";
    Type_description_ book_3_type_ = new Type_description_(Type_description_.REFERENCE,25, "_exercise_reference_to_Book__GenName7", "Book");
    book_3_field_.value.referenceval = $_book_329;
    book_3_field_.type = book_3_type_;
    d_.fields.addElement(book_3_field_);

    Field_description_ next_empty_field_ = new Field_description_();
    next_empty_field_.name = "next_empty";
    Type_description_ next_empty_type_ = new Type_description_(Type_description_.ENUMERATION, 27);
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_first9.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_second10.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_third11.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_full12.get_description_());
    next_empty_field_.value.record_type_ = $_next_empty30.get_attributes_();
    get_$_next_empty30_().fields_to_value_description_(next_empty_field_.value);
    next_empty_field_.type = next_empty_type_;
    d_.fields.addElement(next_empty_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Basket";
    Field_description_ book_1_field_ = new Field_description_();
    book_1_field_.name = "book_1";
    Type_description_ book_1_type_ = new Type_description_(Type_description_.REFERENCE,21, "_exercise_reference_to_Book__GenName5", "Book");
    book_1_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    book_1_field_.type = book_1_type_;
    d_.fields.addElement(book_1_field_);

    Field_description_ book_2_field_ = new Field_description_();
    book_2_field_.name = "book_2";
    Type_description_ book_2_type_ = new Type_description_(Type_description_.REFERENCE,23, "_exercise_reference_to_Book__GenName6", "Book");
    book_2_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    book_2_field_.type = book_2_type_;
    d_.fields.addElement(book_2_field_);

    Field_description_ book_3_field_ = new Field_description_();
    book_3_field_.name = "book_3";
    Type_description_ book_3_type_ = new Type_description_(Type_description_.REFERENCE,25, "_exercise_reference_to_Book__GenName7", "Book");
    book_3_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    book_3_field_.type = book_3_type_;
    d_.fields.addElement(book_3_field_);

    Field_description_ next_empty_field_ = new Field_description_();
    next_empty_field_.name = "next_empty";
    Type_description_ next_empty_type_ = new Type_description_(Type_description_.ENUMERATION, 27);
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_first9.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_second10.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_third11.get_description_());
    next_empty_type_.enumerationTypes.addElement($_Basket1.$_full12.get_description_());
    next_empty_field_.value = $_Basket1.$_first9.get_default_value_description_();
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
    $_owned_bookstore31 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_owned_customer32 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
    $_in_basket33 = ((Value_description_)d_.fields.elementAt(2)).referenceval;
    $_name34 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(3));
  }

  public int $_Book0_id_;
  public String get_class_name_() {
    return "Book";
  }

  public String toString() {
    return get_name_() + "(" + "owned_bookstore = " + get_$_owned_bookstore31_().toString() + " ;" + "owned_customer = " + get_$_owned_customer32_().toString() + " ;" + "in_basket = " + get_$_in_basket33_().toString() + " ;" + "name = " + get_$_name34_().toString() + " ;" + ")";
  }






  static class $_OfficerWithAGoal13 extends DisCo_type_ implements $_OfficerWithAGoal13_interface_ {
    public int get_id_of_type_() {
      return 40;
    }

    public $_OfficerWithAGoal13(Value_description_ d_) {
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
    public $_OfficerWithAGoal13() {
      super();
      set_name_("OfficerWithAGoal");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_OfficerWithAGoal13_interface_ o_ = ($_OfficerWithAGoal13_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 40, "OfficerWithAGoal");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_OfficerWithAGoal13 ooo = ($_OfficerWithAGoal13) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_OfficerWithAGoal13 ooo = ($_OfficerWithAGoal13) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 40, "OfficerWithAGoal");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_EnemyWithVigor14 extends DisCo_type_ implements $_EnemyWithVigor14_interface_ {
    public int get_id_of_type_() {
      return 41;
    }

    public $_EnemyWithVigor14(Value_description_ d_) {
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
    public $_EnemyWithVigor14() {
      super();
      set_name_("EnemyWithVigor");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_EnemyWithVigor14_interface_ o_ = ($_EnemyWithVigor14_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 41, "EnemyWithVigor");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_EnemyWithVigor14 ooo = ($_EnemyWithVigor14) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_EnemyWithVigor14 ooo = ($_EnemyWithVigor14) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 41, "EnemyWithVigor");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_GirlsOfThePrison15 extends DisCo_type_ implements $_GirlsOfThePrison15_interface_ {
    public int get_id_of_type_() {
      return 42;
    }

    public $_GirlsOfThePrison15(Value_description_ d_) {
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
    public $_GirlsOfThePrison15() {
      super();
      set_name_("GirlsOfThePrison");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_GirlsOfThePrison15_interface_ o_ = ($_GirlsOfThePrison15_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 42, "GirlsOfThePrison");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_GirlsOfThePrison15 ooo = ($_GirlsOfThePrison15) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_GirlsOfThePrison15 ooo = ($_GirlsOfThePrison15) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 42, "GirlsOfThePrison");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_GuardiansOfHell16 extends DisCo_type_ implements $_GuardiansOfHell16_interface_ {
    public int get_id_of_type_() {
      return 43;
    }

    public $_GuardiansOfHell16(Value_description_ d_) {
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
    public $_GuardiansOfHell16() {
      super();
      set_name_("GuardiansOfHell");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_GuardiansOfHell16_interface_ o_ = ($_GuardiansOfHell16_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 43, "GuardiansOfHell");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_GuardiansOfHell16 ooo = ($_GuardiansOfHell16) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_GuardiansOfHell16 ooo = ($_GuardiansOfHell16) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 43, "GuardiansOfHell");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_AliensAndBandits17 extends DisCo_type_ implements $_AliensAndBandits17_interface_ {
    public int get_id_of_type_() {
      return 44;
    }

    public $_AliensAndBandits17(Value_description_ d_) {
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
    public $_AliensAndBandits17() {
      super();
      set_name_("AliensAndBandits");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_AliensAndBandits17_interface_ o_ = ($_AliensAndBandits17_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 44, "AliensAndBandits");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_AliensAndBandits17 ooo = ($_AliensAndBandits17) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_AliensAndBandits17 ooo = ($_AliensAndBandits17) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 44, "AliensAndBandits");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_AchievementOfDespair18 extends DisCo_type_ implements $_AchievementOfDespair18_interface_ {
    public int get_id_of_type_() {
      return 45;
    }

    public $_AchievementOfDespair18(Value_description_ d_) {
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
    public $_AchievementOfDespair18() {
      super();
      set_name_("AchievementOfDespair");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_AchievementOfDespair18_interface_ o_ = ($_AchievementOfDespair18_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 45, "AchievementOfDespair");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_AchievementOfDespair18 ooo = ($_AchievementOfDespair18) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_AchievementOfDespair18 ooo = ($_AchievementOfDespair18) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 45, "AchievementOfDespair");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_BorderWithHonor19 extends DisCo_type_ implements $_BorderWithHonor19_interface_ {
    public int get_id_of_type_() {
      return 46;
    }

    public $_BorderWithHonor19(Value_description_ d_) {
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
    public $_BorderWithHonor19() {
      super();
      set_name_("BorderWithHonor");
      try {
      } catch(Undef_expression_exception_ uee){
      set_undef_();
      }
    }

    public Object clone() {
      try {
        $_BorderWithHonor19_interface_ o_ = ($_BorderWithHonor19_interface_)super.clone();
        return o_;
      } catch (CloneNotSupportedException e) {
        return new Assertion(false, "internal error 2");
      }
    }

    public String toString() {
      return get_name_() + "(" + ")";
    }

    public Type_description_ get_attributes_() {
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 46, "BorderWithHonor");
      return d_;
    }
    public int compareTo(Object o){
      int compareTo_val_ = get_id_of_type_() -  ((DisCo_type_)o).get_id_of_type_();
      if(compareTo_val_ != 0) {
      return compareTo_val_;
      }
      $_BorderWithHonor19 ooo = ($_BorderWithHonor19) o;
      try {
        if(false) throw new Undef_expression_exception_(); // do not remove
      } catch(Undef_expression_exception_ uee) {
        new Assertion(false, "Undefined value in compareTo");
      }
      return 0;
    }

        public DisCo_bool_ op_eq_(Object o) {
        $_BorderWithHonor19 ooo = ($_BorderWithHonor19) o;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 46, "BorderWithHonor");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }




  int $_owned_bookstore31;
  public DisCo_int_ get_$_owned_bookstore31_() {
    return new DisCo_int_($_owned_bookstore31);
  }
  public void set_$_owned_bookstore31_(int val_) {
    $_owned_bookstore31 = val_;
  }


  int $_owned_customer32;
  public DisCo_int_ get_$_owned_customer32_() {
    return new DisCo_int_($_owned_customer32);
  }
  public void set_$_owned_customer32_(int val_) {
    $_owned_customer32 = val_;
  }


  int $_in_basket33;
  public DisCo_int_ get_$_in_basket33_() {
    return new DisCo_int_($_in_basket33);
  }
  public void set_$_in_basket33_(int val_) {
    $_in_basket33 = val_;
  }









  DisCo_type_ $_name34;
  public DisCo_type_ get_$_name34_() {
    return $_name34;
  }
  public void set_$_name34_(DisCo_type_ val_) {
    $_name34 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Book";
    Field_description_ owned_bookstore_field_ = new Field_description_();
    owned_bookstore_field_.name = "owned_bookstore";
    Type_description_ owned_bookstore_type_ = new Type_description_(Type_description_.REFERENCE,33, "_exercise_reference_to_Bookstore__GenName9", "Bookstore");
    owned_bookstore_field_.value.referenceval = $_owned_bookstore31;
    owned_bookstore_field_.type = owned_bookstore_type_;
    d_.fields.addElement(owned_bookstore_field_);

    Field_description_ owned_customer_field_ = new Field_description_();
    owned_customer_field_.name = "owned_customer";
    Type_description_ owned_customer_type_ = new Type_description_(Type_description_.REFERENCE,35, "_exercise_reference_to_Customer__GenName10", "Customer");
    owned_customer_field_.value.referenceval = $_owned_customer32;
    owned_customer_field_.type = owned_customer_type_;
    d_.fields.addElement(owned_customer_field_);

    Field_description_ in_basket_field_ = new Field_description_();
    in_basket_field_.name = "in_basket";
    Type_description_ in_basket_type_ = new Type_description_(Type_description_.REFERENCE,37, "_exercise_reference_to_Basket__GenName11", "Basket");
    in_basket_field_.value.referenceval = $_in_basket33;
    in_basket_field_.type = in_basket_type_;
    d_.fields.addElement(in_basket_field_);

    Field_description_ name_field_ = new Field_description_();
    name_field_.name = "name";
    Type_description_ name_type_ = new Type_description_(Type_description_.ENUMERATION, 39);
    name_type_.enumerationTypes.addElement($_Book0.$_OfficerWithAGoal13.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_EnemyWithVigor14.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GirlsOfThePrison15.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GuardiansOfHell16.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AliensAndBandits17.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AchievementOfDespair18.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_BorderWithHonor19.get_description_());
    name_field_.value.record_type_ = $_name34.get_attributes_();
    get_$_name34_().fields_to_value_description_(name_field_.value);
    name_field_.type = name_type_;
    d_.fields.addElement(name_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Book";
    Field_description_ owned_bookstore_field_ = new Field_description_();
    owned_bookstore_field_.name = "owned_bookstore";
    Type_description_ owned_bookstore_type_ = new Type_description_(Type_description_.REFERENCE,33, "_exercise_reference_to_Bookstore__GenName9", "Bookstore");
    owned_bookstore_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    owned_bookstore_field_.type = owned_bookstore_type_;
    d_.fields.addElement(owned_bookstore_field_);

    Field_description_ owned_customer_field_ = new Field_description_();
    owned_customer_field_.name = "owned_customer";
    Type_description_ owned_customer_type_ = new Type_description_(Type_description_.REFERENCE,35, "_exercise_reference_to_Customer__GenName10", "Customer");
    owned_customer_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    owned_customer_field_.type = owned_customer_type_;
    d_.fields.addElement(owned_customer_field_);

    Field_description_ in_basket_field_ = new Field_description_();
    in_basket_field_.name = "in_basket";
    Type_description_ in_basket_type_ = new Type_description_(Type_description_.REFERENCE,37, "_exercise_reference_to_Basket__GenName11", "Basket");
    in_basket_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    in_basket_field_.type = in_basket_type_;
    d_.fields.addElement(in_basket_field_);

    Field_description_ name_field_ = new Field_description_();
    name_field_.name = "name";
    Type_description_ name_type_ = new Type_description_(Type_description_.ENUMERATION, 39);
    name_type_.enumerationTypes.addElement($_Book0.$_OfficerWithAGoal13.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_EnemyWithVigor14.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GirlsOfThePrison15.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_GuardiansOfHell16.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AliensAndBandits17.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_AchievementOfDespair18.get_description_());
    name_type_.enumerationTypes.addElement($_Book0.$_BorderWithHonor19.get_description_());
    name_field_.value = $_Book0.$_OfficerWithAGoal13.get_default_value_description_();
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
    $_browsing_currently35 = ((Value_description_)d_.fields.elementAt(0)).referenceval;
    $_owns_basket36 = ((Value_description_)d_.fields.elementAt(1)).referenceval;
  }

  public int $_Customer2_id_;
  public String get_class_name_() {
    return "Customer";
  }

  public String toString() {
    return get_name_() + "(" + "browsing_currently = " + get_$_browsing_currently35_().toString() + " ;" + "owns_basket = " + get_$_owns_basket36_().toString() + " ;" + ")";
  }





  int $_browsing_currently35;
  public DisCo_int_ get_$_browsing_currently35_() {
    return new DisCo_int_($_browsing_currently35);
  }
  public void set_$_browsing_currently35_(int val_) {
    $_browsing_currently35 = val_;
  }


  int $_owns_basket36;
  public DisCo_int_ get_$_owns_basket36_() {
    return new DisCo_int_($_owns_basket36);
  }
  public void set_$_owns_basket36_(int val_) {
    $_owns_basket36 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Customer";
    Field_description_ browsing_currently_field_ = new Field_description_();
    browsing_currently_field_.name = "browsing_currently";
    Type_description_ browsing_currently_type_ = new Type_description_(Type_description_.REFERENCE,48, "_exercise_reference_to_Book__GenName13", "Book");
    browsing_currently_field_.value.referenceval = $_browsing_currently35;
    browsing_currently_field_.type = browsing_currently_type_;
    d_.fields.addElement(browsing_currently_field_);

    Field_description_ owns_basket_field_ = new Field_description_();
    owns_basket_field_.name = "owns_basket";
    Type_description_ owns_basket_type_ = new Type_description_(Type_description_.REFERENCE,50, "_exercise_reference_to_Basket__GenName14", "Basket");
    owns_basket_field_.value.referenceval = $_owns_basket36;
    owns_basket_field_.type = owns_basket_type_;
    d_.fields.addElement(owns_basket_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Customer";
    Field_description_ browsing_currently_field_ = new Field_description_();
    browsing_currently_field_.name = "browsing_currently";
    Type_description_ browsing_currently_type_ = new Type_description_(Type_description_.REFERENCE,48, "_exercise_reference_to_Book__GenName13", "Book");
    browsing_currently_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    browsing_currently_field_.type = browsing_currently_type_;
    d_.fields.addElement(browsing_currently_field_);

    Field_description_ owns_basket_field_ = new Field_description_();
    owns_basket_field_.name = "owns_basket";
    Type_description_ owns_basket_type_ = new Type_description_(Type_description_.REFERENCE,50, "_exercise_reference_to_Basket__GenName14", "Basket");
    owns_basket_field_.value.referenceval = (new DisCo_int_(-1)).get_val_();
    owns_basket_field_.type = owns_basket_type_;
    d_.fields.addElement(owns_basket_field_);

    return d_;
  }
}


class $_Shopkeeper5 extends DisCo_class_ implements $_Shopkeeper5_interface_ {
  public $_Shopkeeper5() {
    super();
  }

  public $_Shopkeeper5(Object_description_ d_) {
    super();
    modify_object_(d_);
  }

  public void modify_object_(Object_description_ d_) {
    set_name_(d_.object_name);
    $_registed37 = exercise.instantiate_record_value_((Value_description_)d_.fields.elementAt(0));
  }

  public int $_Shopkeeper5_id_;
  public String get_class_name_() {
    return "Shopkeeper";
  }

  public String toString() {
    return get_name_() + "(" + "registed = " + get_$_registed37_().toString() + " ;" + ")";
  }
  static class $_no20 extends DisCo_type_ implements $_no20_interface_ {
    public int get_id_of_type_() {
      return 54;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 54, "no");
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 54, "no");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }

  static class $_yes21 extends DisCo_type_ implements $_yes21_interface_ {
    public int get_id_of_type_() {
      return 55;
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 55, "yes");
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
      Type_description_ d_ =  new Type_description_(Type_description_.RECORD, 55, "yes");
      return d_;
    }
    public void fields_to_value_description_(Value_description_ v_) {
    }

  }






  DisCo_type_ $_registed37;
  public DisCo_type_ get_$_registed37_() {
    return $_registed37;
  }
  public void set_$_registed37_(DisCo_type_ val_) {
    $_registed37 = val_;
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Shopkeeper";
    Field_description_ registed_field_ = new Field_description_();
    registed_field_.name = "registed";
    Type_description_ registed_type_ = new Type_description_(Type_description_.ENUMERATION, 53);
    registed_type_.enumerationTypes.addElement($_Shopkeeper5.$_no20.get_description_());
    registed_type_.enumerationTypes.addElement($_Shopkeeper5.$_yes21.get_description_());
    registed_field_.value.record_type_ = $_registed37.get_attributes_();
    get_$_registed37_().fields_to_value_description_(registed_field_.value);
    registed_field_.type = registed_type_;
    d_.fields.addElement(registed_field_);

    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Shopkeeper";
    Field_description_ registed_field_ = new Field_description_();
    registed_field_.name = "registed";
    Type_description_ registed_type_ = new Type_description_(Type_description_.ENUMERATION, 53);
    registed_type_.enumerationTypes.addElement($_Shopkeeper5.$_no20.get_description_());
    registed_type_.enumerationTypes.addElement($_Shopkeeper5.$_yes21.get_description_());
    registed_field_.value = $_Shopkeeper5.$_no20.get_default_value_description_();
    registed_field_.type = registed_type_;
    d_.fields.addElement(registed_field_);

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
  }

  public int $_Admin6_id_;
  public String get_class_name_() {
    return "Admin";
  }

  public String toString() {
    return get_name_() + "(" + ")";
  }

  public Class_description_ get_attributes_() {
    Class_description_ d_ = new Class_description_();
    d_.name = "Admin";
    return d_;
  }
  public static Class_description_ get_description_() {
    Class_description_ d_ =  new Class_description_();
    d_.name = "Admin";
    return d_;
  }
}

class $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$ extends DisCo_action_ {
  Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_0;
  $_full12_interface_ rhs_1;
  DisCo_int_ rhs_2;
  $_third11_interface_ rhs_3;
  DisCo_int_ rhs_4;
  $_second10_interface_ rhs_5;
  DisCo_int_ rhs_6;
  boolean treeCondition_0;
  boolean treeCondition_1;
  boolean treeCondition_2;
  public $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ selected_combination_ = new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "insert_book_to_basket";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Book0_interface_ $_book38 = selected_combination_.$_book38;
    $_Basket1_interface_ $_basket39 = selected_combination_.$_basket39;
    $_Customer2_interface_ $_customer40 = selected_combination_.$_customer40;
    $_System3_interface_ $_system41 = selected_combination_.$_system41;
    Parameter_real_ $_now42 = selected_combination_.$_now42;
    return ((((($_book38.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).op_and_(($_book38.get_$_owned_customer32_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system41.get_$_active_customer22_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer40).objectID_)))))).op_and_(($_customer40.get_$_browsing_currently35_().op_eq_((new DisCo_int_(((DisCo_class_)$_book38).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book38) {
    return ($_book38.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book38) {
    return ($_book38.get_$_owned_customer32_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Customer2_interface_ $_customer40, $_System3_interface_ $_system41) {
    return ($_system41.get_$_active_customer22_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer40).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Book0_interface_ $_book38, $_Customer2_interface_ $_customer40) {
    return ($_customer40.get_$_browsing_currently35_().op_eq_((new DisCo_int_(((DisCo_class_)$_book38).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ combs_ = new Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_(my_specification_);
    Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ partial_result_ = new Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book38();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book38 = $$$_one_combination_$$$.$_book38;
      if (partial_guard_1_($_book38)) {
        partial_result_.add_combination_(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, null, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book38();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book38 = $$$_one_combination_$$$.$_book38;
      if (partial_guard_2_($_book38)) {
        partial_result_.add_combination_(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, null, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_customer40();
    combs_.generate_explicit_combinations_$_system41();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_customer40 = $$$_one_combination_$$$.$_customer40;
      $_System3_interface_ $_system41 = $$$_one_combination_$$$.$_system41;
      if (partial_guard_3_($_customer40, $_system41)) {
        partial_result_.add_combination_(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(null, null, $_customer40, $_system41, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book38();
    combs_.generate_explicit_combinations_$_customer40();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book38 = $$$_one_combination_$$$.$_book38;
      $_Customer2_interface_ $_customer40 = $$$_one_combination_$$$.$_customer40;
      if (partial_guard_4_($_book38, $_customer40)) {
        partial_result_.add_combination_(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, null, $_customer40, null, my_specification_));
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
  public void initialize_execute($_Book0_interface_ $_book38, $_Basket1_interface_ $_basket39, $_Customer2_interface_ $_customer40, $_System3_interface_ $_system41, Parameter_real_ $_now42) throws Assertion_exception_ {
    treeCondition_0 = false;
    if(new DisCo_bool_($_basket39.get_$_next_empty30_() instanceof $_Basket1.$_third11).get_val_()){
      treeCondition_0 = true;
      rhs_0 = (new DisCo_int_(((DisCo_class_)$_book38).objectID_));
      rhs_1 = new $_Basket1.$_full12();
    }
    treeCondition_1 = false;
    if(new DisCo_bool_($_basket39.get_$_next_empty30_() instanceof $_Basket1.$_second10).get_val_()){
      treeCondition_1 = true;
      rhs_2 = (new DisCo_int_(((DisCo_class_)$_book38).objectID_));
      rhs_3 = new $_Basket1.$_third11();
    }
    treeCondition_2 = false;
    if(new DisCo_bool_($_basket39.get_$_next_empty30_() instanceof $_Basket1.$_first9).get_val_()){
      treeCondition_2 = true;
      rhs_4 = (new DisCo_int_(((DisCo_class_)$_book38).objectID_));
      rhs_5 = new $_Basket1.$_second10();
    }
    rhs_6 = (new DisCo_int_(((DisCo_class_)$_basket39).objectID_));
  }

  public void actual_execute($_Book0_interface_ $_book38, $_Basket1_interface_ $_basket39, $_Customer2_interface_ $_customer40, $_System3_interface_ $_system41, Parameter_real_ $_now42) throws Assertion_exception_ {
    try {
      if(treeCondition_0){
        $_basket39.set_$_book_329_(rhs_0.get_val_());
        Iterator iEL7 = my_specification_.getEngineListeners_();
        while(iEL7.hasNext()) {
          ((EngineListener)(iEL7.next())).objectStateChanged((DisCo_class_)$_basket39);
        }
        $_basket39.set_$_next_empty30_((DisCo_type_) rhs_1);
        Iterator iEL8 = my_specification_.getEngineListeners_();
        while(iEL8.hasNext()) {
          ((EngineListener)(iEL8.next())).objectStateChanged((DisCo_class_)$_basket39);
        }
      }
      if(treeCondition_1){
        $_basket39.set_$_book_228_(rhs_2.get_val_());
        Iterator iEL9 = my_specification_.getEngineListeners_();
        while(iEL9.hasNext()) {
          ((EngineListener)(iEL9.next())).objectStateChanged((DisCo_class_)$_basket39);
        }
        $_basket39.set_$_next_empty30_((DisCo_type_) rhs_3);
        Iterator iEL10 = my_specification_.getEngineListeners_();
        while(iEL10.hasNext()) {
          ((EngineListener)(iEL10.next())).objectStateChanged((DisCo_class_)$_basket39);
        }
      }
      if(treeCondition_2){
        $_basket39.set_$_book_127_(rhs_4.get_val_());
        Iterator iEL11 = my_specification_.getEngineListeners_();
        while(iEL11.hasNext()) {
          ((EngineListener)(iEL11.next())).objectStateChanged((DisCo_class_)$_basket39);
        }
        $_basket39.set_$_next_empty30_((DisCo_type_) rhs_5);
        Iterator iEL12 = my_specification_.getEngineListeners_();
        while(iEL12.hasNext()) {
          ((EngineListener)(iEL12.next())).objectStateChanged((DisCo_class_)$_basket39);
        }
      }
      $_book38.set_$_in_basket33_(rhs_6.get_val_());
      Iterator iEL13 = my_specification_.getEngineListeners_();
      while(iEL13.hasNext()) {
        ((EngineListener)(iEL13.next())).objectStateChanged((DisCo_class_)$_book38);
      }
      my_specification_.rt_.set_omega_($_now42.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Book0_interface_ $_book38, $_Basket1_interface_ $_basket39, $_Customer2_interface_ $_customer40, $_System3_interface_ $_system41, Parameter_real_ $_now42) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_book38, $_basket39, $_customer40, $_system41, $_now42);
    actual_execute($_book38, $_basket39, $_customer40, $_system41, $_now42);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action insert_book_to_basket(Book, Basket, Customer, System)");
    eval_guard_();
    selected_combination_ = new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("basket", "Basket"));
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
      vd_ = new Value_description_(selected_combination_.$_now42.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now42.realval = value.realval;
      selected_combination_.$_now42.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action insert_book_to_basket(Book, Basket, Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now42 = new Parameter_real_();
      selected_combination_.$_now42.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action insert_book_to_basket(Book, Basket, Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for insert_book_to_basket(Book, Basket, Customer, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_book38 != null, "Participant $_book38 == null");
    new Assertion(selected_combination_.$_basket39 != null, "Participant $_basket39 == null");
    new Assertion(selected_combination_.$_customer40 != null, "Participant $_customer40 == null");
    new Assertion(selected_combination_.$_system41 != null, "Participant $_system41 == null");
    $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action insert_book_to_basket(Book, Basket, Customer, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_book38, selected_combination_.$_basket39, selected_combination_.$_customer40, selected_combination_.$_system41, selected_combination_.$_now42);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_book38 = ($_Book0_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_basket39 = ($_Basket1_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_customer40 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_system41 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_book38;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_basket39;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_customer40;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_system41;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ comb_ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now42.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action insert_book_to_basket(Book, Basket, Customer, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_book38() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book38 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book38() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_basket39() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_basket39 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_basket39() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_customer40() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer40 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer40() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system41() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system41 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system41() );
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
      tmp_combinations.addAll((($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book38());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_basket39());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer40());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system41());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if(comb.$_book38 != null && (($_Book0) (comb.$_book38)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book38)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_basket39 != null && (($_Basket1) (comb.$_basket39)).objectID_ != (($_Basket1) ($$$_ccc_$$$.$_basket39)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_customer40 != null && (($_Customer2) (comb.$_customer40)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer40)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system41 != null && (($_System3) (comb.$_system41)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system41)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ pick_actual_parameters_($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ comb = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) (iter.next());
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
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_  comb_to_add_ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ comb_to_add_ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ combine(Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ other_) {
    Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_ result = new Combinations_$_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ mycomb = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ otherscomb = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) otherselems.next();
        $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ c = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Book0_interface_ $_book38 = null;
  $_Basket1_interface_ $_basket39 = null;
  $_Customer2_interface_ $_customer40 = null;
  $_System3_interface_ $_system41 = null;
  Parameter_real_ $_now42 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_Book0_interface_ $_book38, $_Basket1_interface_ $_basket39, $_Customer2_interface_ $_customer40, $_System3_interface_ $_system41, DisCo_specification_ my_specification) {
    this.$_book38 = $_book38;
    this.$_basket39 = $_basket39;
    this.$_customer40 = $_customer40;
    this.$_system41 = $_system41;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now42);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ $$$_other_$$$ = ($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_book38 = ((DisCo_class_) $$$_other_$$$.$_book38);
    DisCo_class_ $$_other_$_basket39 = ((DisCo_class_) $$$_other_$$$.$_basket39);
    DisCo_class_ $$_other_$_customer40 = ((DisCo_class_) $$$_other_$$$.$_customer40);
    DisCo_class_ $$_other_$_system41 = ((DisCo_class_) $$$_other_$$$.$_system41);
    if($_book38 == null && $$_other_$_book38 != null){
      return -1;
    }
    if($_book38 != null && $$_other_$_book38 == null){
      return 1;
    }
    if($_book38 != null && $$_other_$_book38!= null && ((DisCo_class_) $_book38).objectID_ != $$_other_$_book38.objectID_){
      return ((DisCo_class_) $_book38).objectID_ - $$_other_$_book38.objectID_;
    }
    if($_basket39 == null && $$_other_$_basket39 != null){
      return -1;
    }
    if($_basket39 != null && $$_other_$_basket39 == null){
      return 1;
    }
    if($_basket39 != null && $$_other_$_basket39!= null && ((DisCo_class_) $_basket39).objectID_ != $$_other_$_basket39.objectID_){
      return ((DisCo_class_) $_basket39).objectID_ - $$_other_$_basket39.objectID_;
    }
    if($_customer40 == null && $$_other_$_customer40 != null){
      return -1;
    }
    if($_customer40 != null && $$_other_$_customer40 == null){
      return 1;
    }
    if($_customer40 != null && $$_other_$_customer40!= null && ((DisCo_class_) $_customer40).objectID_ != $$_other_$_customer40.objectID_){
      return ((DisCo_class_) $_customer40).objectID_ - $$_other_$_customer40.objectID_;
    }
    if($_system41 == null && $$_other_$_system41 != null){
      return -1;
    }
    if($_system41 != null && $$_other_$_system41 == null){
      return 1;
    }
    if($_system41 != null && $$_other_$_system41!= null && ((DisCo_class_) $_system41).objectID_ != $$_other_$_system41.objectID_){
      return ((DisCo_class_) $_system41).objectID_ - $$_other_$_system41.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_book38() {
    Vector ret = new Vector();
    if($_book38 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(($_Book0_interface_)iter_.nextElement(), $_basket39, $_customer40, $_system41, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_basket39() {
    Vector ret = new Vector();
    if($_basket39 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Basket1").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, ($_Basket1_interface_)iter_.nextElement(), $_customer40, $_system41, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_customer40() {
    Vector ret = new Vector();
    if($_customer40 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, $_basket39, ($_Customer2_interface_)iter_.nextElement(), $_system41, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system41() {
    Vector ret = new Vector();
    if($_system41 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, $_basket39, $_customer40, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "book=" + ($_book38 == null ? "<any>" : $_book38.toString()) + ", "
       + "basket=" + ($_basket39 == null ? "<any>" : $_basket39.toString()) + ", "
       + "customer=" + ($_customer40 == null ? "<any>" : $_customer40.toString()) + ", "
       + "system=" + ($_system41 == null ? "<any>" : $_system41.toString()) + ", "
       + "now=" + ($_now42 == null ? "<any>" : $_now42.toString()) + ", ");
  }

  public boolean equal_participants_($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ trial) {
    return $_book38 != null && $_book38 == trial.$_book38  && $_basket39 != null && $_basket39 == trial.$_basket39  && $_customer40 != null && $_customer40 == trial.$_customer40  && $_system41 != null && $_system41 == trial.$_system41 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_book38);
    result_.addElement($_basket39);
    result_.addElement($_customer40);
    result_.addElement($_system41);
    return result_;
  }

  public $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ clone_() {
    return new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_($_book38, $_basket39, $_customer40, $_system41, my_specification_);
  }

  public boolean invalid_() {
    if ($_book38 != null && $_book38 == $_basket39) return true;
    if ($_book38 != null && $_book38 == $_customer40) return true;
    if ($_book38 != null && $_book38 == $_system41) return true;
    if ($_basket39 != null && $_basket39 == $_customer40) return true;
    if ($_basket39 != null && $_basket39 == $_system41) return true;
    if ($_customer40 != null && $_customer40 == $_system41) return true;
    return invalid_;
  }

  public $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ combine($_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ other_) {
    $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_ result_ = new $_insert_book_to_basket$$$_Book0$$$_Basket1$$$_Customer2$$$_System3$$_combination_(null, null, null, null, my_specification_);
    if ($_book38 == null) {
      result_.$_book38 = other_.$_book38;
    }
    else if (other_.$_book38 == null) {
      result_.$_book38 = $_book38;
    }
    else if($_book38 == other_.$_book38) {
      result_.$_book38 = $_book38;
    }
    else return null;

    if ($_basket39 == null) {
      result_.$_basket39 = other_.$_basket39;
    }
    else if (other_.$_basket39 == null) {
      result_.$_basket39 = $_basket39;
    }
    else if($_basket39 == other_.$_basket39) {
      result_.$_basket39 = $_basket39;
    }
    else return null;

    if ($_customer40 == null) {
      result_.$_customer40 = other_.$_customer40;
    }
    else if (other_.$_customer40 == null) {
      result_.$_customer40 = $_customer40;
    }
    else if($_customer40 == other_.$_customer40) {
      result_.$_customer40 = $_customer40;
    }
    else return null;

    if ($_system41 == null) {
      result_.$_system41 = other_.$_system41;
    }
    else if (other_.$_system41 == null) {
      result_.$_system41 = $_system41;
    }
    else if($_system41 == other_.$_system41) {
      result_.$_system41 = $_system41;
    }
    else return null;

    return result_;
  }
}

class $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$ extends DisCo_action_ {
  Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ enabled_for_;

  DisCo_int_ rhs_14;
  DisCo_int_ rhs_15;
  DisCo_int_ rhs_16;
  boolean treeCondition_3;
  boolean treeCondition_4;
  boolean treeCondition_5;
  public $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ selected_combination_ = new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(my_specification_);
  public String get_name_() {
    return "customer_remove_book_from_basket";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Book0_interface_ $_book43 = selected_combination_.$_book43;
    $_Basket1_interface_ $_basket44 = selected_combination_.$_basket44;
    $_Bookstore4_interface_ $_bookstore45 = selected_combination_.$_bookstore45;
    $_Customer2_interface_ $_customer46 = selected_combination_.$_customer46;
    Parameter_real_ $_now47 = selected_combination_.$_now47;
    return ((((($_book43.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore45).objectID_)))).op_and_(($_basket44.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))))).op_or_(($_basket44.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))))).op_or_(($_basket44.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book43, $_Basket1_interface_ $_basket44, $_Bookstore4_interface_ $_bookstore45) {
    return (((($_book43.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore45).objectID_)))).op_and_(($_basket44.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))))).op_or_(($_basket44.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))))).op_or_(($_basket44.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ combs_ = new Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_(my_specification_);
    Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ partial_result_ = new Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book43();
    combs_.generate_explicit_combinations_$_basket44();
    combs_.generate_explicit_combinations_$_bookstore45();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_one_combination_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book43 = $$$_one_combination_$$$.$_book43;
      $_Basket1_interface_ $_basket44 = $$$_one_combination_$$$.$_basket44;
      $_Bookstore4_interface_ $_bookstore45 = $$$_one_combination_$$$.$_bookstore45;
      if (partial_guard_1_($_book43, $_basket44, $_bookstore45)) {
        partial_result_.add_combination_(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_($_book43, $_basket44, $_bookstore45, null, my_specification_));
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
  public void initialize_execute($_Book0_interface_ $_book43, $_Basket1_interface_ $_basket44, $_Bookstore4_interface_ $_bookstore45, $_Customer2_interface_ $_customer46, Parameter_real_ $_now47) throws Assertion_exception_ {
    treeCondition_3 = false;
    if(($_basket44.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))).get_val_()){
      treeCondition_3 = true;
      rhs_14 = (new DisCo_int_(-1));
    }
    treeCondition_4 = false;
    if(($_basket44.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))).get_val_()){
      treeCondition_4 = true;
      rhs_15 = (new DisCo_int_(-1));
    }
    treeCondition_5 = false;
    if(($_basket44.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book43).objectID_)))).get_val_()){
      treeCondition_5 = true;
      rhs_16 = (new DisCo_int_(-1));
    }
  }

  public void actual_execute($_Book0_interface_ $_book43, $_Basket1_interface_ $_basket44, $_Bookstore4_interface_ $_bookstore45, $_Customer2_interface_ $_customer46, Parameter_real_ $_now47) throws Assertion_exception_ {
    try {
      if(treeCondition_3){
        $_basket44.set_$_book_127_(rhs_14.get_val_());
        Iterator iEL17 = my_specification_.getEngineListeners_();
        while(iEL17.hasNext()) {
          ((EngineListener)(iEL17.next())).objectStateChanged((DisCo_class_)$_basket44);
        }
      }
      if(treeCondition_4){
        $_basket44.set_$_book_228_(rhs_15.get_val_());
        Iterator iEL18 = my_specification_.getEngineListeners_();
        while(iEL18.hasNext()) {
          ((EngineListener)(iEL18.next())).objectStateChanged((DisCo_class_)$_basket44);
        }
      }
      if(treeCondition_5){
        $_basket44.set_$_book_329_(rhs_16.get_val_());
        Iterator iEL19 = my_specification_.getEngineListeners_();
        while(iEL19.hasNext()) {
          ((EngineListener)(iEL19.next())).objectStateChanged((DisCo_class_)$_basket44);
        }
      }
      my_specification_.rt_.set_omega_($_now47.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Book0_interface_ $_book43, $_Basket1_interface_ $_basket44, $_Bookstore4_interface_ $_bookstore45, $_Customer2_interface_ $_customer46, Parameter_real_ $_now47) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_book43, $_basket44, $_bookstore45, $_customer46, $_now47);
    actual_execute($_book43, $_basket44, $_bookstore45, $_customer46, $_now47);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action customer_remove_book_from_basket(Book, Basket, Bookstore, Customer)");
    eval_guard_();
    selected_combination_ = new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("basket", "Basket"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now47.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now47.realval = value.realval;
      selected_combination_.$_now47.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action customer_remove_book_from_basket(Book, Basket, Bookstore, Customer)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now47 = new Parameter_real_();
      selected_combination_.$_now47.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action customer_remove_book_from_basket(Book, Basket, Bookstore, Customer)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for customer_remove_book_from_basket(Book, Basket, Bookstore, Customer) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_book43 != null, "Participant $_book43 == null");
    new Assertion(selected_combination_.$_basket44 != null, "Participant $_basket44 == null");
    new Assertion(selected_combination_.$_bookstore45 != null, "Participant $_bookstore45 == null");
    new Assertion(selected_combination_.$_customer46 != null, "Participant $_customer46 == null");
    $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action customer_remove_book_from_basket(Book, Basket, Bookstore, Customer) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_book43, selected_combination_.$_basket44, selected_combination_.$_bookstore45, selected_combination_.$_customer46, selected_combination_.$_now47);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_book43 = ($_Book0_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_basket44 = ($_Basket1_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore45 = ($_Bookstore4_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_customer46 = ($_Customer2_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_book43;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_basket44;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore45;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_customer46;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ comb_ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if (!comb_.$_now47.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action customer_remove_book_from_basket(Book, Basket, Bookstore, Customer)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_book43() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book43 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book43() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_basket44() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_basket44 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_basket44() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore45() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore45 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore45() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_customer46() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer46 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer46() );
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
      tmp_combinations.addAll((($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book43());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_basket44());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore45());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer46());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if(comb.$_book43 != null && (($_Book0) (comb.$_book43)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book43)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_basket44 != null && (($_Basket1) (comb.$_basket44)).objectID_ != (($_Basket1) ($$$_ccc_$$$.$_basket44)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore45 != null && (($_Bookstore4) (comb.$_bookstore45)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore45)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_customer46 != null && (($_Customer2) (comb.$_customer46)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer46)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next()).debug_();
    }
  }

  public $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ pick_actual_parameters_($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ comb = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) (iter.next());
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
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_  comb_to_add_ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ comb_to_add_ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ combine(Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ other_) {
    Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_ result = new Combinations_$_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ mycomb = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ otherscomb = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) otherselems.next();
        $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ c = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Book0_interface_ $_book43 = null;
  $_Basket1_interface_ $_basket44 = null;
  $_Bookstore4_interface_ $_bookstore45 = null;
  $_Customer2_interface_ $_customer46 = null;
  Parameter_real_ $_now47 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_($_Book0_interface_ $_book43, $_Basket1_interface_ $_basket44, $_Bookstore4_interface_ $_bookstore45, $_Customer2_interface_ $_customer46, DisCo_specification_ my_specification) {
    this.$_book43 = $_book43;
    this.$_basket44 = $_basket44;
    this.$_bookstore45 = $_bookstore45;
    this.$_customer46 = $_customer46;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now47);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ $$$_other_$$$ = ($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_)o;
    DisCo_class_ $$_other_$_book43 = ((DisCo_class_) $$$_other_$$$.$_book43);
    DisCo_class_ $$_other_$_basket44 = ((DisCo_class_) $$$_other_$$$.$_basket44);
    DisCo_class_ $$_other_$_bookstore45 = ((DisCo_class_) $$$_other_$$$.$_bookstore45);
    DisCo_class_ $$_other_$_customer46 = ((DisCo_class_) $$$_other_$$$.$_customer46);
    if($_book43 == null && $$_other_$_book43 != null){
      return -1;
    }
    if($_book43 != null && $$_other_$_book43 == null){
      return 1;
    }
    if($_book43 != null && $$_other_$_book43!= null && ((DisCo_class_) $_book43).objectID_ != $$_other_$_book43.objectID_){
      return ((DisCo_class_) $_book43).objectID_ - $$_other_$_book43.objectID_;
    }
    if($_basket44 == null && $$_other_$_basket44 != null){
      return -1;
    }
    if($_basket44 != null && $$_other_$_basket44 == null){
      return 1;
    }
    if($_basket44 != null && $$_other_$_basket44!= null && ((DisCo_class_) $_basket44).objectID_ != $$_other_$_basket44.objectID_){
      return ((DisCo_class_) $_basket44).objectID_ - $$_other_$_basket44.objectID_;
    }
    if($_bookstore45 == null && $$_other_$_bookstore45 != null){
      return -1;
    }
    if($_bookstore45 != null && $$_other_$_bookstore45 == null){
      return 1;
    }
    if($_bookstore45 != null && $$_other_$_bookstore45!= null && ((DisCo_class_) $_bookstore45).objectID_ != $$_other_$_bookstore45.objectID_){
      return ((DisCo_class_) $_bookstore45).objectID_ - $$_other_$_bookstore45.objectID_;
    }
    if($_customer46 == null && $$_other_$_customer46 != null){
      return -1;
    }
    if($_customer46 != null && $$_other_$_customer46 == null){
      return 1;
    }
    if($_customer46 != null && $$_other_$_customer46!= null && ((DisCo_class_) $_customer46).objectID_ != $$_other_$_customer46.objectID_){
      return ((DisCo_class_) $_customer46).objectID_ - $$_other_$_customer46.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_book43() {
    Vector ret = new Vector();
    if($_book43 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(($_Book0_interface_)iter_.nextElement(), $_basket44, $_bookstore45, $_customer46, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_basket44() {
    Vector ret = new Vector();
    if($_basket44 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Basket1").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_($_book43, ($_Basket1_interface_)iter_.nextElement(), $_bookstore45, $_customer46, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore45() {
    Vector ret = new Vector();
    if($_bookstore45 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_($_book43, $_basket44, ($_Bookstore4_interface_)iter_.nextElement(), $_customer46, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_customer46() {
    Vector ret = new Vector();
    if($_customer46 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_($_book43, $_basket44, $_bookstore45, ($_Customer2_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "book=" + ($_book43 == null ? "<any>" : $_book43.toString()) + ", "
       + "basket=" + ($_basket44 == null ? "<any>" : $_basket44.toString()) + ", "
       + "bookstore=" + ($_bookstore45 == null ? "<any>" : $_bookstore45.toString()) + ", "
       + "customer=" + ($_customer46 == null ? "<any>" : $_customer46.toString()) + ", "
       + "now=" + ($_now47 == null ? "<any>" : $_now47.toString()) + ", ");
  }

  public boolean equal_participants_($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ trial) {
    return $_book43 != null && $_book43 == trial.$_book43  && $_basket44 != null && $_basket44 == trial.$_basket44  && $_bookstore45 != null && $_bookstore45 == trial.$_bookstore45  && $_customer46 != null && $_customer46 == trial.$_customer46 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_book43);
    result_.addElement($_basket44);
    result_.addElement($_bookstore45);
    result_.addElement($_customer46);
    return result_;
  }

  public $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ clone_() {
    return new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_($_book43, $_basket44, $_bookstore45, $_customer46, my_specification_);
  }

  public boolean invalid_() {
    if ($_book43 != null && $_book43 == $_basket44) return true;
    if ($_book43 != null && $_book43 == $_bookstore45) return true;
    if ($_book43 != null && $_book43 == $_customer46) return true;
    if ($_basket44 != null && $_basket44 == $_bookstore45) return true;
    if ($_basket44 != null && $_basket44 == $_customer46) return true;
    if ($_bookstore45 != null && $_bookstore45 == $_customer46) return true;
    return invalid_;
  }

  public $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ combine($_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ other_) {
    $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_ result_ = new $_customer_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$$_Customer2$$_combination_(null, null, null, null, my_specification_);
    if ($_book43 == null) {
      result_.$_book43 = other_.$_book43;
    }
    else if (other_.$_book43 == null) {
      result_.$_book43 = $_book43;
    }
    else if($_book43 == other_.$_book43) {
      result_.$_book43 = $_book43;
    }
    else return null;

    if ($_basket44 == null) {
      result_.$_basket44 = other_.$_basket44;
    }
    else if (other_.$_basket44 == null) {
      result_.$_basket44 = $_basket44;
    }
    else if($_basket44 == other_.$_basket44) {
      result_.$_basket44 = $_basket44;
    }
    else return null;

    if ($_bookstore45 == null) {
      result_.$_bookstore45 = other_.$_bookstore45;
    }
    else if (other_.$_bookstore45 == null) {
      result_.$_bookstore45 = $_bookstore45;
    }
    else if($_bookstore45 == other_.$_bookstore45) {
      result_.$_bookstore45 = $_bookstore45;
    }
    else return null;

    if ($_customer46 == null) {
      result_.$_customer46 = other_.$_customer46;
    }
    else if (other_.$_customer46 == null) {
      result_.$_customer46 = $_customer46;
    }
    else if($_customer46 == other_.$_customer46) {
      result_.$_customer46 = $_customer46;
    }
    else return null;

    return result_;
  }
}

class $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$ extends DisCo_action_ {
  Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ enabled_for_;

  DisCo_int_ rhs_20;
  DisCo_int_ rhs_21;
  DisCo_int_ rhs_22;
  boolean treeCondition_6;
  boolean treeCondition_7;
  boolean treeCondition_8;
  public $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ selected_combination_ = new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(my_specification_);
  public String get_name_() {
    return "automatic_remove_book_from_basket";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Book0_interface_ $_book48 = selected_combination_.$_book48;
    $_Basket1_interface_ $_basket49 = selected_combination_.$_basket49;
    $_Bookstore4_interface_ $_bookstore50 = selected_combination_.$_bookstore50;
    Parameter_real_ $_now51 = selected_combination_.$_now51;
    return ((((($_book48.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore50).objectID_)))).op_and_(($_basket49.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))))).op_or_(($_basket49.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))))).op_or_(($_basket49.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book48, $_Basket1_interface_ $_basket49, $_Bookstore4_interface_ $_bookstore50) {
    return (((($_book48.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore50).objectID_)))).op_and_(($_basket49.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))))).op_or_(($_basket49.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))))).op_or_(($_basket49.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ combs_ = new Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_(my_specification_);
    Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ partial_result_ = new Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book48();
    combs_.generate_explicit_combinations_$_basket49();
    combs_.generate_explicit_combinations_$_bookstore50();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book48 = $$$_one_combination_$$$.$_book48;
      $_Basket1_interface_ $_basket49 = $$$_one_combination_$$$.$_basket49;
      $_Bookstore4_interface_ $_bookstore50 = $$$_one_combination_$$$.$_bookstore50;
      if (partial_guard_1_($_book48, $_basket49, $_bookstore50)) {
        partial_result_.add_combination_(new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_($_book48, $_basket49, $_bookstore50, my_specification_));
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
  public void initialize_execute($_Book0_interface_ $_book48, $_Basket1_interface_ $_basket49, $_Bookstore4_interface_ $_bookstore50, Parameter_real_ $_now51) throws Assertion_exception_ {
    treeCondition_6 = false;
    if(($_basket49.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))).get_val_()){
      treeCondition_6 = true;
      rhs_20 = (new DisCo_int_(-1));
    }
    treeCondition_7 = false;
    if(($_basket49.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))).get_val_()){
      treeCondition_7 = true;
      rhs_21 = (new DisCo_int_(-1));
    }
    treeCondition_8 = false;
    if(($_basket49.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book48).objectID_)))).get_val_()){
      treeCondition_8 = true;
      rhs_22 = (new DisCo_int_(-1));
    }
  }

  public void actual_execute($_Book0_interface_ $_book48, $_Basket1_interface_ $_basket49, $_Bookstore4_interface_ $_bookstore50, Parameter_real_ $_now51) throws Assertion_exception_ {
    try {
      if(treeCondition_6){
        $_basket49.set_$_book_127_(rhs_20.get_val_());
        Iterator iEL23 = my_specification_.getEngineListeners_();
        while(iEL23.hasNext()) {
          ((EngineListener)(iEL23.next())).objectStateChanged((DisCo_class_)$_basket49);
        }
      }
      if(treeCondition_7){
        $_basket49.set_$_book_228_(rhs_21.get_val_());
        Iterator iEL24 = my_specification_.getEngineListeners_();
        while(iEL24.hasNext()) {
          ((EngineListener)(iEL24.next())).objectStateChanged((DisCo_class_)$_basket49);
        }
      }
      if(treeCondition_8){
        $_basket49.set_$_book_329_(rhs_22.get_val_());
        Iterator iEL25 = my_specification_.getEngineListeners_();
        while(iEL25.hasNext()) {
          ((EngineListener)(iEL25.next())).objectStateChanged((DisCo_class_)$_basket49);
        }
      }
      my_specification_.rt_.set_omega_($_now51.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Book0_interface_ $_book48, $_Basket1_interface_ $_basket49, $_Bookstore4_interface_ $_bookstore50, Parameter_real_ $_now51) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_book48, $_basket49, $_bookstore50, $_now51);
    actual_execute($_book48, $_basket49, $_bookstore50, $_now51);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action automatic_remove_book_from_basket(Book, Basket, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("basket", "Basket"));
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
      vd_ = new Value_description_(selected_combination_.$_now51.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 3){
      selected_combination_.$_now51.realval = value.realval;
      selected_combination_.$_now51.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action automatic_remove_book_from_basket(Book, Basket, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 3){
      selected_combination_.$_now51 = new Parameter_real_();
      selected_combination_.$_now51.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action automatic_remove_book_from_basket(Book, Basket, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for automatic_remove_book_from_basket(Book, Basket, Bookstore) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_book48 != null, "Participant $_book48 == null");
    new Assertion(selected_combination_.$_basket49 != null, "Participant $_basket49 == null");
    new Assertion(selected_combination_.$_bookstore50 != null, "Participant $_bookstore50 == null");
    $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action automatic_remove_book_from_basket(Book, Basket, Bookstore) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_book48, selected_combination_.$_basket49, selected_combination_.$_bookstore50, selected_combination_.$_now51);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_book48 = ($_Book0_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_basket49 = ($_Basket1_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore50 = ($_Bookstore4_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_book48;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_basket49;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore50;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ comb_ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      if (!comb_.$_now51.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action automatic_remove_book_from_basket(Book, Basket, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_book48() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book48 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book48() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_basket49() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_basket49 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_basket49() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore50() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore50 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore50() );
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
      tmp_combinations.addAll((($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book48());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_basket49());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore50());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      if(comb.$_book48 != null && (($_Book0) (comb.$_book48)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book48)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_basket49 != null && (($_Basket1) (comb.$_basket49)).objectID_ != (($_Basket1) ($$$_ccc_$$$.$_basket49)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore50 != null && (($_Bookstore4) (comb.$_bookstore50)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore50)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next()).debug_();
    }
  }

  public $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ pick_actual_parameters_($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ comb = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) (iter.next());
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
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_  comb_to_add_ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ comb_to_add_ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ combine(Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ other_) {
    Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_ result = new Combinations_$_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ mycomb = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ otherscomb = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) otherselems.next();
        $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ c = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Book0_interface_ $_book48 = null;
  $_Basket1_interface_ $_basket49 = null;
  $_Bookstore4_interface_ $_bookstore50 = null;
  Parameter_real_ $_now51 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_($_Book0_interface_ $_book48, $_Basket1_interface_ $_basket49, $_Bookstore4_interface_ $_bookstore50, DisCo_specification_ my_specification) {
    this.$_book48 = $_book48;
    this.$_basket49 = $_basket49;
    this.$_bookstore50 = $_bookstore50;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now51);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ $$$_other_$$$ = ($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_)o;
    DisCo_class_ $$_other_$_book48 = ((DisCo_class_) $$$_other_$$$.$_book48);
    DisCo_class_ $$_other_$_basket49 = ((DisCo_class_) $$$_other_$$$.$_basket49);
    DisCo_class_ $$_other_$_bookstore50 = ((DisCo_class_) $$$_other_$$$.$_bookstore50);
    if($_book48 == null && $$_other_$_book48 != null){
      return -1;
    }
    if($_book48 != null && $$_other_$_book48 == null){
      return 1;
    }
    if($_book48 != null && $$_other_$_book48!= null && ((DisCo_class_) $_book48).objectID_ != $$_other_$_book48.objectID_){
      return ((DisCo_class_) $_book48).objectID_ - $$_other_$_book48.objectID_;
    }
    if($_basket49 == null && $$_other_$_basket49 != null){
      return -1;
    }
    if($_basket49 != null && $$_other_$_basket49 == null){
      return 1;
    }
    if($_basket49 != null && $$_other_$_basket49!= null && ((DisCo_class_) $_basket49).objectID_ != $$_other_$_basket49.objectID_){
      return ((DisCo_class_) $_basket49).objectID_ - $$_other_$_basket49.objectID_;
    }
    if($_bookstore50 == null && $$_other_$_bookstore50 != null){
      return -1;
    }
    if($_bookstore50 != null && $$_other_$_bookstore50 == null){
      return 1;
    }
    if($_bookstore50 != null && $$_other_$_bookstore50!= null && ((DisCo_class_) $_bookstore50).objectID_ != $$_other_$_bookstore50.objectID_){
      return ((DisCo_class_) $_bookstore50).objectID_ - $$_other_$_bookstore50.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_book48() {
    Vector ret = new Vector();
    if($_book48 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(($_Book0_interface_)iter_.nextElement(), $_basket49, $_bookstore50, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_basket49() {
    Vector ret = new Vector();
    if($_basket49 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Basket1").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_($_book48, ($_Basket1_interface_)iter_.nextElement(), $_bookstore50, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore50() {
    Vector ret = new Vector();
    if($_bookstore50 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_($_book48, $_basket49, ($_Bookstore4_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "book=" + ($_book48 == null ? "<any>" : $_book48.toString()) + ", "
       + "basket=" + ($_basket49 == null ? "<any>" : $_basket49.toString()) + ", "
       + "bookstore=" + ($_bookstore50 == null ? "<any>" : $_bookstore50.toString()) + ", "
       + "now=" + ($_now51 == null ? "<any>" : $_now51.toString()) + ", ");
  }

  public boolean equal_participants_($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ trial) {
    return $_book48 != null && $_book48 == trial.$_book48  && $_basket49 != null && $_basket49 == trial.$_basket49  && $_bookstore50 != null && $_bookstore50 == trial.$_bookstore50 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_book48);
    result_.addElement($_basket49);
    result_.addElement($_bookstore50);
    return result_;
  }

  public $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ clone_() {
    return new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_($_book48, $_basket49, $_bookstore50, my_specification_);
  }

  public boolean invalid_() {
    if ($_book48 != null && $_book48 == $_basket49) return true;
    if ($_book48 != null && $_book48 == $_bookstore50) return true;
    if ($_basket49 != null && $_basket49 == $_bookstore50) return true;
    return invalid_;
  }

  public $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ combine($_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ other_) {
    $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_ result_ = new $_automatic_remove_book_from_basket$$$_Book0$$$_Basket1$$$_Bookstore4$$_combination_(null, null, null, my_specification_);
    if ($_book48 == null) {
      result_.$_book48 = other_.$_book48;
    }
    else if (other_.$_book48 == null) {
      result_.$_book48 = $_book48;
    }
    else if($_book48 == other_.$_book48) {
      result_.$_book48 = $_book48;
    }
    else return null;

    if ($_basket49 == null) {
      result_.$_basket49 = other_.$_basket49;
    }
    else if (other_.$_basket49 == null) {
      result_.$_basket49 = $_basket49;
    }
    else if($_basket49 == other_.$_basket49) {
      result_.$_basket49 = $_basket49;
    }
    else return null;

    if ($_bookstore50 == null) {
      result_.$_bookstore50 = other_.$_bookstore50;
    }
    else if (other_.$_bookstore50 == null) {
      result_.$_bookstore50 = $_bookstore50;
    }
    else if($_bookstore50 == other_.$_bookstore50) {
      result_.$_bookstore50 = $_bookstore50;
    }
    else return null;

    return result_;
  }
}

class $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$ extends DisCo_action_ {
  Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ enabled_for_;

  DisCo_int_ rhs_26;
  DisCo_int_ rhs_27;
  DisCo_int_ rhs_28;
  DisCo_int_ rhs_29;
  DisCo_int_ rhs_30;
  DisCo_int_ rhs_31;
  DisCo_int_ rhs_32;
  DisCo_int_ rhs_33;
  DisCo_int_ rhs_34;
  DisCo_int_ rhs_35;
  DisCo_int_ rhs_36;
  DisCo_int_ rhs_37;
  $_first9_interface_ rhs_38;
  boolean treeCondition_9;
  boolean treeCondition_10;
  boolean treeCondition_11;
  public $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ selected_combination_ = new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(my_specification_);
  public String get_name_() {
    return "buy_book_from_basket";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Book0_interface_ $_book52 = selected_combination_.$_book52;
    $_Customer2_interface_ $_customer53 = selected_combination_.$_customer53;
    $_Basket1_interface_ $_basket54 = selected_combination_.$_basket54;
    Parameter_real_ $_now55 = selected_combination_.$_now55;
    return (((($_basket54.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))).op_or_(($_basket54.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))))).op_or_(($_basket54.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book52, $_Basket1_interface_ $_basket54) {
    return ((($_basket54.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))).op_or_(($_basket54.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))))).op_or_(($_basket54.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ combs_ = new Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_(my_specification_);
    Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ partial_result_ = new Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book52();
    combs_.generate_explicit_combinations_$_basket54();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ $$$_one_combination_$$$ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book52 = $$$_one_combination_$$$.$_book52;
      $_Basket1_interface_ $_basket54 = $$$_one_combination_$$$.$_basket54;
      if (partial_guard_1_($_book52, $_basket54)) {
        partial_result_.add_combination_(new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_($_book52, null, $_basket54, my_specification_));
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
  public void initialize_execute($_Book0_interface_ $_book52, $_Customer2_interface_ $_customer53, $_Basket1_interface_ $_basket54, Parameter_real_ $_now55) throws Assertion_exception_ {
    treeCondition_9 = false;
    if(($_basket54.get_$_book_127_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))).get_val_()){
      treeCondition_9 = true;
      rhs_26 = (new DisCo_int_(-1));
      rhs_27 = (new DisCo_int_(-1));
      rhs_28 = (new DisCo_int_(((DisCo_class_)$_customer53).objectID_));
      rhs_29 = (new DisCo_int_(-1));
    }
    treeCondition_10 = false;
    if(($_basket54.get_$_book_228_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))).get_val_()){
      treeCondition_10 = true;
      rhs_30 = (new DisCo_int_(-1));
      rhs_31 = (new DisCo_int_(-1));
      rhs_32 = (new DisCo_int_(((DisCo_class_)$_customer53).objectID_));
      rhs_33 = (new DisCo_int_(-1));
    }
    treeCondition_11 = false;
    if(($_basket54.get_$_book_329_().op_eq_((new DisCo_int_(((DisCo_class_)$_book52).objectID_)))).get_val_()){
      treeCondition_11 = true;
      rhs_34 = (new DisCo_int_(-1));
      rhs_35 = (new DisCo_int_(-1));
      rhs_36 = (new DisCo_int_(((DisCo_class_)$_customer53).objectID_));
      rhs_37 = (new DisCo_int_(-1));
    }
    rhs_38 = new $_Basket1.$_first9();
  }

  public void actual_execute($_Book0_interface_ $_book52, $_Customer2_interface_ $_customer53, $_Basket1_interface_ $_basket54, Parameter_real_ $_now55) throws Assertion_exception_ {
    try {
      if(treeCondition_9){
        $_book52.set_$_owned_bookstore31_(rhs_26.get_val_());
        Iterator iEL39 = my_specification_.getEngineListeners_();
        while(iEL39.hasNext()) {
          ((EngineListener)(iEL39.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_book52.set_$_in_basket33_(rhs_27.get_val_());
        Iterator iEL40 = my_specification_.getEngineListeners_();
        while(iEL40.hasNext()) {
          ((EngineListener)(iEL40.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_book52.set_$_owned_customer32_(rhs_28.get_val_());
        Iterator iEL41 = my_specification_.getEngineListeners_();
        while(iEL41.hasNext()) {
          ((EngineListener)(iEL41.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_basket54.set_$_book_127_(rhs_29.get_val_());
        Iterator iEL42 = my_specification_.getEngineListeners_();
        while(iEL42.hasNext()) {
          ((EngineListener)(iEL42.next())).objectStateChanged((DisCo_class_)$_basket54);
        }
      }
      if(treeCondition_10){
        $_book52.set_$_owned_bookstore31_(rhs_30.get_val_());
        Iterator iEL43 = my_specification_.getEngineListeners_();
        while(iEL43.hasNext()) {
          ((EngineListener)(iEL43.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_book52.set_$_in_basket33_(rhs_31.get_val_());
        Iterator iEL44 = my_specification_.getEngineListeners_();
        while(iEL44.hasNext()) {
          ((EngineListener)(iEL44.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_book52.set_$_owned_customer32_(rhs_32.get_val_());
        Iterator iEL45 = my_specification_.getEngineListeners_();
        while(iEL45.hasNext()) {
          ((EngineListener)(iEL45.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_basket54.set_$_book_228_(rhs_33.get_val_());
        Iterator iEL46 = my_specification_.getEngineListeners_();
        while(iEL46.hasNext()) {
          ((EngineListener)(iEL46.next())).objectStateChanged((DisCo_class_)$_basket54);
        }
      }
      if(treeCondition_11){
        $_book52.set_$_owned_bookstore31_(rhs_34.get_val_());
        Iterator iEL47 = my_specification_.getEngineListeners_();
        while(iEL47.hasNext()) {
          ((EngineListener)(iEL47.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_book52.set_$_in_basket33_(rhs_35.get_val_());
        Iterator iEL48 = my_specification_.getEngineListeners_();
        while(iEL48.hasNext()) {
          ((EngineListener)(iEL48.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_book52.set_$_owned_customer32_(rhs_36.get_val_());
        Iterator iEL49 = my_specification_.getEngineListeners_();
        while(iEL49.hasNext()) {
          ((EngineListener)(iEL49.next())).objectStateChanged((DisCo_class_)$_book52);
        }
        $_basket54.set_$_book_228_(rhs_37.get_val_());
        Iterator iEL50 = my_specification_.getEngineListeners_();
        while(iEL50.hasNext()) {
          ((EngineListener)(iEL50.next())).objectStateChanged((DisCo_class_)$_basket54);
        }
      }
      $_basket54.set_$_next_empty30_((DisCo_type_) rhs_38);
      Iterator iEL51 = my_specification_.getEngineListeners_();
      while(iEL51.hasNext()) {
        ((EngineListener)(iEL51.next())).objectStateChanged((DisCo_class_)$_basket54);
      }
      my_specification_.rt_.set_omega_($_now55.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Book0_interface_ $_book52, $_Customer2_interface_ $_customer53, $_Basket1_interface_ $_basket54, Parameter_real_ $_now55) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_book52, $_customer53, $_basket54, $_now55);
    actual_execute($_book52, $_customer53, $_basket54, $_now55);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action buy_book_from_basket(Book, Customer, Basket)");
    eval_guard_();
    selected_combination_ = new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    result_.addElement(new Name_type_pair_("basket", "Basket"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 3){
      vd_ = new Value_description_(selected_combination_.$_now55.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 3){
      selected_combination_.$_now55.realval = value.realval;
      selected_combination_.$_now55.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action buy_book_from_basket(Book, Customer, Basket)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 3){
      selected_combination_.$_now55 = new Parameter_real_();
      selected_combination_.$_now55.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action buy_book_from_basket(Book, Customer, Basket)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for buy_book_from_basket(Book, Customer, Basket) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_book52 != null, "Participant $_book52 == null");
    new Assertion(selected_combination_.$_customer53 != null, "Participant $_customer53 == null");
    new Assertion(selected_combination_.$_basket54 != null, "Participant $_basket54 == null");
    $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action buy_book_from_basket(Book, Customer, Basket) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_book52, selected_combination_.$_customer53, selected_combination_.$_basket54, selected_combination_.$_now55);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_book52 = ($_Book0_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_customer53 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_basket54 = ($_Basket1_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_book52;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_customer53;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_basket54;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ comb_ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      if (!comb_.$_now55.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action buy_book_from_basket(Book, Customer, Basket)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_book52() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ $$$_ccc_$$$ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book52 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book52() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_customer53() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ $$$_ccc_$$$ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer53 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer53() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_basket54() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ $$$_ccc_$$$ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_basket54 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_basket54() );
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
      tmp_combinations.addAll((($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book52());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer53());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_basket54());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ $$$_ccc_$$$ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      if(comb.$_book52 != null && (($_Book0) (comb.$_book52)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book52)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_customer53 != null && (($_Customer2) (comb.$_customer53)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer53)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_basket54 != null && (($_Basket1) (comb.$_basket54)).objectID_ != (($_Basket1) ($$$_ccc_$$$.$_basket54)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next()).debug_();
    }
  }

  public $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ pick_actual_parameters_($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ comb = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) (iter.next());
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
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_  comb_to_add_ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ comb_to_add_ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ combine(Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ other_) {
    Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_ result = new Combinations_$_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ mycomb = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ otherscomb = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) otherselems.next();
        $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ c = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Book0_interface_ $_book52 = null;
  $_Customer2_interface_ $_customer53 = null;
  $_Basket1_interface_ $_basket54 = null;
  Parameter_real_ $_now55 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_($_Book0_interface_ $_book52, $_Customer2_interface_ $_customer53, $_Basket1_interface_ $_basket54, DisCo_specification_ my_specification) {
    this.$_book52 = $_book52;
    this.$_customer53 = $_customer53;
    this.$_basket54 = $_basket54;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now55);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ $$$_other_$$$ = ($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_)o;
    DisCo_class_ $$_other_$_book52 = ((DisCo_class_) $$$_other_$$$.$_book52);
    DisCo_class_ $$_other_$_customer53 = ((DisCo_class_) $$$_other_$$$.$_customer53);
    DisCo_class_ $$_other_$_basket54 = ((DisCo_class_) $$$_other_$$$.$_basket54);
    if($_book52 == null && $$_other_$_book52 != null){
      return -1;
    }
    if($_book52 != null && $$_other_$_book52 == null){
      return 1;
    }
    if($_book52 != null && $$_other_$_book52!= null && ((DisCo_class_) $_book52).objectID_ != $$_other_$_book52.objectID_){
      return ((DisCo_class_) $_book52).objectID_ - $$_other_$_book52.objectID_;
    }
    if($_customer53 == null && $$_other_$_customer53 != null){
      return -1;
    }
    if($_customer53 != null && $$_other_$_customer53 == null){
      return 1;
    }
    if($_customer53 != null && $$_other_$_customer53!= null && ((DisCo_class_) $_customer53).objectID_ != $$_other_$_customer53.objectID_){
      return ((DisCo_class_) $_customer53).objectID_ - $$_other_$_customer53.objectID_;
    }
    if($_basket54 == null && $$_other_$_basket54 != null){
      return -1;
    }
    if($_basket54 != null && $$_other_$_basket54 == null){
      return 1;
    }
    if($_basket54 != null && $$_other_$_basket54!= null && ((DisCo_class_) $_basket54).objectID_ != $$_other_$_basket54.objectID_){
      return ((DisCo_class_) $_basket54).objectID_ - $$_other_$_basket54.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_book52() {
    Vector ret = new Vector();
    if($_book52 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(($_Book0_interface_)iter_.nextElement(), $_customer53, $_basket54, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_customer53() {
    Vector ret = new Vector();
    if($_customer53 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_($_book52, ($_Customer2_interface_)iter_.nextElement(), $_basket54, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_basket54() {
    Vector ret = new Vector();
    if($_basket54 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Basket1").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_($_book52, $_customer53, ($_Basket1_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "book=" + ($_book52 == null ? "<any>" : $_book52.toString()) + ", "
       + "customer=" + ($_customer53 == null ? "<any>" : $_customer53.toString()) + ", "
       + "basket=" + ($_basket54 == null ? "<any>" : $_basket54.toString()) + ", "
       + "now=" + ($_now55 == null ? "<any>" : $_now55.toString()) + ", ");
  }

  public boolean equal_participants_($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ trial) {
    return $_book52 != null && $_book52 == trial.$_book52  && $_customer53 != null && $_customer53 == trial.$_customer53  && $_basket54 != null && $_basket54 == trial.$_basket54 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_book52);
    result_.addElement($_customer53);
    result_.addElement($_basket54);
    return result_;
  }

  public $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ clone_() {
    return new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_($_book52, $_customer53, $_basket54, my_specification_);
  }

  public boolean invalid_() {
    if ($_book52 != null && $_book52 == $_customer53) return true;
    if ($_book52 != null && $_book52 == $_basket54) return true;
    if ($_customer53 != null && $_customer53 == $_basket54) return true;
    return invalid_;
  }

  public $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ combine($_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ other_) {
    $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_ result_ = new $_buy_book_from_basket$$$_Book0$$$_Customer2$$$_Basket1$$_combination_(null, null, null, my_specification_);
    if ($_book52 == null) {
      result_.$_book52 = other_.$_book52;
    }
    else if (other_.$_book52 == null) {
      result_.$_book52 = $_book52;
    }
    else if($_book52 == other_.$_book52) {
      result_.$_book52 = $_book52;
    }
    else return null;

    if ($_customer53 == null) {
      result_.$_customer53 = other_.$_customer53;
    }
    else if (other_.$_customer53 == null) {
      result_.$_customer53 = $_customer53;
    }
    else if($_customer53 == other_.$_customer53) {
      result_.$_customer53 = $_customer53;
    }
    else return null;

    if ($_basket54 == null) {
      result_.$_basket54 = other_.$_basket54;
    }
    else if (other_.$_basket54 == null) {
      result_.$_basket54 = $_basket54;
    }
    else if($_basket54 == other_.$_basket54) {
      result_.$_basket54 = $_basket54;
    }
    else return null;

    return result_;
  }
}

class $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$ extends DisCo_action_ {
  Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ enabled_for_;

  DisCo_int_ rhs_52;
  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ selected_combination_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(my_specification_);
  public String get_name_() {
    return "browse_book";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_customer56 = selected_combination_.$_customer56;
    $_Book0_interface_ $_book57 = selected_combination_.$_book57;
    $_Bookstore4_interface_ $_bookstore58 = selected_combination_.$_bookstore58;
    Parameter_real_ $_now59 = selected_combination_.$_now59;
    return ((($_book57.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore58).objectID_)))).op_and_(($_book57.get_$_in_basket33_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book57, $_Bookstore4_interface_ $_bookstore58) {
    return ($_book57.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore58).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book57) {
    return ($_book57.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ combs_ = new Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_(my_specification_);
    Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ partial_result_ = new Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book57();
    combs_.generate_explicit_combinations_$_bookstore58();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book57 = $$$_one_combination_$$$.$_book57;
      $_Bookstore4_interface_ $_bookstore58 = $$$_one_combination_$$$.$_bookstore58;
      if (partial_guard_1_($_book57, $_bookstore58)) {
        partial_result_.add_combination_(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(null, $_book57, $_bookstore58, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book57();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book57 = $$$_one_combination_$$$.$_book57;
      if (partial_guard_2_($_book57)) {
        partial_result_.add_combination_(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(null, $_book57, null, my_specification_));
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
  public void initialize_execute($_Customer2_interface_ $_customer56, $_Book0_interface_ $_book57, $_Bookstore4_interface_ $_bookstore58, Parameter_real_ $_now59) throws Assertion_exception_ {
    rhs_52 = (new DisCo_int_(((DisCo_class_)$_book57).objectID_));
  }

  public void actual_execute($_Customer2_interface_ $_customer56, $_Book0_interface_ $_book57, $_Bookstore4_interface_ $_bookstore58, Parameter_real_ $_now59) throws Assertion_exception_ {
    try {
      $_customer56.set_$_browsing_currently35_(rhs_52.get_val_());
      Iterator iEL53 = my_specification_.getEngineListeners_();
      while(iEL53.hasNext()) {
        ((EngineListener)(iEL53.next())).objectStateChanged((DisCo_class_)$_customer56);
      }
      my_specification_.rt_.set_omega_($_now59.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Customer2_interface_ $_customer56, $_Book0_interface_ $_book57, $_Bookstore4_interface_ $_bookstore58, Parameter_real_ $_now59) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_customer56, $_book57, $_bookstore58, $_now59);
    actual_execute($_customer56, $_book57, $_bookstore58, $_now59);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action browse_book(Customer, Book, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(my_specification_);
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
      vd_ = new Value_description_(selected_combination_.$_now59.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 3){
      selected_combination_.$_now59.realval = value.realval;
      selected_combination_.$_now59.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action browse_book(Customer, Book, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 3){
      selected_combination_.$_now59 = new Parameter_real_();
      selected_combination_.$_now59.set_by_user_ = false;
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
    selected_combination_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_customer56 != null, "Participant $_customer56 == null");
    new Assertion(selected_combination_.$_book57 != null, "Participant $_book57 == null");
    new Assertion(selected_combination_.$_bookstore58 != null, "Participant $_bookstore58 == null");
    $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    execute(selected_combination_.$_customer56, selected_combination_.$_book57, selected_combination_.$_bookstore58, selected_combination_.$_now59);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_customer56 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book57 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore58 = ($_Bookstore4_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_customer56;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book57;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore58;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ comb_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      if (!comb_.$_now59.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action browse_book(Customer, Book, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_customer56() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer56 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer56() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book57() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book57 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book57() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore58() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore58 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore58() );
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
      tmp_combinations.addAll((($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer56());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book57());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore58());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      if(comb.$_customer56 != null && (($_Customer2) (comb.$_customer56)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer56)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book57 != null && (($_Book0) (comb.$_book57)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book57)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore58 != null && (($_Bookstore4) (comb.$_bookstore58)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore58)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next()).debug_();
    }
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ pick_actual_parameters_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ comb = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) (iter.next());
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
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_  comb_to_add_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ comb_to_add_ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ combine(Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ other_) {
    Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_ result = new Combinations_$_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ mycomb = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ otherscomb = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) otherselems.next();
        $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ c = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Customer2_interface_ $_customer56 = null;
  $_Book0_interface_ $_book57 = null;
  $_Bookstore4_interface_ $_bookstore58 = null;
  Parameter_real_ $_now59 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_($_Customer2_interface_ $_customer56, $_Book0_interface_ $_book57, $_Bookstore4_interface_ $_bookstore58, DisCo_specification_ my_specification) {
    this.$_customer56 = $_customer56;
    this.$_book57 = $_book57;
    this.$_bookstore58 = $_bookstore58;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now59);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ $$$_other_$$$ = ($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_)o;
    DisCo_class_ $$_other_$_customer56 = ((DisCo_class_) $$$_other_$$$.$_customer56);
    DisCo_class_ $$_other_$_book57 = ((DisCo_class_) $$$_other_$$$.$_book57);
    DisCo_class_ $$_other_$_bookstore58 = ((DisCo_class_) $$$_other_$$$.$_bookstore58);
    if($_customer56 == null && $$_other_$_customer56 != null){
      return -1;
    }
    if($_customer56 != null && $$_other_$_customer56 == null){
      return 1;
    }
    if($_customer56 != null && $$_other_$_customer56!= null && ((DisCo_class_) $_customer56).objectID_ != $$_other_$_customer56.objectID_){
      return ((DisCo_class_) $_customer56).objectID_ - $$_other_$_customer56.objectID_;
    }
    if($_book57 == null && $$_other_$_book57 != null){
      return -1;
    }
    if($_book57 != null && $$_other_$_book57 == null){
      return 1;
    }
    if($_book57 != null && $$_other_$_book57!= null && ((DisCo_class_) $_book57).objectID_ != $$_other_$_book57.objectID_){
      return ((DisCo_class_) $_book57).objectID_ - $$_other_$_book57.objectID_;
    }
    if($_bookstore58 == null && $$_other_$_bookstore58 != null){
      return -1;
    }
    if($_bookstore58 != null && $$_other_$_bookstore58 == null){
      return 1;
    }
    if($_bookstore58 != null && $$_other_$_bookstore58!= null && ((DisCo_class_) $_bookstore58).objectID_ != $$_other_$_bookstore58.objectID_){
      return ((DisCo_class_) $_bookstore58).objectID_ - $$_other_$_bookstore58.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_customer56() {
    Vector ret = new Vector();
    if($_customer56 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(($_Customer2_interface_)iter_.nextElement(), $_book57, $_bookstore58, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book57() {
    Vector ret = new Vector();
    if($_book57 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_($_customer56, ($_Book0_interface_)iter_.nextElement(), $_bookstore58, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore58() {
    Vector ret = new Vector();
    if($_bookstore58 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_($_customer56, $_book57, ($_Bookstore4_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "customer=" + ($_customer56 == null ? "<any>" : $_customer56.toString()) + ", "
       + "book=" + ($_book57 == null ? "<any>" : $_book57.toString()) + ", "
       + "bookstore=" + ($_bookstore58 == null ? "<any>" : $_bookstore58.toString()) + ", "
       + "now=" + ($_now59 == null ? "<any>" : $_now59.toString()) + ", ");
  }

  public boolean equal_participants_($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ trial) {
    return $_customer56 != null && $_customer56 == trial.$_customer56  && $_book57 != null && $_book57 == trial.$_book57  && $_bookstore58 != null && $_bookstore58 == trial.$_bookstore58 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_customer56);
    result_.addElement($_book57);
    result_.addElement($_bookstore58);
    return result_;
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ clone_() {
    return new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_($_customer56, $_book57, $_bookstore58, my_specification_);
  }

  public boolean invalid_() {
    if ($_customer56 != null && $_customer56 == $_book57) return true;
    if ($_customer56 != null && $_customer56 == $_bookstore58) return true;
    if ($_book57 != null && $_book57 == $_bookstore58) return true;
    return invalid_;
  }

  public $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ combine($_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ other_) {
    $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_ result_ = new $_browse_book$$$_Customer2$$$_Book0$$$_Bookstore4$$_combination_(null, null, null, my_specification_);
    if ($_customer56 == null) {
      result_.$_customer56 = other_.$_customer56;
    }
    else if (other_.$_customer56 == null) {
      result_.$_customer56 = $_customer56;
    }
    else if($_customer56 == other_.$_customer56) {
      result_.$_customer56 = $_customer56;
    }
    else return null;

    if ($_book57 == null) {
      result_.$_book57 = other_.$_book57;
    }
    else if (other_.$_book57 == null) {
      result_.$_book57 = $_book57;
    }
    else if($_book57 == other_.$_book57) {
      result_.$_book57 = $_book57;
    }
    else return null;

    if ($_bookstore58 == null) {
      result_.$_bookstore58 = other_.$_bookstore58;
    }
    else if (other_.$_bookstore58 == null) {
      result_.$_bookstore58 = $_bookstore58;
    }
    else if($_bookstore58 == other_.$_bookstore58) {
      result_.$_bookstore58 = $_bookstore58;
    }
    else return null;

    return result_;
  }
}

class $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$ extends DisCo_action_ {
  Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_54;
  public $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ selected_combination_ = new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "add_book_to_store";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper5_interface_ $_shopkeeper60 = selected_combination_.$_shopkeeper60;
    $_Book0_interface_ $_book61 = selected_combination_.$_book61;
    $_Bookstore4_interface_ $_bookstore62 = selected_combination_.$_bookstore62;
    $_System3_interface_ $_system63 = selected_combination_.$_system63;
    Parameter_real_ $_now64 = selected_combination_.$_now64;
    return ((((($_book61.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).op_and_(($_book61.get_$_owned_customer32_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_book61.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system63.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper60).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book61) {
    return ($_book61.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book61) {
    return ($_book61.get_$_owned_customer32_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Book0_interface_ $_book61) {
    return ($_book61.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Shopkeeper5_interface_ $_shopkeeper60, $_System3_interface_ $_system63) {
    return ($_system63.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper60).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ combs_ = new Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(my_specification_);
    Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ partial_result_ = new Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book61();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book61 = $$$_one_combination_$$$.$_book61;
      if (partial_guard_1_($_book61)) {
        partial_result_.add_combination_(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, $_book61, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book61();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book61 = $$$_one_combination_$$$.$_book61;
      if (partial_guard_2_($_book61)) {
        partial_result_.add_combination_(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, $_book61, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book61();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book61 = $$$_one_combination_$$$.$_book61;
      if (partial_guard_3_($_book61)) {
        partial_result_.add_combination_(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, $_book61, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper60();
    combs_.generate_explicit_combinations_$_system63();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Shopkeeper5_interface_ $_shopkeeper60 = $$$_one_combination_$$$.$_shopkeeper60;
      $_System3_interface_ $_system63 = $$$_one_combination_$$$.$_system63;
      if (partial_guard_4_($_shopkeeper60, $_system63)) {
        partial_result_.add_combination_(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper60, null, null, $_system63, my_specification_));
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
  public void initialize_execute($_Shopkeeper5_interface_ $_shopkeeper60, $_Book0_interface_ $_book61, $_Bookstore4_interface_ $_bookstore62, $_System3_interface_ $_system63, Parameter_real_ $_now64) throws Assertion_exception_ {
    rhs_54 = (new DisCo_int_(((DisCo_class_)$_bookstore62).objectID_));
  }

  public void actual_execute($_Shopkeeper5_interface_ $_shopkeeper60, $_Book0_interface_ $_book61, $_Bookstore4_interface_ $_bookstore62, $_System3_interface_ $_system63, Parameter_real_ $_now64) throws Assertion_exception_ {
    try {
      $_book61.set_$_owned_bookstore31_(rhs_54.get_val_());
      Iterator iEL55 = my_specification_.getEngineListeners_();
      while(iEL55.hasNext()) {
        ((EngineListener)(iEL55.next())).objectStateChanged((DisCo_class_)$_book61);
      }
      my_specification_.rt_.set_omega_($_now64.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper5_interface_ $_shopkeeper60, $_Book0_interface_ $_book61, $_Bookstore4_interface_ $_bookstore62, $_System3_interface_ $_system63, Parameter_real_ $_now64) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper60, $_book61, $_bookstore62, $_system63, $_now64);
    actual_execute($_shopkeeper60, $_book61, $_bookstore62, $_system63, $_now64);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action add_book_to_store(Shopkeeper, Book, Bookstore, System)");
    eval_guard_();
    selected_combination_ = new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(my_specification_);
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
      vd_ = new Value_description_(selected_combination_.$_now64.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now64.realval = value.realval;
      selected_combination_.$_now64.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action add_book_to_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now64 = new Parameter_real_();
      selected_combination_.$_now64.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action add_book_to_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for add_book_to_store(Shopkeeper, Book, Bookstore, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper60 != null, "Participant $_shopkeeper60 == null");
    new Assertion(selected_combination_.$_book61 != null, "Participant $_book61 == null");
    new Assertion(selected_combination_.$_bookstore62 != null, "Participant $_bookstore62 == null");
    new Assertion(selected_combination_.$_system63 != null, "Participant $_system63 == null");
    $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action add_book_to_store(Shopkeeper, Book, Bookstore, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_shopkeeper60, selected_combination_.$_book61, selected_combination_.$_bookstore62, selected_combination_.$_system63, selected_combination_.$_now64);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper60 = ($_Shopkeeper5_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book61 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore62 = ($_Bookstore4_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_system63 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper60;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book61;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore62;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_system63;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb_ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now64.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action add_book_to_store(Shopkeeper, Book, Bookstore, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper60() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper60 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper60() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book61() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book61 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book61() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore62() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore62 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore62() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system63() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system63 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system63() );
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
      tmp_combinations.addAll((($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper60());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book61());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore62());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system63());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper60 != null && (($_Shopkeeper5) (comb.$_shopkeeper60)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper60)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book61 != null && (($_Book0) (comb.$_book61)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book61)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore62 != null && (($_Bookstore4) (comb.$_bookstore62)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore62)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system63 != null && (($_System3) (comb.$_system63)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system63)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ pick_actual_parameters_($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) (iter.next());
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
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_  comb_to_add_ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb_to_add_ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ combine(Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ other_) {
    Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ result = new Combinations_$_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ mycomb = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ otherscomb = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) otherselems.next();
        $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ c = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper5_interface_ $_shopkeeper60 = null;
  $_Book0_interface_ $_book61 = null;
  $_Bookstore4_interface_ $_bookstore62 = null;
  $_System3_interface_ $_system63 = null;
  Parameter_real_ $_now64 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_Shopkeeper5_interface_ $_shopkeeper60, $_Book0_interface_ $_book61, $_Bookstore4_interface_ $_bookstore62, $_System3_interface_ $_system63, DisCo_specification_ my_specification) {
    this.$_shopkeeper60 = $_shopkeeper60;
    this.$_book61 = $_book61;
    this.$_bookstore62 = $_bookstore62;
    this.$_system63 = $_system63;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now64);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_other_$$$ = ($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper60 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper60);
    DisCo_class_ $$_other_$_book61 = ((DisCo_class_) $$$_other_$$$.$_book61);
    DisCo_class_ $$_other_$_bookstore62 = ((DisCo_class_) $$$_other_$$$.$_bookstore62);
    DisCo_class_ $$_other_$_system63 = ((DisCo_class_) $$$_other_$$$.$_system63);
    if($_shopkeeper60 == null && $$_other_$_shopkeeper60 != null){
      return -1;
    }
    if($_shopkeeper60 != null && $$_other_$_shopkeeper60 == null){
      return 1;
    }
    if($_shopkeeper60 != null && $$_other_$_shopkeeper60!= null && ((DisCo_class_) $_shopkeeper60).objectID_ != $$_other_$_shopkeeper60.objectID_){
      return ((DisCo_class_) $_shopkeeper60).objectID_ - $$_other_$_shopkeeper60.objectID_;
    }
    if($_book61 == null && $$_other_$_book61 != null){
      return -1;
    }
    if($_book61 != null && $$_other_$_book61 == null){
      return 1;
    }
    if($_book61 != null && $$_other_$_book61!= null && ((DisCo_class_) $_book61).objectID_ != $$_other_$_book61.objectID_){
      return ((DisCo_class_) $_book61).objectID_ - $$_other_$_book61.objectID_;
    }
    if($_bookstore62 == null && $$_other_$_bookstore62 != null){
      return -1;
    }
    if($_bookstore62 != null && $$_other_$_bookstore62 == null){
      return 1;
    }
    if($_bookstore62 != null && $$_other_$_bookstore62!= null && ((DisCo_class_) $_bookstore62).objectID_ != $$_other_$_bookstore62.objectID_){
      return ((DisCo_class_) $_bookstore62).objectID_ - $$_other_$_bookstore62.objectID_;
    }
    if($_system63 == null && $$_other_$_system63 != null){
      return -1;
    }
    if($_system63 != null && $$_other_$_system63 == null){
      return 1;
    }
    if($_system63 != null && $$_other_$_system63!= null && ((DisCo_class_) $_system63).objectID_ != $$_other_$_system63.objectID_){
      return ((DisCo_class_) $_system63).objectID_ - $$_other_$_system63.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper60() {
    Vector ret = new Vector();
    if($_shopkeeper60 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(($_Shopkeeper5_interface_)iter_.nextElement(), $_book61, $_bookstore62, $_system63, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book61() {
    Vector ret = new Vector();
    if($_book61 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper60, ($_Book0_interface_)iter_.nextElement(), $_bookstore62, $_system63, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore62() {
    Vector ret = new Vector();
    if($_bookstore62 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper60, $_book61, ($_Bookstore4_interface_)iter_.nextElement(), $_system63, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system63() {
    Vector ret = new Vector();
    if($_system63 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper60, $_book61, $_bookstore62, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper60 == null ? "<any>" : $_shopkeeper60.toString()) + ", "
       + "book=" + ($_book61 == null ? "<any>" : $_book61.toString()) + ", "
       + "bookstore=" + ($_bookstore62 == null ? "<any>" : $_bookstore62.toString()) + ", "
       + "system=" + ($_system63 == null ? "<any>" : $_system63.toString()) + ", "
       + "now=" + ($_now64 == null ? "<any>" : $_now64.toString()) + ", ");
  }

  public boolean equal_participants_($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ trial) {
    return $_shopkeeper60 != null && $_shopkeeper60 == trial.$_shopkeeper60  && $_book61 != null && $_book61 == trial.$_book61  && $_bookstore62 != null && $_bookstore62 == trial.$_bookstore62  && $_system63 != null && $_system63 == trial.$_system63 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper60);
    result_.addElement($_book61);
    result_.addElement($_bookstore62);
    result_.addElement($_system63);
    return result_;
  }

  public $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ clone_() {
    return new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper60, $_book61, $_bookstore62, $_system63, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper60 != null && $_shopkeeper60 == $_book61) return true;
    if ($_shopkeeper60 != null && $_shopkeeper60 == $_bookstore62) return true;
    if ($_shopkeeper60 != null && $_shopkeeper60 == $_system63) return true;
    if ($_book61 != null && $_book61 == $_bookstore62) return true;
    if ($_book61 != null && $_book61 == $_system63) return true;
    if ($_bookstore62 != null && $_bookstore62 == $_system63) return true;
    return invalid_;
  }

  public $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ combine($_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ other_) {
    $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ result_ = new $_add_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, null, null, null, my_specification_);
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

    if ($_book61 == null) {
      result_.$_book61 = other_.$_book61;
    }
    else if (other_.$_book61 == null) {
      result_.$_book61 = $_book61;
    }
    else if($_book61 == other_.$_book61) {
      result_.$_book61 = $_book61;
    }
    else return null;

    if ($_bookstore62 == null) {
      result_.$_bookstore62 = other_.$_bookstore62;
    }
    else if (other_.$_bookstore62 == null) {
      result_.$_bookstore62 = $_bookstore62;
    }
    else if($_bookstore62 == other_.$_bookstore62) {
      result_.$_bookstore62 = $_bookstore62;
    }
    else return null;

    if ($_system63 == null) {
      result_.$_system63 = other_.$_system63;
    }
    else if (other_.$_system63 == null) {
      result_.$_system63 = $_system63;
    }
    else if($_system63 == other_.$_system63) {
      result_.$_system63 = $_system63;
    }
    else return null;

    return result_;
  }
}

class $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$ extends DisCo_action_ {
  Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_56;
  public $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ selected_combination_ = new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "remove_book_to_store";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper5_interface_ $_shopkeeper65 = selected_combination_.$_shopkeeper65;
    $_Book0_interface_ $_book66 = selected_combination_.$_book66;
    $_Bookstore4_interface_ $_bookstore67 = selected_combination_.$_bookstore67;
    $_System3_interface_ $_system68 = selected_combination_.$_system68;
    Parameter_real_ $_now69 = selected_combination_.$_now69;
    return ((((($_book66.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).op_and_(($_book66.get_$_owned_customer32_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_book66.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore67).objectID_)))))).op_and_(($_system68.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper65).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book66) {
    return ($_book66.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book66) {
    return ($_book66.get_$_owned_customer32_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Book0_interface_ $_book66, $_Bookstore4_interface_ $_bookstore67) {
    return ($_book66.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore67).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_4_($_Shopkeeper5_interface_ $_shopkeeper65, $_System3_interface_ $_system68) {
    return ($_system68.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper65).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ combs_ = new Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(my_specification_);
    Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ partial_result_ = new Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book66();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book66 = $$$_one_combination_$$$.$_book66;
      if (partial_guard_1_($_book66)) {
        partial_result_.add_combination_(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, $_book66, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book66();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book66 = $$$_one_combination_$$$.$_book66;
      if (partial_guard_2_($_book66)) {
        partial_result_.add_combination_(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, $_book66, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book66();
    combs_.generate_explicit_combinations_$_bookstore67();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book66 = $$$_one_combination_$$$.$_book66;
      $_Bookstore4_interface_ $_bookstore67 = $$$_one_combination_$$$.$_bookstore67;
      if (partial_guard_3_($_book66, $_bookstore67)) {
        partial_result_.add_combination_(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, $_book66, $_bookstore67, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper65();
    combs_.generate_explicit_combinations_$_system68();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) comb_i_.next();
      $_Shopkeeper5_interface_ $_shopkeeper65 = $$$_one_combination_$$$.$_shopkeeper65;
      $_System3_interface_ $_system68 = $$$_one_combination_$$$.$_system68;
      if (partial_guard_4_($_shopkeeper65, $_system68)) {
        partial_result_.add_combination_(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper65, null, null, $_system68, my_specification_));
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
  public void initialize_execute($_Shopkeeper5_interface_ $_shopkeeper65, $_Book0_interface_ $_book66, $_Bookstore4_interface_ $_bookstore67, $_System3_interface_ $_system68, Parameter_real_ $_now69) throws Assertion_exception_ {
    rhs_56 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Shopkeeper5_interface_ $_shopkeeper65, $_Book0_interface_ $_book66, $_Bookstore4_interface_ $_bookstore67, $_System3_interface_ $_system68, Parameter_real_ $_now69) throws Assertion_exception_ {
    try {
      $_book66.set_$_owned_bookstore31_(rhs_56.get_val_());
      Iterator iEL57 = my_specification_.getEngineListeners_();
      while(iEL57.hasNext()) {
        ((EngineListener)(iEL57.next())).objectStateChanged((DisCo_class_)$_book66);
      }
      my_specification_.rt_.set_omega_($_now69.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper5_interface_ $_shopkeeper65, $_Book0_interface_ $_book66, $_Bookstore4_interface_ $_bookstore67, $_System3_interface_ $_system68, Parameter_real_ $_now69) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper65, $_book66, $_bookstore67, $_system68, $_now69);
    actual_execute($_shopkeeper65, $_book66, $_bookstore67, $_system68, $_now69);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action remove_book_to_store(Shopkeeper, Book, Bookstore, System)");
    eval_guard_();
    selected_combination_ = new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(my_specification_);
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
      vd_ = new Value_description_(selected_combination_.$_now69.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now69.realval = value.realval;
      selected_combination_.$_now69.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action remove_book_to_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now69 = new Parameter_real_();
      selected_combination_.$_now69.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action remove_book_to_store(Shopkeeper, Book, Bookstore, System)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for remove_book_to_store(Shopkeeper, Book, Bookstore, System) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper65 != null, "Participant $_shopkeeper65 == null");
    new Assertion(selected_combination_.$_book66 != null, "Participant $_book66 == null");
    new Assertion(selected_combination_.$_bookstore67 != null, "Participant $_bookstore67 == null");
    new Assertion(selected_combination_.$_system68 != null, "Participant $_system68 == null");
    $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action remove_book_to_store(Shopkeeper, Book, Bookstore, System) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_shopkeeper65, selected_combination_.$_book66, selected_combination_.$_bookstore67, selected_combination_.$_system68, selected_combination_.$_now69);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper65 = ($_Shopkeeper5_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book66 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore67 = ($_Bookstore4_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_system68 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper65;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book66;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore67;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_system68;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb_ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now69.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action remove_book_to_store(Shopkeeper, Book, Bookstore, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper65() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper65 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper65() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book66() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book66 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book66() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore67() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore67 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore67() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system68() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system68 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system68() );
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
      tmp_combinations.addAll((($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper65());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book66());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore67());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system68());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_ccc_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper65 != null && (($_Shopkeeper5) (comb.$_shopkeeper65)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper65)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book66 != null && (($_Book0) (comb.$_book66)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book66)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore67 != null && (($_Bookstore4) (comb.$_bookstore67)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore67)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system68 != null && (($_System3) (comb.$_system68)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system68)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ pick_actual_parameters_($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) (iter.next());
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
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_  comb_to_add_ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb_to_add_ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ combine(Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ other_) {
    Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_ result = new Combinations_$_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ mycomb = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ otherscomb = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) otherselems.next();
        $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ c = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper5_interface_ $_shopkeeper65 = null;
  $_Book0_interface_ $_book66 = null;
  $_Bookstore4_interface_ $_bookstore67 = null;
  $_System3_interface_ $_system68 = null;
  Parameter_real_ $_now69 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_Shopkeeper5_interface_ $_shopkeeper65, $_Book0_interface_ $_book66, $_Bookstore4_interface_ $_bookstore67, $_System3_interface_ $_system68, DisCo_specification_ my_specification) {
    this.$_shopkeeper65 = $_shopkeeper65;
    this.$_book66 = $_book66;
    this.$_bookstore67 = $_bookstore67;
    this.$_system68 = $_system68;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now69);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ $$$_other_$$$ = ($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper65 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper65);
    DisCo_class_ $$_other_$_book66 = ((DisCo_class_) $$$_other_$$$.$_book66);
    DisCo_class_ $$_other_$_bookstore67 = ((DisCo_class_) $$$_other_$$$.$_bookstore67);
    DisCo_class_ $$_other_$_system68 = ((DisCo_class_) $$$_other_$$$.$_system68);
    if($_shopkeeper65 == null && $$_other_$_shopkeeper65 != null){
      return -1;
    }
    if($_shopkeeper65 != null && $$_other_$_shopkeeper65 == null){
      return 1;
    }
    if($_shopkeeper65 != null && $$_other_$_shopkeeper65!= null && ((DisCo_class_) $_shopkeeper65).objectID_ != $$_other_$_shopkeeper65.objectID_){
      return ((DisCo_class_) $_shopkeeper65).objectID_ - $$_other_$_shopkeeper65.objectID_;
    }
    if($_book66 == null && $$_other_$_book66 != null){
      return -1;
    }
    if($_book66 != null && $$_other_$_book66 == null){
      return 1;
    }
    if($_book66 != null && $$_other_$_book66!= null && ((DisCo_class_) $_book66).objectID_ != $$_other_$_book66.objectID_){
      return ((DisCo_class_) $_book66).objectID_ - $$_other_$_book66.objectID_;
    }
    if($_bookstore67 == null && $$_other_$_bookstore67 != null){
      return -1;
    }
    if($_bookstore67 != null && $$_other_$_bookstore67 == null){
      return 1;
    }
    if($_bookstore67 != null && $$_other_$_bookstore67!= null && ((DisCo_class_) $_bookstore67).objectID_ != $$_other_$_bookstore67.objectID_){
      return ((DisCo_class_) $_bookstore67).objectID_ - $$_other_$_bookstore67.objectID_;
    }
    if($_system68 == null && $$_other_$_system68 != null){
      return -1;
    }
    if($_system68 != null && $$_other_$_system68 == null){
      return 1;
    }
    if($_system68 != null && $$_other_$_system68!= null && ((DisCo_class_) $_system68).objectID_ != $$_other_$_system68.objectID_){
      return ((DisCo_class_) $_system68).objectID_ - $$_other_$_system68.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper65() {
    Vector ret = new Vector();
    if($_shopkeeper65 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(($_Shopkeeper5_interface_)iter_.nextElement(), $_book66, $_bookstore67, $_system68, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book66() {
    Vector ret = new Vector();
    if($_book66 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper65, ($_Book0_interface_)iter_.nextElement(), $_bookstore67, $_system68, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore67() {
    Vector ret = new Vector();
    if($_bookstore67 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper65, $_book66, ($_Bookstore4_interface_)iter_.nextElement(), $_system68, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system68() {
    Vector ret = new Vector();
    if($_system68 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper65, $_book66, $_bookstore67, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper65 == null ? "<any>" : $_shopkeeper65.toString()) + ", "
       + "book=" + ($_book66 == null ? "<any>" : $_book66.toString()) + ", "
       + "bookstore=" + ($_bookstore67 == null ? "<any>" : $_bookstore67.toString()) + ", "
       + "system=" + ($_system68 == null ? "<any>" : $_system68.toString()) + ", "
       + "now=" + ($_now69 == null ? "<any>" : $_now69.toString()) + ", ");
  }

  public boolean equal_participants_($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ trial) {
    return $_shopkeeper65 != null && $_shopkeeper65 == trial.$_shopkeeper65  && $_book66 != null && $_book66 == trial.$_book66  && $_bookstore67 != null && $_bookstore67 == trial.$_bookstore67  && $_system68 != null && $_system68 == trial.$_system68 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper65);
    result_.addElement($_book66);
    result_.addElement($_bookstore67);
    result_.addElement($_system68);
    return result_;
  }

  public $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ clone_() {
    return new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_($_shopkeeper65, $_book66, $_bookstore67, $_system68, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper65 != null && $_shopkeeper65 == $_book66) return true;
    if ($_shopkeeper65 != null && $_shopkeeper65 == $_bookstore67) return true;
    if ($_shopkeeper65 != null && $_shopkeeper65 == $_system68) return true;
    if ($_book66 != null && $_book66 == $_bookstore67) return true;
    if ($_book66 != null && $_book66 == $_system68) return true;
    if ($_bookstore67 != null && $_bookstore67 == $_system68) return true;
    return invalid_;
  }

  public $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ combine($_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ other_) {
    $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_ result_ = new $_remove_book_to_store$$$_Shopkeeper5$$$_Book0$$$_Bookstore4$$$_System3$$_combination_(null, null, null, null, my_specification_);
    if ($_shopkeeper65 == null) {
      result_.$_shopkeeper65 = other_.$_shopkeeper65;
    }
    else if (other_.$_shopkeeper65 == null) {
      result_.$_shopkeeper65 = $_shopkeeper65;
    }
    else if($_shopkeeper65 == other_.$_shopkeeper65) {
      result_.$_shopkeeper65 = $_shopkeeper65;
    }
    else return null;

    if ($_book66 == null) {
      result_.$_book66 = other_.$_book66;
    }
    else if (other_.$_book66 == null) {
      result_.$_book66 = $_book66;
    }
    else if($_book66 == other_.$_book66) {
      result_.$_book66 = $_book66;
    }
    else return null;

    if ($_bookstore67 == null) {
      result_.$_bookstore67 = other_.$_bookstore67;
    }
    else if (other_.$_bookstore67 == null) {
      result_.$_bookstore67 = $_bookstore67;
    }
    else if($_bookstore67 == other_.$_bookstore67) {
      result_.$_bookstore67 = $_bookstore67;
    }
    else return null;

    if ($_system68 == null) {
      result_.$_system68 = other_.$_system68;
    }
    else if (other_.$_system68 == null) {
      result_.$_system68 = $_system68;
    }
    else if($_system68 == other_.$_system68) {
      result_.$_system68 = $_system68;
    }
    else return null;

    return result_;
  }
}

class $_login_customer$$$_Customer2$$$_System3$$ extends DisCo_action_ {
  Combinations_$_login_customer$$$_Customer2$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_58;
  public $_login_customer$$$_Customer2$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_login_customer$$$_Customer2$$$_System3$$_combination_ selected_combination_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "login_customer";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_customer70 = selected_combination_.$_customer70;
    $_System3_interface_ $_system71 = selected_combination_.$_system71;
    Parameter_real_ $_now72 = selected_combination_.$_now72;
    return (((($_system71.get_$_active_customer22_().op_eq_((new DisCo_int_(-1)))).op_and_(($_system71.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system71.get_$_active_admin24_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system71) {
    return ($_system71.get_$_active_customer22_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_System3_interface_ $_system71) {
    return ($_system71.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_System3_interface_ $_system71) {
    return ($_system71.get_$_active_admin24_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_login_customer$$$_Customer2$$$_System3$$_ combs_ = new Combinations_$_login_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Combinations_$_login_customer$$$_Customer2$$$_System3$$_ partial_result_ = new Combinations_$_login_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system71();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system71 = $$$_one_combination_$$$.$_system71;
      if (partial_guard_1_($_system71)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, $_system71, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system71();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system71 = $$$_one_combination_$$$.$_system71;
      if (partial_guard_2_($_system71)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, $_system71, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system71();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system71 = $$$_one_combination_$$$.$_system71;
      if (partial_guard_3_($_system71)) {
        partial_result_.add_combination_(new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, $_system71, my_specification_));
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
    rhs_58 = (new DisCo_int_(((DisCo_class_)$_customer70).objectID_));
  }

  public void actual_execute($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71, Parameter_real_ $_now72) throws Assertion_exception_ {
    try {
      $_system71.set_$_active_customer22_(rhs_58.get_val_());
      Iterator iEL59 = my_specification_.getEngineListeners_();
      while(iEL59.hasNext()) {
        ((EngineListener)(iEL59.next())).objectStateChanged((DisCo_class_)$_system71);
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
      my_specification_.debug_("Setting actual parameter now for action login_customer(Customer, System)");
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
    new Assertion(selected_combination_.$_customer70 != null, "Participant $_customer70 == null");
    new Assertion(selected_combination_.$_system71 != null, "Participant $_system71 == null");
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
    selected_combination_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_login_customer$$$_Customer2$$$_System3$$_combination_ comb_ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now72.setValue()) {
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

  public void generate_explicit_combinations_$_customer70() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
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
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
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
      tmp_combinations.addAll((($_login_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer70());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system71());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_login_customer$$$_Customer2$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
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
  $_Customer2_interface_ $_customer70 = null;
  $_System3_interface_ $_system71 = null;
  Parameter_real_ $_now72 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_login_customer$$$_Customer2$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_($_Customer2_interface_ $_customer70, $_System3_interface_ $_system71, DisCo_specification_ my_specification) {
    this.$_customer70 = $_customer70;
    this.$_system71 = $_system71;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now72);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_login_customer$$$_Customer2$$$_System3$$_combination_ $$$_other_$$$ = ($_login_customer$$$_Customer2$$$_System3$$_combination_)o;
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
        ret.add(new $_login_customer$$$_Customer2$$$_System3$$_combination_(($_Customer2_interface_)iter_.nextElement(), $_system71, my_specification_));
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
        ret.add(new $_login_customer$$$_Customer2$$$_System3$$_combination_($_customer70, ($_System3_interface_)iter_.nextElement(), my_specification_));
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

  public boolean equal_participants_($_login_customer$$$_Customer2$$$_System3$$_combination_ trial) {
    return $_customer70 != null && $_customer70 == trial.$_customer70  && $_system71 != null && $_system71 == trial.$_system71 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_customer70);
    result_.addElement($_system71);
    return result_;
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_ clone_() {
    return new $_login_customer$$$_Customer2$$$_System3$$_combination_($_customer70, $_system71, my_specification_);
  }

  public boolean invalid_() {
    if ($_customer70 != null && $_customer70 == $_system71) return true;
    return invalid_;
  }

  public $_login_customer$$$_Customer2$$$_System3$$_combination_ combine($_login_customer$$$_Customer2$$$_System3$$_combination_ other_) {
    $_login_customer$$$_Customer2$$$_System3$$_combination_ result_ = new $_login_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
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

class $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$ extends DisCo_action_ {
  Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_60;
  public $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ selected_combination_ = new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "login_shopkeeper";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper5_interface_ $_shopkeeper73 = selected_combination_.$_shopkeeper73;
    $_System3_interface_ $_system74 = selected_combination_.$_system74;
    Parameter_real_ $_now75 = selected_combination_.$_now75;
    return (((($_system74.get_$_active_customer22_().op_eq_((new DisCo_int_(-1)))).op_and_(($_system74.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system74.get_$_active_admin24_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system74) {
    return ($_system74.get_$_active_customer22_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_System3_interface_ $_system74) {
    return ($_system74.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_System3_interface_ $_system74) {
    return ($_system74.get_$_active_admin24_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ combs_ = new Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_(my_specification_);
    Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ partial_result_ = new Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system74();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system74 = $$$_one_combination_$$$.$_system74;
      if (partial_guard_1_($_system74)) {
        partial_result_.add_combination_(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, $_system74, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system74();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system74 = $$$_one_combination_$$$.$_system74;
      if (partial_guard_2_($_system74)) {
        partial_result_.add_combination_(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, $_system74, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system74();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system74 = $$$_one_combination_$$$.$_system74;
      if (partial_guard_3_($_system74)) {
        partial_result_.add_combination_(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, $_system74, my_specification_));
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
  public void initialize_execute($_Shopkeeper5_interface_ $_shopkeeper73, $_System3_interface_ $_system74, Parameter_real_ $_now75) throws Assertion_exception_ {
    rhs_60 = (new DisCo_int_(((DisCo_class_)$_shopkeeper73).objectID_));
  }

  public void actual_execute($_Shopkeeper5_interface_ $_shopkeeper73, $_System3_interface_ $_system74, Parameter_real_ $_now75) throws Assertion_exception_ {
    try {
      $_system74.set_$_active_shopkeeper23_(rhs_60.get_val_());
      Iterator iEL61 = my_specification_.getEngineListeners_();
      while(iEL61.hasNext()) {
        ((EngineListener)(iEL61.next())).objectStateChanged((DisCo_class_)$_system74);
      }
      my_specification_.rt_.set_omega_($_now75.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper5_interface_ $_shopkeeper73, $_System3_interface_ $_system74, Parameter_real_ $_now75) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper73, $_system74, $_now75);
    actual_execute($_shopkeeper73, $_system74, $_now75);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action login_shopkeeper(Shopkeeper, System)");
    eval_guard_();
    selected_combination_ = new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(my_specification_);
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
      my_specification_.debug_("Setting actual parameter now for action login_shopkeeper(Shopkeeper, System)");
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
    selected_combination_ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper73 != null, "Participant $_shopkeeper73 == null");
    new Assertion(selected_combination_.$_system74 != null, "Participant $_system74 == null");
    $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    execute(selected_combination_.$_shopkeeper73, selected_combination_.$_system74, selected_combination_.$_now75);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper73 = ($_Shopkeeper5_interface_) obj_;
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
    selected_combination_ = new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb_ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now75.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action login_shopkeeper(Shopkeeper, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper73() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
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
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
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
      tmp_combinations.addAll((($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper73());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system74());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper73 != null && (($_Shopkeeper5) (comb.$_shopkeeper73)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper73)).objectID_){
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
      (($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ pick_actual_parameters_($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) (iter.next());
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
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_  comb_to_add_ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb_to_add_ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ combine(Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ other_) {
    Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_ result = new Combinations_$_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ mycomb = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ otherscomb = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) otherselems.next();
        $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ c = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper5_interface_ $_shopkeeper73 = null;
  $_System3_interface_ $_system74 = null;
  Parameter_real_ $_now75 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_Shopkeeper5_interface_ $_shopkeeper73, $_System3_interface_ $_system74, DisCo_specification_ my_specification) {
    this.$_shopkeeper73 = $_shopkeeper73;
    this.$_system74 = $_system74;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now75);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_other_$$$ = ($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_)o;
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
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(($_Shopkeeper5_interface_)iter_.nextElement(), $_system74, my_specification_));
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
        ret.add(new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_shopkeeper73, ($_System3_interface_)iter_.nextElement(), my_specification_));
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

  public boolean equal_participants_($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ trial) {
    return $_shopkeeper73 != null && $_shopkeeper73 == trial.$_shopkeeper73  && $_system74 != null && $_system74 == trial.$_system74 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper73);
    result_.addElement($_system74);
    return result_;
  }

  public $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ clone_() {
    return new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_shopkeeper73, $_system74, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper73 != null && $_shopkeeper73 == $_system74) return true;
    return invalid_;
  }

  public $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ combine($_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ other_) {
    $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ result_ = new $_login_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, null, my_specification_);
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

class $_login_admin$$$_Admin6$$$_System3$$ extends DisCo_action_ {
  Combinations_$_login_admin$$$_Admin6$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_62;
  public $_login_admin$$$_Admin6$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_login_admin$$$_Admin6$$$_System3$$_combination_ selected_combination_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "login_admin";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Admin6_interface_ $_admin76 = selected_combination_.$_admin76;
    $_System3_interface_ $_system77 = selected_combination_.$_system77;
    Parameter_real_ $_now78 = selected_combination_.$_now78;
    return (((($_system77.get_$_active_customer22_().op_eq_((new DisCo_int_(-1)))).op_and_(($_system77.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(-1)))))).op_and_(($_system77.get_$_active_admin24_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system77) {
    return ($_system77.get_$_active_customer22_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_System3_interface_ $_system77) {
    return ($_system77.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_System3_interface_ $_system77) {
    return ($_system77.get_$_active_admin24_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_login_admin$$$_Admin6$$$_System3$$_ combs_ = new Combinations_$_login_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Combinations_$_login_admin$$$_Admin6$$$_System3$$_ partial_result_ = new Combinations_$_login_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system77();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system77 = $$$_one_combination_$$$.$_system77;
      if (partial_guard_1_($_system77)) {
        partial_result_.add_combination_(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, $_system77, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system77();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system77 = $$$_one_combination_$$$.$_system77;
      if (partial_guard_2_($_system77)) {
        partial_result_.add_combination_(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, $_system77, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system77();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_System3_interface_ $_system77 = $$$_one_combination_$$$.$_system77;
      if (partial_guard_3_($_system77)) {
        partial_result_.add_combination_(new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, $_system77, my_specification_));
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
    rhs_62 = (new DisCo_int_(((DisCo_class_)$_admin76).objectID_));
  }

  public void actual_execute($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77, Parameter_real_ $_now78) throws Assertion_exception_ {
    try {
      $_system77.set_$_active_admin24_(rhs_62.get_val_());
      Iterator iEL63 = my_specification_.getEngineListeners_();
      while(iEL63.hasNext()) {
        ((EngineListener)(iEL63.next())).objectStateChanged((DisCo_class_)$_system77);
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
      my_specification_.debug_("Setting actual parameter now for action login_admin(Admin, System)");
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
    new Assertion(selected_combination_.$_admin76 != null, "Participant $_admin76 == null");
    new Assertion(selected_combination_.$_system77 != null, "Participant $_system77 == null");
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
    selected_combination_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_login_admin$$$_Admin6$$$_System3$$_combination_ comb_ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now78.setValue()) {
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

  public void generate_explicit_combinations_$_admin76() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
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
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
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
      tmp_combinations.addAll((($_login_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin76());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_login_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system77());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_login_admin$$$_Admin6$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
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
  $_Admin6_interface_ $_admin76 = null;
  $_System3_interface_ $_system77 = null;
  Parameter_real_ $_now78 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_login_admin$$$_Admin6$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_($_Admin6_interface_ $_admin76, $_System3_interface_ $_system77, DisCo_specification_ my_specification) {
    this.$_admin76 = $_admin76;
    this.$_system77 = $_system77;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now78);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_login_admin$$$_Admin6$$$_System3$$_combination_ $$$_other_$$$ = ($_login_admin$$$_Admin6$$$_System3$$_combination_)o;
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
        ret.add(new $_login_admin$$$_Admin6$$$_System3$$_combination_(($_Admin6_interface_)iter_.nextElement(), $_system77, my_specification_));
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
        ret.add(new $_login_admin$$$_Admin6$$$_System3$$_combination_($_admin76, ($_System3_interface_)iter_.nextElement(), my_specification_));
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

  public boolean equal_participants_($_login_admin$$$_Admin6$$$_System3$$_combination_ trial) {
    return $_admin76 != null && $_admin76 == trial.$_admin76  && $_system77 != null && $_system77 == trial.$_system77 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_admin76);
    result_.addElement($_system77);
    return result_;
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_ clone_() {
    return new $_login_admin$$$_Admin6$$$_System3$$_combination_($_admin76, $_system77, my_specification_);
  }

  public boolean invalid_() {
    if ($_admin76 != null && $_admin76 == $_system77) return true;
    return invalid_;
  }

  public $_login_admin$$$_Admin6$$$_System3$$_combination_ combine($_login_admin$$$_Admin6$$$_System3$$_combination_ other_) {
    $_login_admin$$$_Admin6$$$_System3$$_combination_ result_ = new $_login_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
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

class $_logout_customer$$$_Customer2$$$_System3$$ extends DisCo_action_ {
  Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_64;
  DisCo_int_ rhs_65;
  public $_logout_customer$$$_Customer2$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_logout_customer$$$_Customer2$$$_System3$$_combination_ selected_combination_ = new $_logout_customer$$$_Customer2$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "logout_customer";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Customer2_interface_ $_customer79 = selected_combination_.$_customer79;
    $_System3_interface_ $_system80 = selected_combination_.$_system80;
    Parameter_real_ $_now81 = selected_combination_.$_now81;
    return (($_system80.get_$_active_customer22_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer79).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Customer2_interface_ $_customer79, $_System3_interface_ $_system80) {
    return ($_system80.get_$_active_customer22_().op_eq_((new DisCo_int_(((DisCo_class_)$_customer79).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ combs_ = new Combinations_$_logout_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Combinations_$_logout_customer$$$_Customer2$$$_System3$$_ partial_result_ = new Combinations_$_logout_customer$$$_Customer2$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_customer79();
    combs_.generate_explicit_combinations_$_system80();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) comb_i_.next();
      $_Customer2_interface_ $_customer79 = $$$_one_combination_$$$.$_customer79;
      $_System3_interface_ $_system80 = $$$_one_combination_$$$.$_system80;
      if (partial_guard_1_($_customer79, $_system80)) {
        partial_result_.add_combination_(new $_logout_customer$$$_Customer2$$$_System3$$_combination_($_customer79, $_system80, my_specification_));
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
  public void initialize_execute($_Customer2_interface_ $_customer79, $_System3_interface_ $_system80, Parameter_real_ $_now81) throws Assertion_exception_ {
    rhs_64 = (new DisCo_int_(-1));
    rhs_65 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Customer2_interface_ $_customer79, $_System3_interface_ $_system80, Parameter_real_ $_now81) throws Assertion_exception_ {
    try {
      $_system80.set_$_active_customer22_(rhs_64.get_val_());
      Iterator iEL66 = my_specification_.getEngineListeners_();
      while(iEL66.hasNext()) {
        ((EngineListener)(iEL66.next())).objectStateChanged((DisCo_class_)$_system80);
      }
      $_customer79.set_$_browsing_currently35_(rhs_65.get_val_());
      Iterator iEL67 = my_specification_.getEngineListeners_();
      while(iEL67.hasNext()) {
        ((EngineListener)(iEL67.next())).objectStateChanged((DisCo_class_)$_customer79);
      }
      my_specification_.rt_.set_omega_($_now81.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Customer2_interface_ $_customer79, $_System3_interface_ $_system80, Parameter_real_ $_now81) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_customer79, $_system80, $_now81);
    actual_execute($_customer79, $_system80, $_now81);
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
      vd_ = new Value_description_(selected_combination_.$_now81.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now81.realval = value.realval;
      selected_combination_.$_now81.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action logout_customer(Customer, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now81 = new Parameter_real_();
      selected_combination_.$_now81.set_by_user_ = false;
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
    new Assertion(selected_combination_.$_customer79 != null, "Participant $_customer79 == null");
    new Assertion(selected_combination_.$_system80 != null, "Participant $_system80 == null");
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
    execute(selected_combination_.$_customer79, selected_combination_.$_system80, selected_combination_.$_now81);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_customer79 = ($_Customer2_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system80 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_customer79;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system80;
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
      if (!comb_.$_now81.setValue()) {
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

  public void generate_explicit_combinations_$_customer79() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer79 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer79() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system80() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system80 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system80() );
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
      tmp_combinations.addAll((($_logout_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer79());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_customer$$$_Customer2$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system80());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_logout_customer$$$_Customer2$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_) iter.next();
      if(comb.$_customer79 != null && (($_Customer2) (comb.$_customer79)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer79)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system80 != null && (($_System3) (comb.$_system80)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system80)).objectID_){
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
  $_Customer2_interface_ $_customer79 = null;
  $_System3_interface_ $_system80 = null;
  Parameter_real_ $_now81 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_($_Customer2_interface_ $_customer79, $_System3_interface_ $_system80, DisCo_specification_ my_specification) {
    this.$_customer79 = $_customer79;
    this.$_system80 = $_system80;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now81);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_logout_customer$$$_Customer2$$$_System3$$_combination_ $$$_other_$$$ = ($_logout_customer$$$_Customer2$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_customer79 = ((DisCo_class_) $$$_other_$$$.$_customer79);
    DisCo_class_ $$_other_$_system80 = ((DisCo_class_) $$$_other_$$$.$_system80);
    if($_customer79 == null && $$_other_$_customer79 != null){
      return -1;
    }
    if($_customer79 != null && $$_other_$_customer79 == null){
      return 1;
    }
    if($_customer79 != null && $$_other_$_customer79!= null && ((DisCo_class_) $_customer79).objectID_ != $$_other_$_customer79.objectID_){
      return ((DisCo_class_) $_customer79).objectID_ - $$_other_$_customer79.objectID_;
    }
    if($_system80 == null && $$_other_$_system80 != null){
      return -1;
    }
    if($_system80 != null && $$_other_$_system80 == null){
      return 1;
    }
    if($_system80 != null && $$_other_$_system80!= null && ((DisCo_class_) $_system80).objectID_ != $$_other_$_system80.objectID_){
      return ((DisCo_class_) $_system80).objectID_ - $$_other_$_system80.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_customer79() {
    Vector ret = new Vector();
    if($_customer79 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_customer$$$_Customer2$$$_System3$$_combination_(($_Customer2_interface_)iter_.nextElement(), $_system80, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system80() {
    Vector ret = new Vector();
    if($_system80 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_customer$$$_Customer2$$$_System3$$_combination_($_customer79, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "customer=" + ($_customer79 == null ? "<any>" : $_customer79.toString()) + ", "
       + "system=" + ($_system80 == null ? "<any>" : $_system80.toString()) + ", "
       + "now=" + ($_now81 == null ? "<any>" : $_now81.toString()) + ", ");
  }

  public boolean equal_participants_($_logout_customer$$$_Customer2$$$_System3$$_combination_ trial) {
    return $_customer79 != null && $_customer79 == trial.$_customer79  && $_system80 != null && $_system80 == trial.$_system80 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_customer79);
    result_.addElement($_system80);
    return result_;
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_ clone_() {
    return new $_logout_customer$$$_Customer2$$$_System3$$_combination_($_customer79, $_system80, my_specification_);
  }

  public boolean invalid_() {
    if ($_customer79 != null && $_customer79 == $_system80) return true;
    return invalid_;
  }

  public $_logout_customer$$$_Customer2$$$_System3$$_combination_ combine($_logout_customer$$$_Customer2$$$_System3$$_combination_ other_) {
    $_logout_customer$$$_Customer2$$$_System3$$_combination_ result_ = new $_logout_customer$$$_Customer2$$$_System3$$_combination_(null, null, my_specification_);
    if ($_customer79 == null) {
      result_.$_customer79 = other_.$_customer79;
    }
    else if (other_.$_customer79 == null) {
      result_.$_customer79 = $_customer79;
    }
    else if($_customer79 == other_.$_customer79) {
      result_.$_customer79 = $_customer79;
    }
    else return null;

    if ($_system80 == null) {
      result_.$_system80 = other_.$_system80;
    }
    else if (other_.$_system80 == null) {
      result_.$_system80 = $_system80;
    }
    else if($_system80 == other_.$_system80) {
      result_.$_system80 = $_system80;
    }
    else return null;

    return result_;
  }
}

class $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$ extends DisCo_action_ {
  Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_68;
  public $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ selected_combination_ = new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "logout_shopkeeper";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Shopkeeper5_interface_ $_shopkeeper82 = selected_combination_.$_shopkeeper82;
    $_System3_interface_ $_system83 = selected_combination_.$_system83;
    Parameter_real_ $_now84 = selected_combination_.$_now84;
    return (($_system83.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper82).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Shopkeeper5_interface_ $_shopkeeper82, $_System3_interface_ $_system83) {
    return ($_system83.get_$_active_shopkeeper23_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper82).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ combs_ = new Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_(my_specification_);
    Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ partial_result_ = new Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper82();
    combs_.generate_explicit_combinations_$_system83();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) comb_i_.next();
      $_Shopkeeper5_interface_ $_shopkeeper82 = $$$_one_combination_$$$.$_shopkeeper82;
      $_System3_interface_ $_system83 = $$$_one_combination_$$$.$_system83;
      if (partial_guard_1_($_shopkeeper82, $_system83)) {
        partial_result_.add_combination_(new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_shopkeeper82, $_system83, my_specification_));
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
  public void initialize_execute($_Shopkeeper5_interface_ $_shopkeeper82, $_System3_interface_ $_system83, Parameter_real_ $_now84) throws Assertion_exception_ {
    rhs_68 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Shopkeeper5_interface_ $_shopkeeper82, $_System3_interface_ $_system83, Parameter_real_ $_now84) throws Assertion_exception_ {
    try {
      $_system83.set_$_active_shopkeeper23_(rhs_68.get_val_());
      Iterator iEL69 = my_specification_.getEngineListeners_();
      while(iEL69.hasNext()) {
        ((EngineListener)(iEL69.next())).objectStateChanged((DisCo_class_)$_system83);
      }
      my_specification_.rt_.set_omega_($_now84.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Shopkeeper5_interface_ $_shopkeeper82, $_System3_interface_ $_system83, Parameter_real_ $_now84) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_shopkeeper82, $_system83, $_now84);
    actual_execute($_shopkeeper82, $_system83, $_now84);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action logout_shopkeeper(Shopkeeper, System)");
    eval_guard_();
    selected_combination_ = new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(my_specification_);
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
      vd_ = new Value_description_(selected_combination_.$_now84.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now84.realval = value.realval;
      selected_combination_.$_now84.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action logout_shopkeeper(Shopkeeper, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now84 = new Parameter_real_();
      selected_combination_.$_now84.set_by_user_ = false;
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
    selected_combination_ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_shopkeeper82 != null, "Participant $_shopkeeper82 == null");
    new Assertion(selected_combination_.$_system83 != null, "Participant $_system83 == null");
    $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    execute(selected_combination_.$_shopkeeper82, selected_combination_.$_system83, selected_combination_.$_now84);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_shopkeeper82 = ($_Shopkeeper5_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system83 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_shopkeeper82;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system83;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb_ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if (!comb_.$_now84.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action logout_shopkeeper(Shopkeeper, System)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_shopkeeper82() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper82 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper82() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system83() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system83 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system83() );
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
      tmp_combinations.addAll((($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper82());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system83());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if(comb.$_shopkeeper82 != null && (($_Shopkeeper5) (comb.$_shopkeeper82)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper82)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system83 != null && (($_System3) (comb.$_system83)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system83)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next()).debug_();
    }
  }

  public $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ pick_actual_parameters_($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) (iter.next());
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
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_  comb_to_add_ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb_to_add_ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ combine(Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ other_) {
    Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_ result = new Combinations_$_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ mycomb = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ otherscomb = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) otherselems.next();
        $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ c = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_Shopkeeper5_interface_ $_shopkeeper82 = null;
  $_System3_interface_ $_system83 = null;
  Parameter_real_ $_now84 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_Shopkeeper5_interface_ $_shopkeeper82, $_System3_interface_ $_system83, DisCo_specification_ my_specification) {
    this.$_shopkeeper82 = $_shopkeeper82;
    this.$_system83 = $_system83;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now84);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ $$$_other_$$$ = ($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_shopkeeper82 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper82);
    DisCo_class_ $$_other_$_system83 = ((DisCo_class_) $$$_other_$$$.$_system83);
    if($_shopkeeper82 == null && $$_other_$_shopkeeper82 != null){
      return -1;
    }
    if($_shopkeeper82 != null && $$_other_$_shopkeeper82 == null){
      return 1;
    }
    if($_shopkeeper82 != null && $$_other_$_shopkeeper82!= null && ((DisCo_class_) $_shopkeeper82).objectID_ != $$_other_$_shopkeeper82.objectID_){
      return ((DisCo_class_) $_shopkeeper82).objectID_ - $$_other_$_shopkeeper82.objectID_;
    }
    if($_system83 == null && $$_other_$_system83 != null){
      return -1;
    }
    if($_system83 != null && $$_other_$_system83 == null){
      return 1;
    }
    if($_system83 != null && $$_other_$_system83!= null && ((DisCo_class_) $_system83).objectID_ != $$_other_$_system83.objectID_){
      return ((DisCo_class_) $_system83).objectID_ - $$_other_$_system83.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_shopkeeper82() {
    Vector ret = new Vector();
    if($_shopkeeper82 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(($_Shopkeeper5_interface_)iter_.nextElement(), $_system83, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system83() {
    Vector ret = new Vector();
    if($_system83 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_shopkeeper82, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "shopkeeper=" + ($_shopkeeper82 == null ? "<any>" : $_shopkeeper82.toString()) + ", "
       + "system=" + ($_system83 == null ? "<any>" : $_system83.toString()) + ", "
       + "now=" + ($_now84 == null ? "<any>" : $_now84.toString()) + ", ");
  }

  public boolean equal_participants_($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ trial) {
    return $_shopkeeper82 != null && $_shopkeeper82 == trial.$_shopkeeper82  && $_system83 != null && $_system83 == trial.$_system83 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_shopkeeper82);
    result_.addElement($_system83);
    return result_;
  }

  public $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ clone_() {
    return new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_($_shopkeeper82, $_system83, my_specification_);
  }

  public boolean invalid_() {
    if ($_shopkeeper82 != null && $_shopkeeper82 == $_system83) return true;
    return invalid_;
  }

  public $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ combine($_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ other_) {
    $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_ result_ = new $_logout_shopkeeper$$$_Shopkeeper5$$$_System3$$_combination_(null, null, my_specification_);
    if ($_shopkeeper82 == null) {
      result_.$_shopkeeper82 = other_.$_shopkeeper82;
    }
    else if (other_.$_shopkeeper82 == null) {
      result_.$_shopkeeper82 = $_shopkeeper82;
    }
    else if($_shopkeeper82 == other_.$_shopkeeper82) {
      result_.$_shopkeeper82 = $_shopkeeper82;
    }
    else return null;

    if ($_system83 == null) {
      result_.$_system83 = other_.$_system83;
    }
    else if (other_.$_system83 == null) {
      result_.$_system83 = $_system83;
    }
    else if($_system83 == other_.$_system83) {
      result_.$_system83 = $_system83;
    }
    else return null;

    return result_;
  }
}

class $_logout_admin$$$_Admin6$$$_System3$$ extends DisCo_action_ {
  Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ enabled_for_;

  DisCo_int_ rhs_70;
  public $_logout_admin$$$_Admin6$$$_System3$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_logout_admin$$$_Admin6$$$_System3$$_combination_ selected_combination_ = new $_logout_admin$$$_Admin6$$$_System3$$_combination_(my_specification_);
  public String get_name_() {
    return "logout_admin";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_Admin6_interface_ $_admin85 = selected_combination_.$_admin85;
    $_System3_interface_ $_system86 = selected_combination_.$_system86;
    Parameter_real_ $_now87 = selected_combination_.$_now87;
    return (($_system86.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin85).objectID_))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Admin6_interface_ $_admin85, $_System3_interface_ $_system86) {
    return ($_system86.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin85).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ combs_ = new Combinations_$_logout_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Combinations_$_logout_admin$$$_Admin6$$$_System3$$_ partial_result_ = new Combinations_$_logout_admin$$$_Admin6$$$_System3$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_admin85();
    combs_.generate_explicit_combinations_$_system86();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_one_combination_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) comb_i_.next();
      $_Admin6_interface_ $_admin85 = $$$_one_combination_$$$.$_admin85;
      $_System3_interface_ $_system86 = $$$_one_combination_$$$.$_system86;
      if (partial_guard_1_($_admin85, $_system86)) {
        partial_result_.add_combination_(new $_logout_admin$$$_Admin6$$$_System3$$_combination_($_admin85, $_system86, my_specification_));
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
  public void initialize_execute($_Admin6_interface_ $_admin85, $_System3_interface_ $_system86, Parameter_real_ $_now87) throws Assertion_exception_ {
    rhs_70 = (new DisCo_int_(-1));
  }

  public void actual_execute($_Admin6_interface_ $_admin85, $_System3_interface_ $_system86, Parameter_real_ $_now87) throws Assertion_exception_ {
    try {
      $_system86.set_$_active_admin24_(rhs_70.get_val_());
      Iterator iEL71 = my_specification_.getEngineListeners_();
      while(iEL71.hasNext()) {
        ((EngineListener)(iEL71.next())).objectStateChanged((DisCo_class_)$_system86);
      }
      my_specification_.rt_.set_omega_($_now87.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_Admin6_interface_ $_admin85, $_System3_interface_ $_system86, Parameter_real_ $_now87) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_admin85, $_system86, $_now87);
    actual_execute($_admin85, $_system86, $_now87);
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
      vd_ = new Value_description_(selected_combination_.$_now87.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 2){
      selected_combination_.$_now87.realval = value.realval;
      selected_combination_.$_now87.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action logout_admin(Admin, System)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 2){
      selected_combination_.$_now87 = new Parameter_real_();
      selected_combination_.$_now87.set_by_user_ = false;
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
    new Assertion(selected_combination_.$_admin85 != null, "Participant $_admin85 == null");
    new Assertion(selected_combination_.$_system86 != null, "Participant $_system86 == null");
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
    execute(selected_combination_.$_admin85, selected_combination_.$_system86, selected_combination_.$_now87);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_admin85 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_system86 = ($_System3_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_admin85;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_system86;
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
      if (!comb_.$_now87.setValue()) {
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

  public void generate_explicit_combinations_$_admin85() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin85 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin85() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_system86() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system86 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system86() );
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
      tmp_combinations.addAll((($_logout_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin85());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_logout_admin$$$_Admin6$$$_System3$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system86());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_logout_admin$$$_Admin6$$$_System3$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_ccc_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_) iter.next();
      if(comb.$_admin85 != null && (($_Admin6) (comb.$_admin85)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin85)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_system86 != null && (($_System3) (comb.$_system86)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system86)).objectID_){
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
  $_Admin6_interface_ $_admin85 = null;
  $_System3_interface_ $_system86 = null;
  Parameter_real_ $_now87 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_($_Admin6_interface_ $_admin85, $_System3_interface_ $_system86, DisCo_specification_ my_specification) {
    this.$_admin85 = $_admin85;
    this.$_system86 = $_system86;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now87);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_logout_admin$$$_Admin6$$$_System3$$_combination_ $$$_other_$$$ = ($_logout_admin$$$_Admin6$$$_System3$$_combination_)o;
    DisCo_class_ $$_other_$_admin85 = ((DisCo_class_) $$$_other_$$$.$_admin85);
    DisCo_class_ $$_other_$_system86 = ((DisCo_class_) $$$_other_$$$.$_system86);
    if($_admin85 == null && $$_other_$_admin85 != null){
      return -1;
    }
    if($_admin85 != null && $$_other_$_admin85 == null){
      return 1;
    }
    if($_admin85 != null && $$_other_$_admin85!= null && ((DisCo_class_) $_admin85).objectID_ != $$_other_$_admin85.objectID_){
      return ((DisCo_class_) $_admin85).objectID_ - $$_other_$_admin85.objectID_;
    }
    if($_system86 == null && $$_other_$_system86 != null){
      return -1;
    }
    if($_system86 != null && $$_other_$_system86 == null){
      return 1;
    }
    if($_system86 != null && $$_other_$_system86!= null && ((DisCo_class_) $_system86).objectID_ != $$_other_$_system86.objectID_){
      return ((DisCo_class_) $_system86).objectID_ - $$_other_$_system86.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_admin85() {
    Vector ret = new Vector();
    if($_admin85 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_admin$$$_Admin6$$$_System3$$_combination_(($_Admin6_interface_)iter_.nextElement(), $_system86, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_system86() {
    Vector ret = new Vector();
    if($_system86 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_logout_admin$$$_Admin6$$$_System3$$_combination_($_admin85, ($_System3_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "admin=" + ($_admin85 == null ? "<any>" : $_admin85.toString()) + ", "
       + "system=" + ($_system86 == null ? "<any>" : $_system86.toString()) + ", "
       + "now=" + ($_now87 == null ? "<any>" : $_now87.toString()) + ", ");
  }

  public boolean equal_participants_($_logout_admin$$$_Admin6$$$_System3$$_combination_ trial) {
    return $_admin85 != null && $_admin85 == trial.$_admin85  && $_system86 != null && $_system86 == trial.$_system86 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_admin85);
    result_.addElement($_system86);
    return result_;
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_ clone_() {
    return new $_logout_admin$$$_Admin6$$$_System3$$_combination_($_admin85, $_system86, my_specification_);
  }

  public boolean invalid_() {
    if ($_admin85 != null && $_admin85 == $_system86) return true;
    return invalid_;
  }

  public $_logout_admin$$$_Admin6$$$_System3$$_combination_ combine($_logout_admin$$$_Admin6$$$_System3$$_combination_ other_) {
    $_logout_admin$$$_Admin6$$$_System3$$_combination_ result_ = new $_logout_admin$$$_Admin6$$$_System3$$_combination_(null, null, my_specification_);
    if ($_admin85 == null) {
      result_.$_admin85 = other_.$_admin85;
    }
    else if (other_.$_admin85 == null) {
      result_.$_admin85 = $_admin85;
    }
    else if($_admin85 == other_.$_admin85) {
      result_.$_admin85 = $_admin85;
    }
    else return null;

    if ($_system86 == null) {
      result_.$_system86 = other_.$_system86;
    }
    else if (other_.$_system86 == null) {
      result_.$_system86 = $_system86;
    }
    else if($_system86 == other_.$_system86) {
      result_.$_system86 = $_system86;
    }
    else return null;

    return result_;
  }
}

class $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$ extends DisCo_action_ {
  Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ enabled_for_;

  $_yes21_interface_ rhs_72;
  DisCo_int_ rhs_73;
  public $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ selected_combination_ = new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(my_specification_);
  public String get_name_() {
    return "admin_register_shopkeeper";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_System3_interface_ $_system88 = selected_combination_.$_system88;
    $_Admin6_interface_ $_admin89 = selected_combination_.$_admin89;
    $_Shopkeeper5_interface_ $_shopkeeper90 = selected_combination_.$_shopkeeper90;
    $_Bookstore4_interface_ $_bookstore91 = selected_combination_.$_bookstore91;
    Parameter_real_ $_now92 = selected_combination_.$_now92;
    return ((($_system88.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin89).objectID_)))).op_and_(new DisCo_bool_($_shopkeeper90.get_$_registed37_() instanceof $_Shopkeeper5.$_no20)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system88, $_Admin6_interface_ $_admin89) {
    return ($_system88.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin89).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Shopkeeper5_interface_ $_shopkeeper90) {
    return new DisCo_bool_($_shopkeeper90.get_$_registed37_() instanceof $_Shopkeeper5.$_no20).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ combs_ = new Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);
    Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ partial_result_ = new Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system88();
    combs_.generate_explicit_combinations_$_admin89();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_System3_interface_ $_system88 = $$$_one_combination_$$$.$_system88;
      $_Admin6_interface_ $_admin89 = $$$_one_combination_$$$.$_admin89;
      if (partial_guard_1_($_system88, $_admin89)) {
        partial_result_.add_combination_(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system88, $_admin89, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper90();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Shopkeeper5_interface_ $_shopkeeper90 = $$$_one_combination_$$$.$_shopkeeper90;
      if (partial_guard_2_($_shopkeeper90)) {
        partial_result_.add_combination_(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, $_shopkeeper90, null, my_specification_));
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
  public void initialize_execute($_System3_interface_ $_system88, $_Admin6_interface_ $_admin89, $_Shopkeeper5_interface_ $_shopkeeper90, $_Bookstore4_interface_ $_bookstore91, Parameter_real_ $_now92) throws Assertion_exception_ {
    rhs_72 = new $_Shopkeeper5.$_yes21();
    rhs_73 = (new DisCo_int_(((DisCo_class_)$_shopkeeper90).objectID_));
  }

  public void actual_execute($_System3_interface_ $_system88, $_Admin6_interface_ $_admin89, $_Shopkeeper5_interface_ $_shopkeeper90, $_Bookstore4_interface_ $_bookstore91, Parameter_real_ $_now92) throws Assertion_exception_ {
    try {
      $_shopkeeper90.set_$_registed37_((DisCo_type_) rhs_72);
      Iterator iEL74 = my_specification_.getEngineListeners_();
      while(iEL74.hasNext()) {
        ((EngineListener)(iEL74.next())).objectStateChanged((DisCo_class_)$_shopkeeper90);
      }
      $_bookstore91.set_$_owner25_(rhs_73.get_val_());
      Iterator iEL75 = my_specification_.getEngineListeners_();
      while(iEL75.hasNext()) {
        ((EngineListener)(iEL75.next())).objectStateChanged((DisCo_class_)$_bookstore91);
      }
      my_specification_.rt_.set_omega_($_now92.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_System3_interface_ $_system88, $_Admin6_interface_ $_admin89, $_Shopkeeper5_interface_ $_shopkeeper90, $_Bookstore4_interface_ $_bookstore91, Parameter_real_ $_now92) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_system88, $_admin89, $_shopkeeper90, $_bookstore91, $_now92);
    actual_execute($_system88, $_admin89, $_shopkeeper90, $_bookstore91, $_now92);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action admin_register_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("system", "System"));
    result_.addElement(new Name_type_pair_("admin", "Admin"));
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now92.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now92.realval = value.realval;
      selected_combination_.$_now92.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action admin_register_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now92 = new Parameter_real_();
      selected_combination_.$_now92.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action admin_register_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for admin_register_shopkeeper(System, Admin, Shopkeeper, Bookstore) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_system88 != null, "Participant $_system88 == null");
    new Assertion(selected_combination_.$_admin89 != null, "Participant $_admin89 == null");
    new Assertion(selected_combination_.$_shopkeeper90 != null, "Participant $_shopkeeper90 == null");
    new Assertion(selected_combination_.$_bookstore91 != null, "Participant $_bookstore91 == null");
    $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action admin_register_shopkeeper(System, Admin, Shopkeeper, Bookstore) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_system88, selected_combination_.$_admin89, selected_combination_.$_shopkeeper90, selected_combination_.$_bookstore91, selected_combination_.$_now92);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_system88 = ($_System3_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_admin89 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_shopkeeper90 = ($_Shopkeeper5_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_bookstore91 = ($_Bookstore4_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_system88;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_admin89;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_shopkeeper90;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_bookstore91;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if (!comb_.$_now92.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action admin_register_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_system88() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system88 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system88() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_admin89() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin89 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin89() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_shopkeeper90() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper90 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper90() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore91() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore91 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore91() );
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
      tmp_combinations.addAll((($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system88());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin89());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper90());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore91());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if(comb.$_system88 != null && (($_System3) (comb.$_system88)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system88)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_admin89 != null && (($_Admin6) (comb.$_admin89)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin89)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_shopkeeper90 != null && (($_Shopkeeper5) (comb.$_shopkeeper90)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper90)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore91 != null && (($_Bookstore4) (comb.$_bookstore91)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore91)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next()).debug_();
    }
  }

  public $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ pick_actual_parameters_($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) (iter.next());
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
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_  comb_to_add_ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_to_add_ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ combine(Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ other_) {
    Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ result = new Combinations_$_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ mycomb = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ otherscomb = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) otherselems.next();
        $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ c = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_System3_interface_ $_system88 = null;
  $_Admin6_interface_ $_admin89 = null;
  $_Shopkeeper5_interface_ $_shopkeeper90 = null;
  $_Bookstore4_interface_ $_bookstore91 = null;
  Parameter_real_ $_now92 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_System3_interface_ $_system88, $_Admin6_interface_ $_admin89, $_Shopkeeper5_interface_ $_shopkeeper90, $_Bookstore4_interface_ $_bookstore91, DisCo_specification_ my_specification) {
    this.$_system88 = $_system88;
    this.$_admin89 = $_admin89;
    this.$_shopkeeper90 = $_shopkeeper90;
    this.$_bookstore91 = $_bookstore91;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now92);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_other_$$$ = ($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)o;
    DisCo_class_ $$_other_$_system88 = ((DisCo_class_) $$$_other_$$$.$_system88);
    DisCo_class_ $$_other_$_admin89 = ((DisCo_class_) $$$_other_$$$.$_admin89);
    DisCo_class_ $$_other_$_shopkeeper90 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper90);
    DisCo_class_ $$_other_$_bookstore91 = ((DisCo_class_) $$$_other_$$$.$_bookstore91);
    if($_system88 == null && $$_other_$_system88 != null){
      return -1;
    }
    if($_system88 != null && $$_other_$_system88 == null){
      return 1;
    }
    if($_system88 != null && $$_other_$_system88!= null && ((DisCo_class_) $_system88).objectID_ != $$_other_$_system88.objectID_){
      return ((DisCo_class_) $_system88).objectID_ - $$_other_$_system88.objectID_;
    }
    if($_admin89 == null && $$_other_$_admin89 != null){
      return -1;
    }
    if($_admin89 != null && $$_other_$_admin89 == null){
      return 1;
    }
    if($_admin89 != null && $$_other_$_admin89!= null && ((DisCo_class_) $_admin89).objectID_ != $$_other_$_admin89.objectID_){
      return ((DisCo_class_) $_admin89).objectID_ - $$_other_$_admin89.objectID_;
    }
    if($_shopkeeper90 == null && $$_other_$_shopkeeper90 != null){
      return -1;
    }
    if($_shopkeeper90 != null && $$_other_$_shopkeeper90 == null){
      return 1;
    }
    if($_shopkeeper90 != null && $$_other_$_shopkeeper90!= null && ((DisCo_class_) $_shopkeeper90).objectID_ != $$_other_$_shopkeeper90.objectID_){
      return ((DisCo_class_) $_shopkeeper90).objectID_ - $$_other_$_shopkeeper90.objectID_;
    }
    if($_bookstore91 == null && $$_other_$_bookstore91 != null){
      return -1;
    }
    if($_bookstore91 != null && $$_other_$_bookstore91 == null){
      return 1;
    }
    if($_bookstore91 != null && $$_other_$_bookstore91!= null && ((DisCo_class_) $_bookstore91).objectID_ != $$_other_$_bookstore91.objectID_){
      return ((DisCo_class_) $_bookstore91).objectID_ - $$_other_$_bookstore91.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_system88() {
    Vector ret = new Vector();
    if($_system88 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(($_System3_interface_)iter_.nextElement(), $_admin89, $_shopkeeper90, $_bookstore91, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_admin89() {
    Vector ret = new Vector();
    if($_admin89 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system88, ($_Admin6_interface_)iter_.nextElement(), $_shopkeeper90, $_bookstore91, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_shopkeeper90() {
    Vector ret = new Vector();
    if($_shopkeeper90 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system88, $_admin89, ($_Shopkeeper5_interface_)iter_.nextElement(), $_bookstore91, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore91() {
    Vector ret = new Vector();
    if($_bookstore91 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system88, $_admin89, $_shopkeeper90, ($_Bookstore4_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "system=" + ($_system88 == null ? "<any>" : $_system88.toString()) + ", "
       + "admin=" + ($_admin89 == null ? "<any>" : $_admin89.toString()) + ", "
       + "shopkeeper=" + ($_shopkeeper90 == null ? "<any>" : $_shopkeeper90.toString()) + ", "
       + "bookstore=" + ($_bookstore91 == null ? "<any>" : $_bookstore91.toString()) + ", "
       + "now=" + ($_now92 == null ? "<any>" : $_now92.toString()) + ", ");
  }

  public boolean equal_participants_($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ trial) {
    return $_system88 != null && $_system88 == trial.$_system88  && $_admin89 != null && $_admin89 == trial.$_admin89  && $_shopkeeper90 != null && $_shopkeeper90 == trial.$_shopkeeper90  && $_bookstore91 != null && $_bookstore91 == trial.$_bookstore91 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_system88);
    result_.addElement($_admin89);
    result_.addElement($_shopkeeper90);
    result_.addElement($_bookstore91);
    return result_;
  }

  public $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ clone_() {
    return new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system88, $_admin89, $_shopkeeper90, $_bookstore91, my_specification_);
  }

  public boolean invalid_() {
    if ($_system88 != null && $_system88 == $_admin89) return true;
    if ($_system88 != null && $_system88 == $_shopkeeper90) return true;
    if ($_system88 != null && $_system88 == $_bookstore91) return true;
    if ($_admin89 != null && $_admin89 == $_shopkeeper90) return true;
    if ($_admin89 != null && $_admin89 == $_bookstore91) return true;
    if ($_shopkeeper90 != null && $_shopkeeper90 == $_bookstore91) return true;
    return invalid_;
  }

  public $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ combine($_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ other_) {
    $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ result_ = new $_admin_register_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_);
    if ($_system88 == null) {
      result_.$_system88 = other_.$_system88;
    }
    else if (other_.$_system88 == null) {
      result_.$_system88 = $_system88;
    }
    else if($_system88 == other_.$_system88) {
      result_.$_system88 = $_system88;
    }
    else return null;

    if ($_admin89 == null) {
      result_.$_admin89 = other_.$_admin89;
    }
    else if (other_.$_admin89 == null) {
      result_.$_admin89 = $_admin89;
    }
    else if($_admin89 == other_.$_admin89) {
      result_.$_admin89 = $_admin89;
    }
    else return null;

    if ($_shopkeeper90 == null) {
      result_.$_shopkeeper90 = other_.$_shopkeeper90;
    }
    else if (other_.$_shopkeeper90 == null) {
      result_.$_shopkeeper90 = $_shopkeeper90;
    }
    else if($_shopkeeper90 == other_.$_shopkeeper90) {
      result_.$_shopkeeper90 = $_shopkeeper90;
    }
    else return null;

    if ($_bookstore91 == null) {
      result_.$_bookstore91 = other_.$_bookstore91;
    }
    else if (other_.$_bookstore91 == null) {
      result_.$_bookstore91 = $_bookstore91;
    }
    else if($_bookstore91 == other_.$_bookstore91) {
      result_.$_bookstore91 = $_bookstore91;
    }
    else return null;

    return result_;
  }
}

class $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$ extends DisCo_action_ {
  Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ enabled_for_;

  $_yes7_interface_ rhs_76;
  public $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ selected_combination_ = new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(my_specification_);
  public String get_name_() {
    return "admin_add_new_bookstore";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_System3_interface_ $_system93 = selected_combination_.$_system93;
    $_Admin6_interface_ $_admin94 = selected_combination_.$_admin94;
    $_Bookstore4_interface_ $_bookstore95 = selected_combination_.$_bookstore95;
    Parameter_real_ $_now96 = selected_combination_.$_now96;
    return ((($_system93.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin94).objectID_)))).op_and_(new DisCo_bool_($_bookstore95.get_$_created26_() instanceof $_Bookstore4.$_no8)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system93, $_Admin6_interface_ $_admin94) {
    return ($_system93.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin94).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Bookstore4_interface_ $_bookstore95) {
    return new DisCo_bool_($_bookstore95.get_$_created26_() instanceof $_Bookstore4.$_no8).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ combs_ = new Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_(my_specification_);
    Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ partial_result_ = new Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system93();
    combs_.generate_explicit_combinations_$_admin94();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) comb_i_.next();
      $_System3_interface_ $_system93 = $$$_one_combination_$$$.$_system93;
      $_Admin6_interface_ $_admin94 = $$$_one_combination_$$$.$_admin94;
      if (partial_guard_1_($_system93, $_admin94)) {
        partial_result_.add_combination_(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_($_system93, $_admin94, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_bookstore95();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Bookstore4_interface_ $_bookstore95 = $$$_one_combination_$$$.$_bookstore95;
      if (partial_guard_2_($_bookstore95)) {
        partial_result_.add_combination_(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(null, null, $_bookstore95, my_specification_));
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
  public void initialize_execute($_System3_interface_ $_system93, $_Admin6_interface_ $_admin94, $_Bookstore4_interface_ $_bookstore95, Parameter_real_ $_now96) throws Assertion_exception_ {
    rhs_76 = new $_Bookstore4.$_yes7();
  }

  public void actual_execute($_System3_interface_ $_system93, $_Admin6_interface_ $_admin94, $_Bookstore4_interface_ $_bookstore95, Parameter_real_ $_now96) throws Assertion_exception_ {
    try {
      $_bookstore95.set_$_created26_((DisCo_type_) rhs_76);
      Iterator iEL77 = my_specification_.getEngineListeners_();
      while(iEL77.hasNext()) {
        ((EngineListener)(iEL77.next())).objectStateChanged((DisCo_class_)$_bookstore95);
      }
      my_specification_.rt_.set_omega_($_now96.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_System3_interface_ $_system93, $_Admin6_interface_ $_admin94, $_Bookstore4_interface_ $_bookstore95, Parameter_real_ $_now96) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_system93, $_admin94, $_bookstore95, $_now96);
    actual_execute($_system93, $_admin94, $_bookstore95, $_now96);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action admin_add_new_bookstore(System, Admin, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("system", "System"));
    result_.addElement(new Name_type_pair_("admin", "Admin"));
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
      vd_ = new Value_description_(selected_combination_.$_now96.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 3){
      selected_combination_.$_now96.realval = value.realval;
      selected_combination_.$_now96.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action admin_add_new_bookstore(System, Admin, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 3){
      selected_combination_.$_now96 = new Parameter_real_();
      selected_combination_.$_now96.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action admin_add_new_bookstore(System, Admin, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for admin_add_new_bookstore(System, Admin, Bookstore) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_system93 != null, "Participant $_system93 == null");
    new Assertion(selected_combination_.$_admin94 != null, "Participant $_admin94 == null");
    new Assertion(selected_combination_.$_bookstore95 != null, "Participant $_bookstore95 == null");
    $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action admin_add_new_bookstore(System, Admin, Bookstore) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_system93, selected_combination_.$_admin94, selected_combination_.$_bookstore95, selected_combination_.$_now96);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_system93 = ($_System3_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_admin94 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore95 = ($_Bookstore4_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_system93;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_admin94;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore95;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ comb_ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      if (!comb_.$_now96.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action admin_add_new_bookstore(System, Admin, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_system93() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system93 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system93() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_admin94() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin94 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin94() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore95() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore95 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore95() );
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
      tmp_combinations.addAll((($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system93());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin94());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore95());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      if(comb.$_system93 != null && (($_System3) (comb.$_system93)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system93)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_admin94 != null && (($_Admin6) (comb.$_admin94)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin94)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore95 != null && (($_Bookstore4) (comb.$_bookstore95)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore95)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next()).debug_();
    }
  }

  public $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ pick_actual_parameters_($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ comb = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) (iter.next());
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
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_  comb_to_add_ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ comb_to_add_ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ combine(Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ other_) {
    Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_ result = new Combinations_$_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ mycomb = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ otherscomb = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) otherselems.next();
        $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ c = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_System3_interface_ $_system93 = null;
  $_Admin6_interface_ $_admin94 = null;
  $_Bookstore4_interface_ $_bookstore95 = null;
  Parameter_real_ $_now96 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_($_System3_interface_ $_system93, $_Admin6_interface_ $_admin94, $_Bookstore4_interface_ $_bookstore95, DisCo_specification_ my_specification) {
    this.$_system93 = $_system93;
    this.$_admin94 = $_admin94;
    this.$_bookstore95 = $_bookstore95;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now96);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ $$$_other_$$$ = ($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_)o;
    DisCo_class_ $$_other_$_system93 = ((DisCo_class_) $$$_other_$$$.$_system93);
    DisCo_class_ $$_other_$_admin94 = ((DisCo_class_) $$$_other_$$$.$_admin94);
    DisCo_class_ $$_other_$_bookstore95 = ((DisCo_class_) $$$_other_$$$.$_bookstore95);
    if($_system93 == null && $$_other_$_system93 != null){
      return -1;
    }
    if($_system93 != null && $$_other_$_system93 == null){
      return 1;
    }
    if($_system93 != null && $$_other_$_system93!= null && ((DisCo_class_) $_system93).objectID_ != $$_other_$_system93.objectID_){
      return ((DisCo_class_) $_system93).objectID_ - $$_other_$_system93.objectID_;
    }
    if($_admin94 == null && $$_other_$_admin94 != null){
      return -1;
    }
    if($_admin94 != null && $$_other_$_admin94 == null){
      return 1;
    }
    if($_admin94 != null && $$_other_$_admin94!= null && ((DisCo_class_) $_admin94).objectID_ != $$_other_$_admin94.objectID_){
      return ((DisCo_class_) $_admin94).objectID_ - $$_other_$_admin94.objectID_;
    }
    if($_bookstore95 == null && $$_other_$_bookstore95 != null){
      return -1;
    }
    if($_bookstore95 != null && $$_other_$_bookstore95 == null){
      return 1;
    }
    if($_bookstore95 != null && $$_other_$_bookstore95!= null && ((DisCo_class_) $_bookstore95).objectID_ != $$_other_$_bookstore95.objectID_){
      return ((DisCo_class_) $_bookstore95).objectID_ - $$_other_$_bookstore95.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_system93() {
    Vector ret = new Vector();
    if($_system93 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(($_System3_interface_)iter_.nextElement(), $_admin94, $_bookstore95, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_admin94() {
    Vector ret = new Vector();
    if($_admin94 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_($_system93, ($_Admin6_interface_)iter_.nextElement(), $_bookstore95, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore95() {
    Vector ret = new Vector();
    if($_bookstore95 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_($_system93, $_admin94, ($_Bookstore4_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "system=" + ($_system93 == null ? "<any>" : $_system93.toString()) + ", "
       + "admin=" + ($_admin94 == null ? "<any>" : $_admin94.toString()) + ", "
       + "bookstore=" + ($_bookstore95 == null ? "<any>" : $_bookstore95.toString()) + ", "
       + "now=" + ($_now96 == null ? "<any>" : $_now96.toString()) + ", ");
  }

  public boolean equal_participants_($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ trial) {
    return $_system93 != null && $_system93 == trial.$_system93  && $_admin94 != null && $_admin94 == trial.$_admin94  && $_bookstore95 != null && $_bookstore95 == trial.$_bookstore95 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_system93);
    result_.addElement($_admin94);
    result_.addElement($_bookstore95);
    return result_;
  }

  public $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ clone_() {
    return new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_($_system93, $_admin94, $_bookstore95, my_specification_);
  }

  public boolean invalid_() {
    if ($_system93 != null && $_system93 == $_admin94) return true;
    if ($_system93 != null && $_system93 == $_bookstore95) return true;
    if ($_admin94 != null && $_admin94 == $_bookstore95) return true;
    return invalid_;
  }

  public $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ combine($_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ other_) {
    $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_ result_ = new $_admin_add_new_bookstore$$$_System3$$$_Admin6$$$_Bookstore4$$_combination_(null, null, null, my_specification_);
    if ($_system93 == null) {
      result_.$_system93 = other_.$_system93;
    }
    else if (other_.$_system93 == null) {
      result_.$_system93 = $_system93;
    }
    else if($_system93 == other_.$_system93) {
      result_.$_system93 = $_system93;
    }
    else return null;

    if ($_admin94 == null) {
      result_.$_admin94 = other_.$_admin94;
    }
    else if (other_.$_admin94 == null) {
      result_.$_admin94 = $_admin94;
    }
    else if($_admin94 == other_.$_admin94) {
      result_.$_admin94 = $_admin94;
    }
    else return null;

    if ($_bookstore95 == null) {
      result_.$_bookstore95 = other_.$_bookstore95;
    }
    else if (other_.$_bookstore95 == null) {
      result_.$_bookstore95 = $_bookstore95;
    }
    else if($_bookstore95 == other_.$_bookstore95) {
      result_.$_bookstore95 = $_bookstore95;
    }
    else return null;

    return result_;
  }
}

class $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$ extends DisCo_action_ {
  Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ enabled_for_;

  $_no8_interface_ rhs_78;
  $_no20_interface_ rhs_79;
  public $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ selected_combination_ = new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(my_specification_);
  public String get_name_() {
    return "admin_delete_shopkeeper";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_System3_interface_ $_system97 = selected_combination_.$_system97;
    $_Admin6_interface_ $_admin98 = selected_combination_.$_admin98;
    $_Shopkeeper5_interface_ $_shopkeeper99 = selected_combination_.$_shopkeeper99;
    $_Bookstore4_interface_ $_bookstore100 = selected_combination_.$_bookstore100;
    Parameter_real_ $_now101 = selected_combination_.$_now101;
    return ((($_system97.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin98).objectID_)))).op_and_(($_bookstore100.get_$_owner25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper99).objectID_))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system97, $_Admin6_interface_ $_admin98) {
    return ($_system97.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin98).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Shopkeeper5_interface_ $_shopkeeper99, $_Bookstore4_interface_ $_bookstore100) {
    return ($_bookstore100.get_$_owner25_().op_eq_((new DisCo_int_(((DisCo_class_)$_shopkeeper99).objectID_)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ combs_ = new Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);
    Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ partial_result_ = new Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system97();
    combs_.generate_explicit_combinations_$_admin98();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_System3_interface_ $_system97 = $$$_one_combination_$$$.$_system97;
      $_Admin6_interface_ $_admin98 = $$$_one_combination_$$$.$_admin98;
      if (partial_guard_1_($_system97, $_admin98)) {
        partial_result_.add_combination_(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system97, $_admin98, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper99();
    combs_.generate_explicit_combinations_$_bookstore100();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Shopkeeper5_interface_ $_shopkeeper99 = $$$_one_combination_$$$.$_shopkeeper99;
      $_Bookstore4_interface_ $_bookstore100 = $$$_one_combination_$$$.$_bookstore100;
      if (partial_guard_2_($_shopkeeper99, $_bookstore100)) {
        partial_result_.add_combination_(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, $_shopkeeper99, $_bookstore100, my_specification_));
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
  public void initialize_execute($_System3_interface_ $_system97, $_Admin6_interface_ $_admin98, $_Shopkeeper5_interface_ $_shopkeeper99, $_Bookstore4_interface_ $_bookstore100, Parameter_real_ $_now101) throws Assertion_exception_ {
    rhs_78 = new $_Bookstore4.$_no8();
    rhs_79 = new $_Shopkeeper5.$_no20();
  }

  public void actual_execute($_System3_interface_ $_system97, $_Admin6_interface_ $_admin98, $_Shopkeeper5_interface_ $_shopkeeper99, $_Bookstore4_interface_ $_bookstore100, Parameter_real_ $_now101) throws Assertion_exception_ {
    try {
      $_bookstore100.set_$_created26_((DisCo_type_) rhs_78);
      Iterator iEL80 = my_specification_.getEngineListeners_();
      while(iEL80.hasNext()) {
        ((EngineListener)(iEL80.next())).objectStateChanged((DisCo_class_)$_bookstore100);
      }
      $_shopkeeper99.set_$_registed37_((DisCo_type_) rhs_79);
      Iterator iEL81 = my_specification_.getEngineListeners_();
      while(iEL81.hasNext()) {
        ((EngineListener)(iEL81.next())).objectStateChanged((DisCo_class_)$_shopkeeper99);
      }
      my_specification_.rt_.set_omega_($_now101.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_System3_interface_ $_system97, $_Admin6_interface_ $_admin98, $_Shopkeeper5_interface_ $_shopkeeper99, $_Bookstore4_interface_ $_bookstore100, Parameter_real_ $_now101) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_system97, $_admin98, $_shopkeeper99, $_bookstore100, $_now101);
    actual_execute($_system97, $_admin98, $_shopkeeper99, $_bookstore100, $_now101);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action admin_delete_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("system", "System"));
    result_.addElement(new Name_type_pair_("admin", "Admin"));
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now101.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now101.realval = value.realval;
      selected_combination_.$_now101.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action admin_delete_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now101 = new Parameter_real_();
      selected_combination_.$_now101.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action admin_delete_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for admin_delete_shopkeeper(System, Admin, Shopkeeper, Bookstore) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_system97 != null, "Participant $_system97 == null");
    new Assertion(selected_combination_.$_admin98 != null, "Participant $_admin98 == null");
    new Assertion(selected_combination_.$_shopkeeper99 != null, "Participant $_shopkeeper99 == null");
    new Assertion(selected_combination_.$_bookstore100 != null, "Participant $_bookstore100 == null");
    $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action admin_delete_shopkeeper(System, Admin, Shopkeeper, Bookstore) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_system97, selected_combination_.$_admin98, selected_combination_.$_shopkeeper99, selected_combination_.$_bookstore100, selected_combination_.$_now101);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_system97 = ($_System3_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_admin98 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_shopkeeper99 = ($_Shopkeeper5_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_bookstore100 = ($_Bookstore4_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_system97;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_admin98;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_shopkeeper99;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_bookstore100;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if (!comb_.$_now101.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action admin_delete_shopkeeper(System, Admin, Shopkeeper, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_system97() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system97 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system97() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_admin98() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin98 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin98() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_shopkeeper99() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper99 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper99() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore100() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore100 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore100() );
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
      tmp_combinations.addAll((($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system97());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin98());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper99());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore100());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if(comb.$_system97 != null && (($_System3) (comb.$_system97)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system97)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_admin98 != null && (($_Admin6) (comb.$_admin98)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin98)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_shopkeeper99 != null && (($_Shopkeeper5) (comb.$_shopkeeper99)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper99)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore100 != null && (($_Bookstore4) (comb.$_bookstore100)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore100)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next()).debug_();
    }
  }

  public $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ pick_actual_parameters_($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) (iter.next());
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
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_  comb_to_add_ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_to_add_ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ combine(Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ other_) {
    Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ result = new Combinations_$_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ mycomb = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ otherscomb = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) otherselems.next();
        $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ c = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_System3_interface_ $_system97 = null;
  $_Admin6_interface_ $_admin98 = null;
  $_Shopkeeper5_interface_ $_shopkeeper99 = null;
  $_Bookstore4_interface_ $_bookstore100 = null;
  Parameter_real_ $_now101 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_System3_interface_ $_system97, $_Admin6_interface_ $_admin98, $_Shopkeeper5_interface_ $_shopkeeper99, $_Bookstore4_interface_ $_bookstore100, DisCo_specification_ my_specification) {
    this.$_system97 = $_system97;
    this.$_admin98 = $_admin98;
    this.$_shopkeeper99 = $_shopkeeper99;
    this.$_bookstore100 = $_bookstore100;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now101);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_other_$$$ = ($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)o;
    DisCo_class_ $$_other_$_system97 = ((DisCo_class_) $$$_other_$$$.$_system97);
    DisCo_class_ $$_other_$_admin98 = ((DisCo_class_) $$$_other_$$$.$_admin98);
    DisCo_class_ $$_other_$_shopkeeper99 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper99);
    DisCo_class_ $$_other_$_bookstore100 = ((DisCo_class_) $$$_other_$$$.$_bookstore100);
    if($_system97 == null && $$_other_$_system97 != null){
      return -1;
    }
    if($_system97 != null && $$_other_$_system97 == null){
      return 1;
    }
    if($_system97 != null && $$_other_$_system97!= null && ((DisCo_class_) $_system97).objectID_ != $$_other_$_system97.objectID_){
      return ((DisCo_class_) $_system97).objectID_ - $$_other_$_system97.objectID_;
    }
    if($_admin98 == null && $$_other_$_admin98 != null){
      return -1;
    }
    if($_admin98 != null && $$_other_$_admin98 == null){
      return 1;
    }
    if($_admin98 != null && $$_other_$_admin98!= null && ((DisCo_class_) $_admin98).objectID_ != $$_other_$_admin98.objectID_){
      return ((DisCo_class_) $_admin98).objectID_ - $$_other_$_admin98.objectID_;
    }
    if($_shopkeeper99 == null && $$_other_$_shopkeeper99 != null){
      return -1;
    }
    if($_shopkeeper99 != null && $$_other_$_shopkeeper99 == null){
      return 1;
    }
    if($_shopkeeper99 != null && $$_other_$_shopkeeper99!= null && ((DisCo_class_) $_shopkeeper99).objectID_ != $$_other_$_shopkeeper99.objectID_){
      return ((DisCo_class_) $_shopkeeper99).objectID_ - $$_other_$_shopkeeper99.objectID_;
    }
    if($_bookstore100 == null && $$_other_$_bookstore100 != null){
      return -1;
    }
    if($_bookstore100 != null && $$_other_$_bookstore100 == null){
      return 1;
    }
    if($_bookstore100 != null && $$_other_$_bookstore100!= null && ((DisCo_class_) $_bookstore100).objectID_ != $$_other_$_bookstore100.objectID_){
      return ((DisCo_class_) $_bookstore100).objectID_ - $$_other_$_bookstore100.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_system97() {
    Vector ret = new Vector();
    if($_system97 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(($_System3_interface_)iter_.nextElement(), $_admin98, $_shopkeeper99, $_bookstore100, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_admin98() {
    Vector ret = new Vector();
    if($_admin98 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system97, ($_Admin6_interface_)iter_.nextElement(), $_shopkeeper99, $_bookstore100, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_shopkeeper99() {
    Vector ret = new Vector();
    if($_shopkeeper99 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system97, $_admin98, ($_Shopkeeper5_interface_)iter_.nextElement(), $_bookstore100, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore100() {
    Vector ret = new Vector();
    if($_bookstore100 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system97, $_admin98, $_shopkeeper99, ($_Bookstore4_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "system=" + ($_system97 == null ? "<any>" : $_system97.toString()) + ", "
       + "admin=" + ($_admin98 == null ? "<any>" : $_admin98.toString()) + ", "
       + "shopkeeper=" + ($_shopkeeper99 == null ? "<any>" : $_shopkeeper99.toString()) + ", "
       + "bookstore=" + ($_bookstore100 == null ? "<any>" : $_bookstore100.toString()) + ", "
       + "now=" + ($_now101 == null ? "<any>" : $_now101.toString()) + ", ");
  }

  public boolean equal_participants_($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ trial) {
    return $_system97 != null && $_system97 == trial.$_system97  && $_admin98 != null && $_admin98 == trial.$_admin98  && $_shopkeeper99 != null && $_shopkeeper99 == trial.$_shopkeeper99  && $_bookstore100 != null && $_bookstore100 == trial.$_bookstore100 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_system97);
    result_.addElement($_admin98);
    result_.addElement($_shopkeeper99);
    result_.addElement($_bookstore100);
    return result_;
  }

  public $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ clone_() {
    return new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system97, $_admin98, $_shopkeeper99, $_bookstore100, my_specification_);
  }

  public boolean invalid_() {
    if ($_system97 != null && $_system97 == $_admin98) return true;
    if ($_system97 != null && $_system97 == $_shopkeeper99) return true;
    if ($_system97 != null && $_system97 == $_bookstore100) return true;
    if ($_admin98 != null && $_admin98 == $_shopkeeper99) return true;
    if ($_admin98 != null && $_admin98 == $_bookstore100) return true;
    if ($_shopkeeper99 != null && $_shopkeeper99 == $_bookstore100) return true;
    return invalid_;
  }

  public $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ combine($_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ other_) {
    $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ result_ = new $_admin_delete_shopkeeper$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_);
    if ($_system97 == null) {
      result_.$_system97 = other_.$_system97;
    }
    else if (other_.$_system97 == null) {
      result_.$_system97 = $_system97;
    }
    else if($_system97 == other_.$_system97) {
      result_.$_system97 = $_system97;
    }
    else return null;

    if ($_admin98 == null) {
      result_.$_admin98 = other_.$_admin98;
    }
    else if (other_.$_admin98 == null) {
      result_.$_admin98 = $_admin98;
    }
    else if($_admin98 == other_.$_admin98) {
      result_.$_admin98 = $_admin98;
    }
    else return null;

    if ($_shopkeeper99 == null) {
      result_.$_shopkeeper99 = other_.$_shopkeeper99;
    }
    else if (other_.$_shopkeeper99 == null) {
      result_.$_shopkeeper99 = $_shopkeeper99;
    }
    else if($_shopkeeper99 == other_.$_shopkeeper99) {
      result_.$_shopkeeper99 = $_shopkeeper99;
    }
    else return null;

    if ($_bookstore100 == null) {
      result_.$_bookstore100 = other_.$_bookstore100;
    }
    else if (other_.$_bookstore100 == null) {
      result_.$_bookstore100 = $_bookstore100;
    }
    else if($_bookstore100 == other_.$_bookstore100) {
      result_.$_bookstore100 = $_bookstore100;
    }
    else return null;

    return result_;
  }
}

class $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$ extends DisCo_action_ {
  Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ enabled_for_;

  $_yes7_interface_ rhs_82;
  $_yes21_interface_ rhs_83;
  DisCo_int_ rhs_84;
  public $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ selected_combination_ = new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(my_specification_);
  public String get_name_() {
    return "admin_add_shopkeeper_to_bookstore";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_System3_interface_ $_system102 = selected_combination_.$_system102;
    $_Admin6_interface_ $_admin103 = selected_combination_.$_admin103;
    $_Shopkeeper5_interface_ $_shopkeeper104 = selected_combination_.$_shopkeeper104;
    $_Bookstore4_interface_ $_bookstore105 = selected_combination_.$_bookstore105;
    Parameter_real_ $_now106 = selected_combination_.$_now106;
    return (((($_system102.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin103).objectID_)))).op_and_(new DisCo_bool_($_bookstore105.get_$_created26_() instanceof $_Bookstore4.$_no8))).op_and_(new DisCo_bool_($_shopkeeper104.get_$_registed37_() instanceof $_Shopkeeper5.$_no20)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_System3_interface_ $_system102, $_Admin6_interface_ $_admin103) {
    return ($_system102.get_$_active_admin24_().op_eq_((new DisCo_int_(((DisCo_class_)$_admin103).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Bookstore4_interface_ $_bookstore105) {
    return new DisCo_bool_($_bookstore105.get_$_created26_() instanceof $_Bookstore4.$_no8).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_3_($_Shopkeeper5_interface_ $_shopkeeper104) {
    return new DisCo_bool_($_shopkeeper104.get_$_registed37_() instanceof $_Shopkeeper5.$_no20).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ combs_ = new Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);
    Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ partial_result_ = new Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_system102();
    combs_.generate_explicit_combinations_$_admin103();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_System3_interface_ $_system102 = $$$_one_combination_$$$.$_system102;
      $_Admin6_interface_ $_admin103 = $$$_one_combination_$$$.$_admin103;
      if (partial_guard_1_($_system102, $_admin103)) {
        partial_result_.add_combination_(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system102, $_admin103, null, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_bookstore105();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Bookstore4_interface_ $_bookstore105 = $$$_one_combination_$$$.$_bookstore105;
      if (partial_guard_2_($_bookstore105)) {
        partial_result_.add_combination_(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, $_bookstore105, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_shopkeeper104();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_one_combination_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) comb_i_.next();
      $_Shopkeeper5_interface_ $_shopkeeper104 = $$$_one_combination_$$$.$_shopkeeper104;
      if (partial_guard_3_($_shopkeeper104)) {
        partial_result_.add_combination_(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, $_shopkeeper104, null, my_specification_));
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
  public void initialize_execute($_System3_interface_ $_system102, $_Admin6_interface_ $_admin103, $_Shopkeeper5_interface_ $_shopkeeper104, $_Bookstore4_interface_ $_bookstore105, Parameter_real_ $_now106) throws Assertion_exception_ {
    rhs_82 = new $_Bookstore4.$_yes7();
    rhs_83 = new $_Shopkeeper5.$_yes21();
    rhs_84 = (new DisCo_int_(((DisCo_class_)$_shopkeeper104).objectID_));
  }

  public void actual_execute($_System3_interface_ $_system102, $_Admin6_interface_ $_admin103, $_Shopkeeper5_interface_ $_shopkeeper104, $_Bookstore4_interface_ $_bookstore105, Parameter_real_ $_now106) throws Assertion_exception_ {
    try {
      $_bookstore105.set_$_created26_((DisCo_type_) rhs_82);
      Iterator iEL85 = my_specification_.getEngineListeners_();
      while(iEL85.hasNext()) {
        ((EngineListener)(iEL85.next())).objectStateChanged((DisCo_class_)$_bookstore105);
      }
      $_shopkeeper104.set_$_registed37_((DisCo_type_) rhs_83);
      Iterator iEL86 = my_specification_.getEngineListeners_();
      while(iEL86.hasNext()) {
        ((EngineListener)(iEL86.next())).objectStateChanged((DisCo_class_)$_shopkeeper104);
      }
      $_bookstore105.set_$_owner25_(rhs_84.get_val_());
      Iterator iEL87 = my_specification_.getEngineListeners_();
      while(iEL87.hasNext()) {
        ((EngineListener)(iEL87.next())).objectStateChanged((DisCo_class_)$_bookstore105);
      }
      my_specification_.rt_.set_omega_($_now106.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_System3_interface_ $_system102, $_Admin6_interface_ $_admin103, $_Shopkeeper5_interface_ $_shopkeeper104, $_Bookstore4_interface_ $_bookstore105, Parameter_real_ $_now106) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_system102, $_admin103, $_shopkeeper104, $_bookstore105, $_now106);
    actual_execute($_system102, $_admin103, $_shopkeeper104, $_bookstore105, $_now106);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action admin_add_shopkeeper_to_bookstore(System, Admin, Shopkeeper, Bookstore)");
    eval_guard_();
    selected_combination_ = new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("system", "System"));
    result_.addElement(new Name_type_pair_("admin", "Admin"));
    result_.addElement(new Name_type_pair_("shopkeeper", "Shopkeeper"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now106.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now106.realval = value.realval;
      selected_combination_.$_now106.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action admin_add_shopkeeper_to_bookstore(System, Admin, Shopkeeper, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now106 = new Parameter_real_();
      selected_combination_.$_now106.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action admin_add_shopkeeper_to_bookstore(System, Admin, Shopkeeper, Bookstore)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for admin_add_shopkeeper_to_bookstore(System, Admin, Shopkeeper, Bookstore) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_system102 != null, "Participant $_system102 == null");
    new Assertion(selected_combination_.$_admin103 != null, "Participant $_admin103 == null");
    new Assertion(selected_combination_.$_shopkeeper104 != null, "Participant $_shopkeeper104 == null");
    new Assertion(selected_combination_.$_bookstore105 != null, "Participant $_bookstore105 == null");
    $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action admin_add_shopkeeper_to_bookstore(System, Admin, Shopkeeper, Bookstore) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_system102, selected_combination_.$_admin103, selected_combination_.$_shopkeeper104, selected_combination_.$_bookstore105, selected_combination_.$_now106);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_system102 = ($_System3_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_admin103 = ($_Admin6_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_shopkeeper104 = ($_Shopkeeper5_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_bookstore105 = ($_Bookstore4_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_system102;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_admin103;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_shopkeeper104;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_bookstore105;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if (!comb_.$_now106.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action admin_add_shopkeeper_to_bookstore(System, Admin, Shopkeeper, Bookstore)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_system102() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system102 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system102() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_admin103() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_admin103 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_admin103() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_shopkeeper104() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_shopkeeper104 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_shopkeeper104() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore105() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore105 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore105() );
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
      tmp_combinations.addAll((($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system102());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_admin103());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_shopkeeper104());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore105());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_ccc_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if(comb.$_system102 != null && (($_System3) (comb.$_system102)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system102)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_admin103 != null && (($_Admin6) (comb.$_admin103)).objectID_ != (($_Admin6) ($$$_ccc_$$$.$_admin103)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_shopkeeper104 != null && (($_Shopkeeper5) (comb.$_shopkeeper104)).objectID_ != (($_Shopkeeper5) ($$$_ccc_$$$.$_shopkeeper104)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore105 != null && (($_Bookstore4) (comb.$_bookstore105)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore105)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next()).debug_();
    }
  }

  public $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ pick_actual_parameters_($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) (iter.next());
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
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_  comb_to_add_ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_to_add_ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ combine(Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ other_) {
    Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_ result = new Combinations_$_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ mycomb = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ otherscomb = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) otherselems.next();
        $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ c = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_System3_interface_ $_system102 = null;
  $_Admin6_interface_ $_admin103 = null;
  $_Shopkeeper5_interface_ $_shopkeeper104 = null;
  $_Bookstore4_interface_ $_bookstore105 = null;
  Parameter_real_ $_now106 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_System3_interface_ $_system102, $_Admin6_interface_ $_admin103, $_Shopkeeper5_interface_ $_shopkeeper104, $_Bookstore4_interface_ $_bookstore105, DisCo_specification_ my_specification) {
    this.$_system102 = $_system102;
    this.$_admin103 = $_admin103;
    this.$_shopkeeper104 = $_shopkeeper104;
    this.$_bookstore105 = $_bookstore105;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now106);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ $$$_other_$$$ = ($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_)o;
    DisCo_class_ $$_other_$_system102 = ((DisCo_class_) $$$_other_$$$.$_system102);
    DisCo_class_ $$_other_$_admin103 = ((DisCo_class_) $$$_other_$$$.$_admin103);
    DisCo_class_ $$_other_$_shopkeeper104 = ((DisCo_class_) $$$_other_$$$.$_shopkeeper104);
    DisCo_class_ $$_other_$_bookstore105 = ((DisCo_class_) $$$_other_$$$.$_bookstore105);
    if($_system102 == null && $$_other_$_system102 != null){
      return -1;
    }
    if($_system102 != null && $$_other_$_system102 == null){
      return 1;
    }
    if($_system102 != null && $$_other_$_system102!= null && ((DisCo_class_) $_system102).objectID_ != $$_other_$_system102.objectID_){
      return ((DisCo_class_) $_system102).objectID_ - $$_other_$_system102.objectID_;
    }
    if($_admin103 == null && $$_other_$_admin103 != null){
      return -1;
    }
    if($_admin103 != null && $$_other_$_admin103 == null){
      return 1;
    }
    if($_admin103 != null && $$_other_$_admin103!= null && ((DisCo_class_) $_admin103).objectID_ != $$_other_$_admin103.objectID_){
      return ((DisCo_class_) $_admin103).objectID_ - $$_other_$_admin103.objectID_;
    }
    if($_shopkeeper104 == null && $$_other_$_shopkeeper104 != null){
      return -1;
    }
    if($_shopkeeper104 != null && $$_other_$_shopkeeper104 == null){
      return 1;
    }
    if($_shopkeeper104 != null && $$_other_$_shopkeeper104!= null && ((DisCo_class_) $_shopkeeper104).objectID_ != $$_other_$_shopkeeper104.objectID_){
      return ((DisCo_class_) $_shopkeeper104).objectID_ - $$_other_$_shopkeeper104.objectID_;
    }
    if($_bookstore105 == null && $$_other_$_bookstore105 != null){
      return -1;
    }
    if($_bookstore105 != null && $$_other_$_bookstore105 == null){
      return 1;
    }
    if($_bookstore105 != null && $$_other_$_bookstore105!= null && ((DisCo_class_) $_bookstore105).objectID_ != $$_other_$_bookstore105.objectID_){
      return ((DisCo_class_) $_bookstore105).objectID_ - $$_other_$_bookstore105.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_system102() {
    Vector ret = new Vector();
    if($_system102 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(($_System3_interface_)iter_.nextElement(), $_admin103, $_shopkeeper104, $_bookstore105, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_admin103() {
    Vector ret = new Vector();
    if($_admin103 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Admin6").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system102, ($_Admin6_interface_)iter_.nextElement(), $_shopkeeper104, $_bookstore105, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_shopkeeper104() {
    Vector ret = new Vector();
    if($_shopkeeper104 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Shopkeeper5").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system102, $_admin103, ($_Shopkeeper5_interface_)iter_.nextElement(), $_bookstore105, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore105() {
    Vector ret = new Vector();
    if($_bookstore105 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system102, $_admin103, $_shopkeeper104, ($_Bookstore4_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "system=" + ($_system102 == null ? "<any>" : $_system102.toString()) + ", "
       + "admin=" + ($_admin103 == null ? "<any>" : $_admin103.toString()) + ", "
       + "shopkeeper=" + ($_shopkeeper104 == null ? "<any>" : $_shopkeeper104.toString()) + ", "
       + "bookstore=" + ($_bookstore105 == null ? "<any>" : $_bookstore105.toString()) + ", "
       + "now=" + ($_now106 == null ? "<any>" : $_now106.toString()) + ", ");
  }

  public boolean equal_participants_($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ trial) {
    return $_system102 != null && $_system102 == trial.$_system102  && $_admin103 != null && $_admin103 == trial.$_admin103  && $_shopkeeper104 != null && $_shopkeeper104 == trial.$_shopkeeper104  && $_bookstore105 != null && $_bookstore105 == trial.$_bookstore105 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_system102);
    result_.addElement($_admin103);
    result_.addElement($_shopkeeper104);
    result_.addElement($_bookstore105);
    return result_;
  }

  public $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ clone_() {
    return new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_($_system102, $_admin103, $_shopkeeper104, $_bookstore105, my_specification_);
  }

  public boolean invalid_() {
    if ($_system102 != null && $_system102 == $_admin103) return true;
    if ($_system102 != null && $_system102 == $_shopkeeper104) return true;
    if ($_system102 != null && $_system102 == $_bookstore105) return true;
    if ($_admin103 != null && $_admin103 == $_shopkeeper104) return true;
    if ($_admin103 != null && $_admin103 == $_bookstore105) return true;
    if ($_shopkeeper104 != null && $_shopkeeper104 == $_bookstore105) return true;
    return invalid_;
  }

  public $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ combine($_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ other_) {
    $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_ result_ = new $_admin_add_shopkeeper_to_bookstore$$$_System3$$$_Admin6$$$_Shopkeeper5$$$_Bookstore4$$_combination_(null, null, null, null, my_specification_);
    if ($_system102 == null) {
      result_.$_system102 = other_.$_system102;
    }
    else if (other_.$_system102 == null) {
      result_.$_system102 = $_system102;
    }
    else if($_system102 == other_.$_system102) {
      result_.$_system102 = $_system102;
    }
    else return null;

    if ($_admin103 == null) {
      result_.$_admin103 = other_.$_admin103;
    }
    else if (other_.$_admin103 == null) {
      result_.$_admin103 = $_admin103;
    }
    else if($_admin103 == other_.$_admin103) {
      result_.$_admin103 = $_admin103;
    }
    else return null;

    if ($_shopkeeper104 == null) {
      result_.$_shopkeeper104 = other_.$_shopkeeper104;
    }
    else if (other_.$_shopkeeper104 == null) {
      result_.$_shopkeeper104 = $_shopkeeper104;
    }
    else if($_shopkeeper104 == other_.$_shopkeeper104) {
      result_.$_shopkeeper104 = $_shopkeeper104;
    }
    else return null;

    if ($_bookstore105 == null) {
      result_.$_bookstore105 = other_.$_bookstore105;
    }
    else if (other_.$_bookstore105 == null) {
      result_.$_bookstore105 = $_bookstore105;
    }
    else if($_bookstore105 == other_.$_bookstore105) {
      result_.$_bookstore105 = $_bookstore105;
    }
    else return null;

    return result_;
  }
}

class $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$ extends DisCo_action_ {
  Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ enabled_for_;

  DisCo_int_ rhs_88;
  public $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$(int id, DisCo_specification_ my_specification) {
    super(id, my_specification);
  }
  $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ selected_combination_ = new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(my_specification_);
  public String get_name_() {
    return "search";
  }
  public boolean eval_guard_for_selected_combination_() {
    $_System3_interface_ $_system107 = selected_combination_.$_system107;
    $_Book0_interface_ $_book108 = selected_combination_.$_book108;
    $_Bookstore4_interface_ $_bookstore109 = selected_combination_.$_bookstore109;
    $_Customer2_interface_ $_customer110 = selected_combination_.$_customer110;
    Parameter_real_ $_now111 = selected_combination_.$_now111;
    return ((($_book108.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore109).objectID_)))).op_and_(($_book108.get_$_in_basket33_().op_eq_((new DisCo_int_(-1))))))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_1_($_Book0_interface_ $_book108, $_Bookstore4_interface_ $_bookstore109) {
    return ($_book108.get_$_owned_bookstore31_().op_eq_((new DisCo_int_(((DisCo_class_)$_bookstore109).objectID_)))).get_val_(false);
  }
  //Partial guards from noParamsTable_
  public boolean partial_guard_2_($_Book0_interface_ $_book108) {
    return ($_book108.get_$_in_basket33_().op_eq_((new DisCo_int_(-1)))).get_val_(false);
  }
  public boolean eval_guard_() {
    Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ combs_ = new Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_(my_specification_);
    Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ partial_result_ = new Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_(my_specification_);
    Iterator comb_i_;
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book108();
    combs_.generate_explicit_combinations_$_bookstore109();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_one_combination_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book108 = $$$_one_combination_$$$.$_book108;
      $_Bookstore4_interface_ $_bookstore109 = $$$_one_combination_$$$.$_bookstore109;
      if (partial_guard_1_($_book108, $_bookstore109)) {
        partial_result_.add_combination_(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(null, $_book108, $_bookstore109, null, my_specification_));
      }
    }
    partial_result_.remove_invalid_combinations_();
    combs_ = combs_.combine(partial_result_);
    if (combs_.empty()) {
      enabled_bit_ = false;
      return false;
    }
    partial_result_.clear();
    combs_.generate_explicit_combinations_$_book108();
    comb_i_ = combs_.combinations.iterator();
    while (comb_i_.hasNext()) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_one_combination_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) comb_i_.next();
      $_Book0_interface_ $_book108 = $$$_one_combination_$$$.$_book108;
      if (partial_guard_2_($_book108)) {
        partial_result_.add_combination_(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(null, $_book108, null, null, my_specification_));
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
  public void initialize_execute($_System3_interface_ $_system107, $_Book0_interface_ $_book108, $_Bookstore4_interface_ $_bookstore109, $_Customer2_interface_ $_customer110, Parameter_real_ $_now111) throws Assertion_exception_ {
    rhs_88 = (new DisCo_int_(((DisCo_class_)$_book108).objectID_));
  }

  public void actual_execute($_System3_interface_ $_system107, $_Book0_interface_ $_book108, $_Bookstore4_interface_ $_bookstore109, $_Customer2_interface_ $_customer110, Parameter_real_ $_now111) throws Assertion_exception_ {
    try {
      $_customer110.set_$_browsing_currently35_(rhs_88.get_val_());
      Iterator iEL89 = my_specification_.getEngineListeners_();
      while(iEL89.hasNext()) {
        ((EngineListener)(iEL89.next())).objectStateChanged((DisCo_class_)$_customer110);
      }
      my_specification_.rt_.set_omega_($_now111.realval);
      return;
    } catch (ClassCastException cce) {
      throw new Undef_state_exception_();
    }
  }
  public void execute($_System3_interface_ $_system107, $_Book0_interface_ $_book108, $_Bookstore4_interface_ $_bookstore109, $_Customer2_interface_ $_customer110, Parameter_real_ $_now111) throws Assertion_exception_ {
    new Assertion(eval_guard_for_selected_combination_(), "Attempt to execute not enabled action");
    initialize_execute($_system107, $_book108, $_bookstore109, $_customer110, $_now111);
    actual_execute($_system107, $_book108, $_bookstore109, $_customer110, $_now111);
    my_specification_.check_assertions_();
  }

  public void reset_action_() {
    my_specification_.debug_("Reset action search(System, Book, Bookstore, Customer)");
    eval_guard_();
    selected_combination_ = new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(my_specification_);
  }

  public Vector get_roles_and_formal_parameters_() {
    Vector result_ = new Vector();
    Field_description_ fd;
    result_.addElement(new Name_type_pair_("system", "System"));
    result_.addElement(new Name_type_pair_("book", "Book"));
    result_.addElement(new Name_type_pair_("bookstore", "Bookstore"));
    result_.addElement(new Name_type_pair_("customer", "Customer"));
    fd = new Field_description_();
    fd.name = "now";
    fd.type = new Type_description_(Type_description_.TIME, 3);
    result_.addElement(fd);
    return result_;
  }
  public Value_description_ get_actual_parameter_( int param_number ){
    Value_description_ vd_ = null;
    if(param_number == 4){
      vd_ = new Value_description_(selected_combination_.$_now111.realval);
    } else {
      new Assertion(false, "Illegal param number for get_actual_parameter_()");
    }
    return vd_;
  }

  public void set_actual_parameter_(int param_number, Value_description_ value){
    if(param_number == 4){
      selected_combination_.$_now111.realval = value.realval;
      selected_combination_.$_now111.set_by_user_ = true;
      my_specification_.debug_("Setting actual parameter now for action search(System, Book, Bookstore, Customer)");
    } else {
      new Assertion(false,"Illegal param number for set_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public void unset_actual_parameter_(int param_number) {
    if(param_number == 4){
      selected_combination_.$_now111 = new Parameter_real_();
      selected_combination_.$_now111.set_by_user_ = false;
      my_specification_.debug_("Unsetting actual parameter now for action search(System, Book, Bookstore, Customer)");
    } else {
      new Assertion(false,"Illegal param number for unset_actual_parameter_");
    }
    my_specification_.debug_("selected_combination_ is");
    selected_combination_.debug_();
  }

  public boolean pick_participants_() {
    enabled_for_.generate_explicit_combinations_();
    enabled_for_.filter_participants_(selected_combination_);
    my_specification_.debug_("Picking participants for search(System, Book, Bookstore, Customer) from combinations");
    enabled_for_.debug_();
    Vector combs_vector_ = enabled_for_.to_vector_of_combination_();
    if(combs_vector_.size() == 0){
      my_specification_.debug_("No combination found");
      return false;
    }
    selected_combination_ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) (combs_vector_.elementAt(my_specification_.rand_.nextInt(combs_vector_.size())));
    my_specification_.debug_("The drawn combination: ");
    selected_combination_.debug_();
    return true;
  }

  public boolean pick_actual_parameters_(){
    my_specification_.debug_("pick_actual_parameters");
    new Assertion(selected_combination_.$_system107 != null, "Participant $_system107 == null");
    new Assertion(selected_combination_.$_book108 != null, "Participant $_book108 == null");
    new Assertion(selected_combination_.$_bookstore109 != null, "Participant $_bookstore109 == null");
    new Assertion(selected_combination_.$_customer110 != null, "Participant $_customer110 == null");
    $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ comb = enabled_for_.pick_actual_parameters_(selected_combination_);
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
    my_specification_.debug_("Executing action search(System, Book, Bookstore, Customer) for");
    selected_combination_.debug_();
    execute(selected_combination_.$_system107, selected_combination_.$_book108, selected_combination_.$_bookstore109, selected_combination_.$_customer110, selected_combination_.$_now111);
  }

  public void set_participant_(int role_number_, DisCo_class_ obj_) {
    if (role_number_ == 0) selected_combination_.$_system107 = ($_System3_interface_) obj_;
    else if (role_number_ == 1) selected_combination_.$_book108 = ($_Book0_interface_) obj_;
    else if (role_number_ == 2) selected_combination_.$_bookstore109 = ($_Bookstore4_interface_) obj_;
    else if (role_number_ == 3) selected_combination_.$_customer110 = ($_Customer2_interface_) obj_;
    else new Assertion(false, "Invalid role number for set_participant_");
  }

  public DisCo_class_ get_participant_(int role_number_) {
    if (role_number_ == 0) return (DisCo_class_) selected_combination_.$_system107;
    else if (role_number_ == 1) return (DisCo_class_) selected_combination_.$_book108;
    else if (role_number_ == 2) return (DisCo_class_) selected_combination_.$_bookstore109;
    else if (role_number_ == 3) return (DisCo_class_) selected_combination_.$_customer110;
    else {
    new Assertion(false, "Invalid role number for get_participant_");
    return null;
    }
  }

  public void clear_participants_() {
    selected_combination_ = new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(null, null, null, null, my_specification_);
  }
  public void fix_parameters_() {
    for(Iterator iter = enabled_for_.combinations.iterator(); iter.hasNext(); ){
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ comb_ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if (!comb_.$_now111.setValue()) {
        new Assertion(false, "Cannot fix parameter 'now' for action search(System, Book, Bookstore, Customer)");
      }
    }
    enabled_for_.remove_invalid_combinations_();
  }
}

class Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ implements Serializable {
  Set combinations = new TreeSet();

  DisCo_specification_ my_specification_ = null;
  public Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
    combinations.add(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(null, null, null, null, my_specification_));
  }

  public void generate_explicit_combinations_$_system107() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_system107 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_system107() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_book108() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_book108 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_book108() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_bookstore109() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_bookstore109 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_bookstore109() );
      }
    }
    combinations.addAll(TMP_combinations);
    remove_invalid_combinations_();
  }
  public void generate_explicit_combinations_$_customer110() {
    Set TMP_combinations = new TreeSet();    for (Iterator iter = combinations.iterator(); iter.hasNext(); ) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if( $$$_ccc_$$$.$_customer110 == null ) {
        $$$_ccc_$$$.set_invalid_();
        TMP_combinations.addAll($$$_ccc_$$$.generate_explicit_combinations_$_customer110() );
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
      tmp_combinations.addAll((($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_system107());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_book108());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_bookstore109());
    }
    combinations = tmp_combinations;

    tmp_combinations = new TreeSet();
    combs_iter_ = combinations.iterator();
    while (combs_iter_.hasNext()) {
      tmp_combinations.addAll((($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_)combs_iter_.next()).generate_explicit_combinations_$_customer110());
    }
    combinations = tmp_combinations;

  }

  public void filter_participants_($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ comb){
    for (Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_ccc_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if(comb.$_system107 != null && (($_System3) (comb.$_system107)).objectID_ != (($_System3) ($$$_ccc_$$$.$_system107)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_book108 != null && (($_Book0) (comb.$_book108)).objectID_ != (($_Book0) ($$$_ccc_$$$.$_book108)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_bookstore109 != null && (($_Bookstore4) (comb.$_bookstore109)).objectID_ != (($_Bookstore4) ($$$_ccc_$$$.$_bookstore109)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
      if(comb.$_customer110 != null && (($_Customer2) (comb.$_customer110)).objectID_ != (($_Customer2) ($$$_ccc_$$$.$_customer110)).objectID_){
        $$$_ccc_$$$.set_invalid_();
      }
    }
    remove_invalid_combinations_();
  }

  public void debug_() {
    my_specification_.debug_("Combinations: ");
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      (($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next()).debug_();
    }
  }

  public $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ pick_actual_parameters_($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ selected_combination) {
    for(Iterator iter = combinations.iterator(); iter.hasNext(); ){
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ comb = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) (iter.next());
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
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_  comb_to_add_ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      result_.addElement(comb_to_add_);
    }
    return result_;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    Iterator  iter = combinations.iterator();
    while(iter.hasNext()) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ comb_to_add_ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      result_.addElement(comb_to_add_.to_vector_());
    }
    return result_;
  }

  public void clear() {
    combinations = new TreeSet();
  }

  public void add_combination_($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ comb_) {
    combinations.add(comb_);
  }

  public boolean empty() {
    return combinations.isEmpty();
  }

  public Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ combine(Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ other_) {
    Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_ result = new Combinations_$_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_(my_specification_);

    result.clear();
    Iterator myelems = combinations.iterator();
    while (myelems.hasNext()) {
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ mycomb = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) myelems.next();
      Iterator otherselems = other_.combinations.iterator();
      while (otherselems.hasNext()) {
        $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ otherscomb = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) otherselems.next();
        $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ resultcomb = mycomb.combine(otherscomb);
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
      $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ c = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_) iter.next();
      if (!c.invalid_()) {
        TMP_combinations.add(c);
      }
    }
    combinations = TMP_combinations;
  }
}

class $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ implements Serializable, Comparable {
  boolean invalid_ = false;
  $_System3_interface_ $_system107 = null;
  $_Book0_interface_ $_book108 = null;
  $_Bookstore4_interface_ $_bookstore109 = null;
  $_Customer2_interface_ $_customer110 = null;
  Parameter_real_ $_now111 = new Parameter_real_();
  DisCo_specification_ my_specification_ = null;

  public $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(DisCo_specification_ my_specification) {
    my_specification_ = my_specification;
  }

  public $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_($_System3_interface_ $_system107, $_Book0_interface_ $_book108, $_Bookstore4_interface_ $_bookstore109, $_Customer2_interface_ $_customer110, DisCo_specification_ my_specification) {
    this.$_system107 = $_system107;
    this.$_book108 = $_book108;
    this.$_bookstore109 = $_bookstore109;
    this.$_customer110 = $_customer110;
    my_specification_ = my_specification;
    my_specification_.rt_.set_implicit_restrictions_($_now111);
  }

  public void set_invalid_() {
    invalid_ = true;
  }

  public int compareTo(Object o){
    $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ $$$_other_$$$ = ($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_)o;
    DisCo_class_ $$_other_$_system107 = ((DisCo_class_) $$$_other_$$$.$_system107);
    DisCo_class_ $$_other_$_book108 = ((DisCo_class_) $$$_other_$$$.$_book108);
    DisCo_class_ $$_other_$_bookstore109 = ((DisCo_class_) $$$_other_$$$.$_bookstore109);
    DisCo_class_ $$_other_$_customer110 = ((DisCo_class_) $$$_other_$$$.$_customer110);
    if($_system107 == null && $$_other_$_system107 != null){
      return -1;
    }
    if($_system107 != null && $$_other_$_system107 == null){
      return 1;
    }
    if($_system107 != null && $$_other_$_system107!= null && ((DisCo_class_) $_system107).objectID_ != $$_other_$_system107.objectID_){
      return ((DisCo_class_) $_system107).objectID_ - $$_other_$_system107.objectID_;
    }
    if($_book108 == null && $$_other_$_book108 != null){
      return -1;
    }
    if($_book108 != null && $$_other_$_book108 == null){
      return 1;
    }
    if($_book108 != null && $$_other_$_book108!= null && ((DisCo_class_) $_book108).objectID_ != $$_other_$_book108.objectID_){
      return ((DisCo_class_) $_book108).objectID_ - $$_other_$_book108.objectID_;
    }
    if($_bookstore109 == null && $$_other_$_bookstore109 != null){
      return -1;
    }
    if($_bookstore109 != null && $$_other_$_bookstore109 == null){
      return 1;
    }
    if($_bookstore109 != null && $$_other_$_bookstore109!= null && ((DisCo_class_) $_bookstore109).objectID_ != $$_other_$_bookstore109.objectID_){
      return ((DisCo_class_) $_bookstore109).objectID_ - $$_other_$_bookstore109.objectID_;
    }
    if($_customer110 == null && $$_other_$_customer110 != null){
      return -1;
    }
    if($_customer110 != null && $$_other_$_customer110 == null){
      return 1;
    }
    if($_customer110 != null && $$_other_$_customer110!= null && ((DisCo_class_) $_customer110).objectID_ != $$_other_$_customer110.objectID_){
      return ((DisCo_class_) $_customer110).objectID_ - $$_other_$_customer110.objectID_;
    }
    return 0;
  }

  public Vector generate_explicit_combinations_$_system107() {
    Vector ret = new Vector();
    if($_system107 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_System3").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(($_System3_interface_)iter_.nextElement(), $_book108, $_bookstore109, $_customer110, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_book108() {
    Vector ret = new Vector();
    if($_book108 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Book0").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_($_system107, ($_Book0_interface_)iter_.nextElement(), $_bookstore109, $_customer110, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_bookstore109() {
    Vector ret = new Vector();
    if($_bookstore109 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Bookstore4").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_($_system107, $_book108, ($_Bookstore4_interface_)iter_.nextElement(), $_customer110, my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public Vector generate_explicit_combinations_$_customer110() {
    Vector ret = new Vector();
    if($_customer110 == null){
      Enumeration iter_ = my_specification_.get_objects_("$_Customer2").elements();
      while(iter_.hasMoreElements()){
        ret.add(new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_($_system107, $_book108, $_bookstore109, ($_Customer2_interface_)iter_.nextElement(), my_specification_));
      }
    } else {
      ret.add(this);
    }
    return ret;
  }

  public void debug_() {
    my_specification_.debug_("combination: "
       + "system=" + ($_system107 == null ? "<any>" : $_system107.toString()) + ", "
       + "book=" + ($_book108 == null ? "<any>" : $_book108.toString()) + ", "
       + "bookstore=" + ($_bookstore109 == null ? "<any>" : $_bookstore109.toString()) + ", "
       + "customer=" + ($_customer110 == null ? "<any>" : $_customer110.toString()) + ", "
       + "now=" + ($_now111 == null ? "<any>" : $_now111.toString()) + ", ");
  }

  public boolean equal_participants_($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ trial) {
    return $_system107 != null && $_system107 == trial.$_system107  && $_book108 != null && $_book108 == trial.$_book108  && $_bookstore109 != null && $_bookstore109 == trial.$_bookstore109  && $_customer110 != null && $_customer110 == trial.$_customer110 ;
  }

  public Vector to_vector_() {
    Vector result_ = new Vector();
    result_.addElement($_system107);
    result_.addElement($_book108);
    result_.addElement($_bookstore109);
    result_.addElement($_customer110);
    return result_;
  }

  public $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ clone_() {
    return new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_($_system107, $_book108, $_bookstore109, $_customer110, my_specification_);
  }

  public boolean invalid_() {
    if ($_system107 != null && $_system107 == $_book108) return true;
    if ($_system107 != null && $_system107 == $_bookstore109) return true;
    if ($_system107 != null && $_system107 == $_customer110) return true;
    if ($_book108 != null && $_book108 == $_bookstore109) return true;
    if ($_book108 != null && $_book108 == $_customer110) return true;
    if ($_bookstore109 != null && $_bookstore109 == $_customer110) return true;
    return invalid_;
  }

  public $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ combine($_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ other_) {
    $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_ result_ = new $_search$$$_System3$$$_Book0$$$_Bookstore4$$$_Customer2$$_combination_(null, null, null, null, my_specification_);
    if ($_system107 == null) {
      result_.$_system107 = other_.$_system107;
    }
    else if (other_.$_system107 == null) {
      result_.$_system107 = $_system107;
    }
    else if($_system107 == other_.$_system107) {
      result_.$_system107 = $_system107;
    }
    else return null;

    if ($_book108 == null) {
      result_.$_book108 = other_.$_book108;
    }
    else if (other_.$_book108 == null) {
      result_.$_book108 = $_book108;
    }
    else if($_book108 == other_.$_book108) {
      result_.$_book108 = $_book108;
    }
    else return null;

    if ($_bookstore109 == null) {
      result_.$_bookstore109 = other_.$_bookstore109;
    }
    else if (other_.$_bookstore109 == null) {
      result_.$_bookstore109 = $_bookstore109;
    }
    else if($_bookstore109 == other_.$_bookstore109) {
      result_.$_bookstore109 = $_bookstore109;
    }
    else return null;

    if ($_customer110 == null) {
      result_.$_customer110 = other_.$_customer110;
    }
    else if (other_.$_customer110 == null) {
      result_.$_customer110 = $_customer110;
    }
    else if($_customer110 == other_.$_customer110) {
      result_.$_customer110 = $_customer110;
    }
    else return null;

    return result_;
  }
}

class Functions_ {
}

