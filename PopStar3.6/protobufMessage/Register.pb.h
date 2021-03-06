// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Register.proto

#ifndef PROTOBUF_Register_2eproto__INCLUDED
#define PROTOBUF_Register_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 2006000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 2006001 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/unknown_field_set.h>
#include "MessageBase.pb.h"
// @@protoc_insertion_point(includes)

// Internal implementation detail -- do not call these.
void  protobuf_AddDesc_Register_2eproto();
void protobuf_AssignDesc_Register_2eproto();
void protobuf_ShutdownFile_Register_2eproto();

class RegisterMsg;

// ===================================================================

class RegisterMsg : public ::google::protobuf::Message {
 public:
  RegisterMsg();
  virtual ~RegisterMsg();

  RegisterMsg(const RegisterMsg& from);

  inline RegisterMsg& operator=(const RegisterMsg& from) {
    CopyFrom(from);
    return *this;
  }

  inline const ::google::protobuf::UnknownFieldSet& unknown_fields() const {
    return _unknown_fields_;
  }

  inline ::google::protobuf::UnknownFieldSet* mutable_unknown_fields() {
    return &_unknown_fields_;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const RegisterMsg& default_instance();

  void Swap(RegisterMsg* other);

  // implements Message ----------------------------------------------

  RegisterMsg* New() const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const RegisterMsg& from);
  void MergeFrom(const RegisterMsg& from);
  void Clear();
  bool IsInitialized() const;

  int ByteSize() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const;
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  public:
  ::google::protobuf::Metadata GetMetadata() const;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // required .MessageBase msgbase = 1;
  inline bool has_msgbase() const;
  inline void clear_msgbase();
  static const int kMsgbaseFieldNumber = 1;
  inline const ::MessageBase& msgbase() const;
  inline ::MessageBase* mutable_msgbase();
  inline ::MessageBase* release_msgbase();
  inline void set_allocated_msgbase(::MessageBase* msgbase);

  // required string account = 2;
  inline bool has_account() const;
  inline void clear_account();
  static const int kAccountFieldNumber = 2;
  inline const ::std::string& account() const;
  inline void set_account(const ::std::string& value);
  inline void set_account(const char* value);
  inline void set_account(const char* value, size_t size);
  inline ::std::string* mutable_account();
  inline ::std::string* release_account();
  inline void set_allocated_account(::std::string* account);

  // required string password = 3;
  inline bool has_password() const;
  inline void clear_password();
  static const int kPasswordFieldNumber = 3;
  inline const ::std::string& password() const;
  inline void set_password(const ::std::string& value);
  inline void set_password(const char* value);
  inline void set_password(const char* value, size_t size);
  inline ::std::string* mutable_password();
  inline ::std::string* release_password();
  inline void set_allocated_password(::std::string* password);

  // optional string name = 4;
  inline bool has_name() const;
  inline void clear_name();
  static const int kNameFieldNumber = 4;
  inline const ::std::string& name() const;
  inline void set_name(const ::std::string& value);
  inline void set_name(const char* value);
  inline void set_name(const char* value, size_t size);
  inline ::std::string* mutable_name();
  inline ::std::string* release_name();
  inline void set_allocated_name(::std::string* name);

  // optional int32 age = 5;
  inline bool has_age() const;
  inline void clear_age();
  static const int kAgeFieldNumber = 5;
  inline ::google::protobuf::int32 age() const;
  inline void set_age(::google::protobuf::int32 value);

  // optional int32 sex = 6;
  inline bool has_sex() const;
  inline void clear_sex();
  static const int kSexFieldNumber = 6;
  inline ::google::protobuf::int32 sex() const;
  inline void set_sex(::google::protobuf::int32 value);

  // optional string telephone = 7;
  inline bool has_telephone() const;
  inline void clear_telephone();
  static const int kTelephoneFieldNumber = 7;
  inline const ::std::string& telephone() const;
  inline void set_telephone(const ::std::string& value);
  inline void set_telephone(const char* value);
  inline void set_telephone(const char* value, size_t size);
  inline ::std::string* mutable_telephone();
  inline ::std::string* release_telephone();
  inline void set_allocated_telephone(::std::string* telephone);

