/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.message.thrift.actor;

/**
 * 操作命令
 */
public enum Operation implements org.apache.thrift.TEnum {
  /**
   * 获取空间ID
   */
  AREA_GET_ID(0),
  /**
   * 用户进入空间
   */
  AREA_USER_ENTER_AREA(1),
  /**
   * 用户离开空间
   */
  AREA_USER_LEAVE_AREA(2),
  /**
   * 创建格子
   */
  AREA_CREATE_GRID(3),
  /**
   * 删除格子
   */
  AREA_REMOVE_GRID(4),
  /**
   * 根据格子ID获取格子
   */
  AREA_GET_GRID_BY_ID(5),
  /**
   * 获取全部格子
   */
  AREA_GET_ALL_GRID(6),
  /**
   * 区域广播给所有用户信息
   */
  AREA_BROADCAST_ALL_USER(7),
  USER_IS_CONNECTED(8),
  USER_DISCONNECT(9),
  USER_RECIVE_IOSESSION_MESSAGE(10),
  USER_RE_BINDUSER_IOSESSION_ACTOR(11),
  USER_GET_IUSER(12),
  USER_SEND_PACKET_TO_IOSESSION(13),
  /**
   * 用户进入空间
   */
  USER_ENTER_AREA(14),
  /**
   * 用户离开空间
   */
  USER_LEAVE_AREA(15),
  /**
   * 用户进入格子
   */
  USER_ENTER_GRID(16),
  /**
   * 用户离开格子
   */
  USER_LEAVE_GRID(17),
  SESSION_USER_LOGOUT(18),
  SESSION_USER_CONNECT_TO_SERVER(19),
  SESSION_ENTER_WORLD(20),
  SESSION_USER_SEND_PACKET(21),
  SESSION_RECIVE_PACKET(22),
  SESSION_REBIND_USER(23),
  CLUSER_INIT(24),
  CLUSER_HELLO(25),
  CLUSER_SEND(26),
  CLUSER_RECIVE(27),
  WORLD_INITIALIZE(28),
  WORLD_USER_CONNECT_2_WORLD(29),
  WORLD_USER_RECONNECTION_TRY(30),
  WORLD_CREATE_USER_RESULT(31),
  WORLD_NER_SERVER_COMING(32),
  WORLD_HAND_SHAKE(33),
  AREA_MANAGER_CREATE_AREA(34),
  AREA_MANAGER_REMOVE_AREA(35),
  AREA_MANAGER_GET_AREA_BY_ID(36),
  AREA_MANAGER_GET_ALL_AREA(37),
  USER_MANAGER_CREATE_USER(38),
  USER_MANAGER_REMOVE_USER(39),
  USER_MANAGER_CREATE_USER_WITH_SESSION(40),
  USER_MANAGER_SESSION_REBING_USER(41),
  USER_MANAGER_CREATE_USER_RESULT(42);

  private final int value;

  private Operation(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Operation findByValue(int value) { 
    switch (value) {
      case 0:
        return AREA_GET_ID;
      case 1:
        return AREA_USER_ENTER_AREA;
      case 2:
        return AREA_USER_LEAVE_AREA;
      case 3:
        return AREA_CREATE_GRID;
      case 4:
        return AREA_REMOVE_GRID;
      case 5:
        return AREA_GET_GRID_BY_ID;
      case 6:
        return AREA_GET_ALL_GRID;
      case 7:
        return AREA_BROADCAST_ALL_USER;
      case 8:
        return USER_IS_CONNECTED;
      case 9:
        return USER_DISCONNECT;
      case 10:
        return USER_RECIVE_IOSESSION_MESSAGE;
      case 11:
        return USER_RE_BINDUSER_IOSESSION_ACTOR;
      case 12:
        return USER_GET_IUSER;
      case 13:
        return USER_SEND_PACKET_TO_IOSESSION;
      case 14:
        return USER_ENTER_AREA;
      case 15:
        return USER_LEAVE_AREA;
      case 16:
        return USER_ENTER_GRID;
      case 17:
        return USER_LEAVE_GRID;
      case 18:
        return SESSION_USER_LOGOUT;
      case 19:
        return SESSION_USER_CONNECT_TO_SERVER;
      case 20:
        return SESSION_ENTER_WORLD;
      case 21:
        return SESSION_USER_SEND_PACKET;
      case 22:
        return SESSION_RECIVE_PACKET;
      case 23:
        return SESSION_REBIND_USER;
      case 24:
        return CLUSER_INIT;
      case 25:
        return CLUSER_HELLO;
      case 26:
        return CLUSER_SEND;
      case 27:
        return CLUSER_RECIVE;
      case 28:
        return WORLD_INITIALIZE;
      case 29:
        return WORLD_USER_CONNECT_2_WORLD;
      case 30:
        return WORLD_USER_RECONNECTION_TRY;
      case 31:
        return WORLD_CREATE_USER_RESULT;
      case 32:
        return WORLD_NER_SERVER_COMING;
      case 33:
        return WORLD_HAND_SHAKE;
      case 34:
        return AREA_MANAGER_CREATE_AREA;
      case 35:
        return AREA_MANAGER_REMOVE_AREA;
      case 36:
        return AREA_MANAGER_GET_AREA_BY_ID;
      case 37:
        return AREA_MANAGER_GET_ALL_AREA;
      case 38:
        return USER_MANAGER_CREATE_USER;
      case 39:
        return USER_MANAGER_REMOVE_USER;
      case 40:
        return USER_MANAGER_CREATE_USER_WITH_SESSION;
      case 41:
        return USER_MANAGER_SESSION_REBING_USER;
      case 42:
        return USER_MANAGER_CREATE_USER_RESULT;
      default:
        return null;
    }
  }
}