  // optional string idcard = 8;
  inline bool has_idcard() const;
  inline void clear_idcard();
  static const int kIdcardFieldNumber = 8;
  inline const ::std::string& idcard() const;
  inline void set_idcard(const ::std::string& value);
  inline void set_idcard(const char* value);
  inline void set_idcard(const char* value, size_t size);
  inline ::std::string* mutable_idcard();
  inline ::std::string* release_idcard();
  inline void set_allocated_idcard(::std::string* idcard);

  // @@protoc_insertion_point(class_scope:RegisterMsg)
 private:
  inline void set_has_msgbase();
  inline void clear_has_msgbase();
  inline void set_has_account();
  inline void clear_has_account();
  inline void set_has_password();
  inline void clear_has_password();
  inline void set_has_name();
  inline void clear_has_name();
  inline void set_has_age();
  inline void clear_has_age();
  inline void set_has_sex();
  inline void clear_has_sex();
  inline void set_has_telephone();
  inline void clear_has_telephone();
  inline void set_has_idcard();
  inline void clear_has_idcard();

  ::google::protobuf::UnknownFieldSet _unknown_fields_;

  ::google::protobuf::uint32 _has_bits_[1];
  mutable int _cached_size_;
  ::MessageBase* msgbase_;
  ::std::string* account_;
  ::std::string* password_;
  ::std::string* name_;
  ::google::protobuf::int32 age_;
  ::google::protobuf::int32 sex_;
  ::std::string* telephone_;
  ::std::string* idcard_;
  friend void  protobuf_AddDesc_Register_2eproto();
  friend void protobuf_AssignDesc_Register_2eproto();
  friend void protobuf_ShutdownFile_Register_2eproto();

  void InitAsDefaultInstance();
  static RegisterMsg* default_instance_;
};
// ===================================================================


// ===================================================================

// RegisterMsg

// required .MessageBase msgbase = 1;
inline bool RegisterMsg::has_msgbase() const {
  return (_has_bits_[0] & 0x00000001u) != 0;
}
inline void RegisterMsg::set_has_msgbase() {
  _has_bits_[0] |= 0x00000001u;
}
inline void RegisterMsg::clear_has_msgbase() {
  _has_bits_[0] &= ~0x00000001u;
}
inline void RegisterMsg::clear_msgbase() {
  if (msgbase_ != NULL) msgbase_->::MessageBase::Clear();
  clear_has_msgbase();
}
inline const ::MessageBase& RegisterMsg::msgbase() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.msgbase)
  return msgbase_ != NULL ? *msgbase_ : *default_instance_->msgbase_;
}
inline ::MessageBase* RegisterMsg::mutable_msgbase() {
  set_has_msgbase();
  if (msgbase_ == NULL) msgbase_ = new ::MessageBase;
  // @@protoc_insertion_point(field_mutable:RegisterMsg.msgbase)
  return msgbase_;
}
inline ::MessageBase* RegisterMsg::release_msgbase() {
  clear_has_msgbase();
  ::MessageBase* temp = msgbase_;
  msgbase_ = NULL;
  return temp;
}
inline void RegisterMsg::set_allocated_msgbase(::MessageBase* msgbase) {
  delete msgbase_;
  msgbase_ = msgbase;
  if (msgbase) {
    set_has_msgbase();
  } else {
    clear_has_msgbase();
  }
  // @@protoc_insertion_point(field_set_allocated:RegisterMsg.msgbase)
}

// required string account = 2;
inline bool RegisterMsg::has_account() const {
  return (_has_bits_[0] & 0x00000002u) != 0;
}
inline void RegisterMsg::set_has_account() {
  _has_bits_[0] |= 0x00000002u;
}
inline void RegisterMsg::clear_has_account() {
  _has_bits_[0] &= ~0x00000002u;
}
inline void RegisterMsg::clear_account() {
  if (account_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    account_->clear();
  }
  clear_has_account();
}
inline const ::std::string& RegisterMsg::account() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.account)
  return *account_;
}
inline void RegisterMsg::set_account(const ::std::string& value) {
  set_has_account();
  if (account_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    account_ = new ::std::string;
  }
  account_->assign(value);
  // @@protoc_insertion_point(field_set:RegisterMsg.account)
}
inline void RegisterMsg::set_account(const char* value) {
  set_has_account();
  if (account_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    account_ = new ::std::string;
  }
  account_->assign(value);
  // @@protoc_insertion_point(field_set_char:RegisterMsg.account)
}
inline void RegisterMsg::set_account(const char* value, size_t size) {
  set_has_account();
  if (account_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    account_ = new ::std::string;
  }
  account_->assign(reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_set_pointer:RegisterMsg.account)
}
inline ::std::string* RegisterMsg::mutable_account() {
  set_has_account();
  if (account_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    account_ = new ::std::string;
  }
  // @@protoc_insertion_point(field_mutable:RegisterMsg.account)
  return account_;
}
inline ::std::string* RegisterMsg::release_account() {
  clear_has_account();
  if (account_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    return NULL;
  } else {
    ::std::string* temp = account_;
    account_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
    return temp;
  }
}
inline void RegisterMsg::set_allocated_account(::std::string* account) {
  if (account_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    delete account_;
  }
  if (account) {
    set_has_account();
    account_ = account;
  } else {
    clear_has_account();
    account_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  }
  // @@protoc_insertion_point(field_set_allocated:RegisterMsg.account)
}

// required string password = 3;
inline bool RegisterMsg::has_password() const {
  return (_has_bits_[0] & 0x00000004u) != 0;
}
inline void RegisterMsg::set_has_password() {
  _has_bits_[0] |= 0x00000004u;
}
inline void RegisterMsg::clear_has_password() {
  _has_bits_[0] &= ~0x00000004u;
}
inline void RegisterMsg::clear_password() {
  if (password_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    password_->clear();
  }
  clear_has_password();
}
inline const ::std::string& RegisterMsg::password() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.password)
  return *password_;
}
inline void RegisterMsg::set_password(const ::std::string& value) {
  set_has_password();
  if (password_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    password_ = new ::std::string;
  }
  password_->assign(value);
  // @@protoc_insertion_point(field_set:RegisterMsg.password)
}
inline void RegisterMsg::set_password(const char* value) {
  set_has_password();
  if (password_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    password_ = new ::std::string;
  }
  password_->assign(value);
  // @@protoc_insertion_point(field_set_char:RegisterMsg.password)
}
inline void RegisterMsg::set_password(const char* value, size_t size) {
  set_has_password();
  if (password_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    password_ = new ::std::string;
  }
  password_->assign(reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_set_pointer:RegisterMsg.password)
}
inline ::std::string* RegisterMsg::mutable_password() {
  set_has_password();
  if (password_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    password_ = new ::std::string;
  }
  // @@protoc_insertion_point(field_mutable:RegisterMsg.password)
  return password_;
}
inline ::std::string* RegisterMsg::release_password() {
  clear_has_password();
  if (password_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    return NULL;
  } else {
    ::std::string* temp = password_;
    password_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
    return temp;
  }
}
inline void RegisterMsg::set_allocated_password(::std::string* password) {
  if (password_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    delete password_;
  }
  if (password) {
    set_has_password();
    password_ = password;
  } else {
    clear_has_password();
    password_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  }
  // @@protoc_insertion_point(field_set_allocated:RegisterMsg.password)
}

// optional string name = 4;
inline bool RegisterMsg::has_name() const {
  return (_has_bits_[0] & 0x00000008u) != 0;
}
inline void RegisterMsg::set_has_name() {
  _has_bits_[0] |= 0x00000008u;
}
inline void RegisterMsg::clear_has_name() {
  _has_bits_[0] &= ~0x00000008u;
}
inline void RegisterMsg::clear_name() {
  if (name_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    name_->clear();
  }
  clear_has_name();
}
inline const ::std::string& RegisterMsg::name() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.name)
  return *name_;
}
inline void RegisterMsg::set_name(const ::std::string& value) {
  set_has_name();
  if (name_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    name_ = new ::std::string;
  }
  name_->assign(value);
  // @@protoc_insertion_point(field_set:RegisterMsg.name)
}
inline void RegisterMsg::set_name(const char* value) {
  set_has_name();
  if (name_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    name_ = new ::std::string;
  }
  name_->assign(value);
  // @@protoc_insertion_point(field_set_char:RegisterMsg.name)
}
inline void RegisterMsg::set_name(const char* value, size_t size) {
  set_has_name();
  if (name_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    name_ = new ::std::string;
  }
  name_->assign(reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_set_pointer:RegisterMsg.name)
}
inline ::std::string* RegisterMsg::mutable_name() {
  set_has_name();
  if (name_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    name_ = new ::std::string;
  }
  // @@protoc_insertion_point(field_mutable:RegisterMsg.name)
  return name_;
}
inline ::std::string* RegisterMsg::release_name() {
  clear_has_name();
  if (name_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    return NULL;
  } else {
    ::std::string* temp = name_;
    name_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
    return temp;
  }
}
inline void RegisterMsg::set_allocated_name(::std::string* name) {
  if (name_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    delete name_;
  }
  if (name) {
    set_has_name();
    name_ = name;
  } else {
    clear_has_name();
    name_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  }
  // @@protoc_insertion_point(field_set_allocated:RegisterMsg.name)
}

// optional int32 age = 5;
inline bool RegisterMsg::has_age() const {
  return (_has_bits_[0] & 0x00000010u) != 0;
}
inline void RegisterMsg::set_has_age() {
  _has_bits_[0] |= 0x00000010u;
}
inline void RegisterMsg::clear_has_age() {
  _has_bits_[0] &= ~0x00000010u;
}
inline void RegisterMsg::clear_age() {
  age_ = 0;
  clear_has_age();
}
inline ::google::protobuf::int32 RegisterMsg::age() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.age)
  return age_;
}
inline void RegisterMsg::set_age(::google::protobuf::int32 value) {
  set_has_age();
  age_ = value;
  // @@protoc_insertion_point(field_set:RegisterMsg.age)
}

// optional int32 sex = 6;
inline bool RegisterMsg::has_sex() const {
  return (_has_bits_[0] & 0x00000020u) != 0;
}
inline void RegisterMsg::set_has_sex() {
  _has_bits_[0] |= 0x00000020u;
}
inline void RegisterMsg::clear_has_sex() {
  _has_bits_[0] &= ~0x00000020u;
}
inline void RegisterMsg::clear_sex() {
  sex_ = 0;
  clear_has_sex();
}
inline ::google::protobuf::int32 RegisterMsg::sex() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.sex)
  return sex_;
}
inline void RegisterMsg::set_sex(::google::protobuf::int32 value) {
  set_has_sex();
  sex_ = value;
  // @@protoc_insertion_point(field_set:RegisterMsg.sex)
}

// optional string telephone = 7;
inline bool RegisterMsg::has_telephone() const {
  return (_has_bits_[0] & 0x00000040u) != 0;
}
inline void RegisterMsg::set_has_telephone() {
  _has_bits_[0] |= 0x00000040u;
}
inline void RegisterMsg::clear_has_telephone() {
  _has_bits_[0] &= ~0x00000040u;
}
inline void RegisterMsg::clear_telephone() {
  if (telephone_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    telephone_->clear();
  }
  clear_has_telephone();
}
inline const ::std::string& RegisterMsg::telephone() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.telephone)
  return *telephone_;
}
inline void RegisterMsg::set_telephone(const ::std::string& value) {
  set_has_telephone();
  if (telephone_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    telephone_ = new ::std::string;
  }
  telephone_->assign(value);
  // @@protoc_insertion_point(field_set:RegisterMsg.telephone)
}
inline void RegisterMsg::set_telephone(const char* value) {
  set_has_telephone();
  if (telephone_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    telephone_ = new ::std::string;
  }
  telephone_->assign(value);
  // @@protoc_insertion_point(field_set_char:RegisterMsg.telephone)
}
inline void RegisterMsg::set_telephone(const char* value, size_t size) {
  set_has_telephone();
  if (telephone_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    telephone_ = new ::std::string;
  }
  telephone_->assign(reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_set_pointer:RegisterMsg.telephone)
}
inline ::std::string* RegisterMsg::mutable_telephone() {
  set_has_telephone();
  if (telephone_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    telephone_ = new ::std::string;
  }
  // @@protoc_insertion_point(field_mutable:RegisterMsg.telephone)
  return telephone_;
}
inline ::std::string* RegisterMsg::release_telephone() {
  clear_has_telephone();
  if (telephone_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    return NULL;
  } else {
    ::std::string* temp = telephone_;
    telephone_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
    return temp;
  }
}
inline void RegisterMsg::set_allocated_telephone(::std::string* telephone) {
  if (telephone_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    delete telephone_;
  }
  if (telephone) {
    set_has_telephone();
    telephone_ = telephone;
  } else {
    clear_has_telephone();
    telephone_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  }
  // @@protoc_insertion_point(field_set_allocated:RegisterMsg.telephone)
}

// optional string idcard = 8;
inline bool RegisterMsg::has_idcard() const {
  return (_has_bits_[0] & 0x00000080u) != 0;
}
inline void RegisterMsg::set_has_idcard() {
  _has_bits_[0] |= 0x00000080u;
}
inline void RegisterMsg::clear_has_idcard() {
  _has_bits_[0] &= ~0x00000080u;
}
inline void RegisterMsg::clear_idcard() {
  if (idcard_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    idcard_->clear();
  }
  clear_has_idcard();
}
inline const ::std::string& RegisterMsg::idcard() const {
  // @@protoc_insertion_point(field_get:RegisterMsg.idcard)
  return *idcard_;
}
inline void RegisterMsg::set_idcard(const ::std::string& value) {
  set_has_idcard();
  if (idcard_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    idcard_ = new ::std::string;
  }
  idcard_->assign(value);
  // @@protoc_insertion_point(field_set:RegisterMsg.idcard)
}
inline void RegisterMsg::set_idcard(const char* value) {
  set_has_idcard();
  if (idcard_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    idcard_ = new ::std::string;
  }
  idcard_->assign(value);
  // @@protoc_insertion_point(field_set_char:RegisterMsg.idcard)
}
inline void RegisterMsg::set_idcard(const char* value, size_t size) {
  set_has_idcard();
  if (idcard_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    idcard_ = new ::std::string;
  }
  idcard_->assign(reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_set_pointer:RegisterMsg.idcard)
}
inline ::std::string* RegisterMsg::mutable_idcard() {
  set_has_idcard();
  if (idcard_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    idcard_ = new ::std::string;
  }
  // @@protoc_insertion_point(field_mutable:RegisterMsg.idcard)
  return idcard_;
}
inline ::std::string* RegisterMsg::release_idcard() {
  clear_has_idcard();
  if (idcard_ == &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    return NULL;
  } else {
    ::std::string* temp = idcard_;
    idcard_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
    return temp;
  }
}
inline void RegisterMsg::set_allocated_idcard(::std::string* idcard) {
  if (idcard_ != &::google::protobuf::internal::GetEmptyStringAlreadyInited()) {
    delete idcard_;
  }
  if (idcard) {
    set_has_idcard();
    idcard_ = idcard;
  } else {
    clear_has_idcard();
    idcard_ = const_cast< ::std::string*>(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  }
  // @@protoc_insertion_point(field_set_allocated:RegisterMsg.idcard)
}


// @@protoc_insertion_point(namespace_scope)

#ifndef SWIG
namespace google {
namespace protobuf {


}  // namespace google
}  // namespace protobuf
#endif  // SWIG

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_Register_2eproto__INCLUDED
